package HomeWork7.Interfaces;

import HomeWork7.Beans.Rate;
import HomeWork7.SiteLoader;

import java.util.List;

public interface IParser {
    List<Rate> getRate(String data, SiteLoader.Currency currency);
}
