package HomeWork7.Loaders;

/**
 * Загрузчик курса с сайта Нац. Банка
 */
public class NBRBLoader extends SiteLoader {

    /**
     * Метод для запуска загрузки курса валют
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    public double load(SiteLoader.Currency currencyName) {
        return load("https://www.nbrb.by/api/exrates/rates/" + currencyName.getId(), currencyName);
    }

    /**
     * Обработка результата загрузки с сайта банка
     * @param content то что получилось загрузить
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    protected double handle(String content, SiteLoader.Currency currencyName) {
        final String CUR_OFFICIAL_RATE = "\"Cur_OfficialRate\":";
        int firstIndex = content.indexOf(CUR_OFFICIAL_RATE) + CUR_OFFICIAL_RATE.length();
        int lastIndex = content.length() - 2;
        double value = 0;
        try {
           value = Double.parseDouble(content.substring(firstIndex, lastIndex));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return value;
    }
}
