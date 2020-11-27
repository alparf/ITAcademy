package HomeWork7;

public class ABLoader extends SiteLoader {


    @Override
    public double load(Currency currencyName) {
        return load("https://developerhub.alfabank.by:8273/partner/1.0.0/public/rates", currencyName);
    }

    @Override
    protected double handle(String content, Currency currencyName) {
        String[] rates = content.split("},\\{");
        final String marker = "\"buyIso\":\"BYN\"";
        for(String item: rates) {
            if(item.contains(marker) && item.contains(currencyName.toString())) {
                System.out.println(item);
            }
        }
        return 0;
    }
}
