package HomeWork7.Beans;

import java.util.Date;

public class Rate {
    private double sellRate;
    private double buyRate;
    private Currency sellIso;
    private Currency buyIso;
    private int quantity;
    private Date date;

    public Rate(double sellRate, double buyRate, Currency sellIso, Currency buyIso, int quantity, Date date) {
        this.sellRate = sellRate;
        this.buyRate = buyRate;
        this.sellIso = sellIso;
        this.buyIso = buyIso;
        this.quantity = quantity;
        this.date = date;
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

    public Currency getSellIso() {
        return sellIso;
    }

    public void setSellIso(Currency sellIso) {
        this.sellIso = sellIso;
    }

    public Currency getBuyIso() {
        return buyIso;
    }

    public void setBuyIso(Currency buyIso) {
        this.buyIso = buyIso;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
                ", buyIso=" + buyIso +
                ", quantity=" + quantity +
                ", date=" + date +
                '}';
    }
}
