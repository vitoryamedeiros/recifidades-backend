package model;

public class Patrocinio {
    private int UUID;
    private static int contaIdPatrocinio = 1;
    private double valorPatrocinio;

    public Patrocinio(double valorPatrocinio) {
        this.UUID = contaIdPatrocinio++;
        this.valorPatrocinio = valorPatrocinio;
    }

    public double getValorPatrocinio() {
        return valorPatrocinio;
    }

    public void setValorPatrocinio(double valorPatrocinio) {
        this.valorPatrocinio = valorPatrocinio;
    }
}