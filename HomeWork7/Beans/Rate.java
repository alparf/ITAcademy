package HomeWork7.Beans;

import HomeWork7.SiteLoader;

import java.util.Date;

public class Rate {
    private double sellRate;
    private double buyRate;
    private SiteLoader.Currency sellIso;
    private Date date;

    public Rate(double sellRate, double buyRate, SiteLoader.Currency sellIso, Date date) {
        this.sellRate = sellRate;
        this.buyRate = buyRate;
        this.sellIso = sellIso;
        this.date = date;
    }

    public Rate() {

    }

    public double getSellRate() {
        return sellRate;
    }

    public void setSellRate(double sellRate) {
        this.sellRate = sellRate;
    }

    public double getBuyRate() {
        return buyRate;
    }

    public void setBuyRate(double buyRate) {
        this.buyRate = buyRate;
    }

    public SiteLoader.Currency getSellIso() {
        return sellIso;
    }

    public void setSellIso(SiteLoader.Currency sellIso) {
        this.sellIso = sellIso;
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
                "sellRate=" + sellRate +
                ", buyRate=" + buyRate +
                ", sellIso=" + sellIso +
                ", date=" + date +
                '}';
    }
}
