package HomeWork7;

import HomeWork7.Beans.Rate;
import HomeWork7.Dao.RateDAO;
import HomeWork7.interfaces.IRateDAO;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        getAndSaveRate(Loaders.newABLoader());
    }

    private static void getAndSaveRate(SiteLoader loader){
        List<Rate> rates = new LinkedList<>();
        Date toDay = new Date();
        rates.add(new Rate(loader.load(SiteLoader.Currency.EUR),
                SiteLoader.Currency.EUR, toDay));
        rates.add(new Rate(loader.load(SiteLoader.Currency.USD),
                SiteLoader.Currency.USD, toDay));
        rates.add(new Rate(loader.load(SiteLoader.Currency.RUB),
                SiteLoader.Currency.RUB, toDay));
        for(Rate rate: rates) {
            System.out.println(rate.getCurrency() + " " + rate.getValue());
        }
        IRateDAO rateDAO = new RateDAO();
        rateDAO.save(rates);
    }
}
