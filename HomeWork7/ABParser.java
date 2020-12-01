package HomeWork7;

import HomeWork7.Beans.Rate;
import HomeWork7.Interfaces.IParser;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ABParser implements IParser {
    @Override
    public List<Rate> getRate(String data, SiteLoader.Currency currency) {
        final int INTEND_LEFT = 11;
        final int INTEND_RIGHT = data.length() - 4;
        final int SELL_RATE = 0;
        final int SELL_ISO = 1;
        final int BUY_RATE = 3;
        final int DATE = 8;
        final String NUMBER = "(\\d+.\\d+)";
        final String BUY_ISO_BYN = "\"buyIso\":\"BYN\"";
        final String SELL = "\"sellIso\":\"" + currency + "\"";
        final String DATE_REG = "(\\d{4})-(\\d{2})-(\\d{2})";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Pattern pattern;
        Matcher matcher;
        data = data.substring(INTEND_LEFT, INTEND_RIGHT);
        List<Rate> rateList = new LinkedList<>();
        String[] rates = data.split("},\\{");
        String[] rateFields;
        for (String rateStr: rates) {
            if(rateStr.contains(BUY_ISO_BYN)) {
                rateFields = rateStr.split(",");
                if(rateFields[SELL_ISO].equals(SELL)) {
                    Rate rate = new Rate();
                    rate.setSellIso(currency);
                    pattern = Pattern.compile(NUMBER);
                    matcher = pattern.matcher(rateFields[SELL_RATE]);
                    if (matcher.find()) {
                        rate.setSellRate(Double.parseDouble(matcher.group()));
                    }
                    matcher = pattern.matcher(rateFields[BUY_RATE]);
                    if (matcher.find()) {
                        rate.setBuyRate(Double.parseDouble(matcher.group()));
                    }
                    pattern = Pattern.compile(DATE_REG);
                    matcher = pattern.matcher(rateFields[DATE]);
                    if(matcher.find()) {
                        try {
                            rate.setDate(simpleDateFormat.parse(matcher.group()));
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                    }
                    rateList.add(rate);
                }
            }
        }
        return rateList;
    }
}
