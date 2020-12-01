package HomeWork7.Beans;

import java.util.Date;

public class Rate {
    private double value;
    private CurrencyISO currency;
    private Date date;

    public Rate(double value, CurrencyISO currency, Date date) {
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

    public CurrencyISO getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyISO currency) {
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
