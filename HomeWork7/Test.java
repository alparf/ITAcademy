package HomeWork7;

import HomeWork7.Beans.CurrencyISO;
import HomeWork7.Beans.Rate;
import HomeWork7.Dao.RateDAO;
import HomeWork7.Loaders.LoaderFactory;
import HomeWork7.Loaders.SiteLoader;
import HomeWork7.interfaces.IRateDAO;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        getAndSaveRate(LoaderFactory.newABLoader());
    }

    private static void getAndSaveRate(SiteLoader loader){
        List<Rate> rates = new LinkedList<>();
        Date toDay = new Date();
        rates.add(new Rate(loader.load(SiteLoader.Currency.EUR),
                CurrencyISO.EUR, toDay));
        rates.add(new Rate(loader.load(SiteLoader.Currency.USD),
                CurrencyISO.USD, toDay));
        rates.add(new Rate(loader.load(SiteLoader.Currency.RUB),
                CurrencyISO.RUB, toDay));
        for(Rate rate: rates) {
            System.out.println(rate.getCurrency() + " " + rate.getValue());
        }
        IRateDAO rateDAO = new RateDAO();
        rateDAO.save(rates);
    }
}
