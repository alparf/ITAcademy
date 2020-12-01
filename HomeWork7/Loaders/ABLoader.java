package HomeWork7.Loaders;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ABLoader extends SiteLoader {


    @Override
    public double load(Currency currencyName) {
        return load("https://developerhub.alfabank.by:8273/partner/1.0.0/public/rates", currencyName);
    }

    @Override
    protected double handle(String content, Currency currencyName) {
        String[] rates = content.split("},\\{");
        final String MARKER = "\"buyIso\":\"BYN\"";
        final String BUY_RATE_MARKER = "\"buyRate\":";
        Pattern pattern = Pattern.compile("\\d+.\\d+");
        Matcher matcher;
        int firstIndex;
        double value = 0;
        for(String item: rates) {
            if(item.contains(MARKER) && item.contains(currencyName.toString())) {
                matcher = pattern.matcher(item);
                firstIndex = item.indexOf(BUY_RATE_MARKER) + BUY_RATE_MARKER.length();
                if(matcher.find(firstIndex)) {
                    value = Double.parseDouble(matcher.group());
                }
            }
        }
        return value;
    }
}
