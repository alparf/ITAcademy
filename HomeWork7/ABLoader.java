package HomeWork7;

import HomeWork7.Beans.Rate;
import HomeWork7.Interfaces.IParser;

import java.util.List;

public class ABLoader extends SiteLoader {


    @Override
    public double load(Currency currencyName) {
        return load("https://developerhub.alfabank.by:8273/partner/1.0.0/public/rates", currencyName);
    }

    @Override
    protected double handle(String content, Currency currencyName) {
        IParser parser = new ABParser();
        List<Rate> rateList = parser.getRate(content, currencyName);
        for(Rate rate: rateList) {
            if(rate.getSellIso() == currencyName) {
                return rate.getBuyRate();
            }
        }
        return 0;
    }
}
