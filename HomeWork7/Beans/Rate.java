package HomeWork7.Beans;

import HomeWork7.SiteLoader;

import java.util.Date;

public class Rate {
    private double value;
    private SiteLoader.Currency currency;
    private Date date;

    public Rate(double value, SiteLoader.Currency currency, Date date) {
        this.value = value;
        this.currency = currency;
        this.date = date;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public SiteLoader.Currency getCurrency() {
        return currency;
    }

    public void setCurrency(SiteLoader.Currency currency) {
        this.currency = currency;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Rate{" +
                "value=" + value +
                ", currency=" + currency +
                ", date=" + date +
                '}';
    }
}
