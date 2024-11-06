package model;

public class Promove {
    private int UUID;
    private String tipoCateg;

    public Promove(int UUID, String tipoCateg) {
        this.UUID = UUID;
        this.tipoCateg = tipoCateg;
    }

    public int getUUID() {
        return UUID;
    }

    public void setUUID(int UUID) {
        this.UUID = UUID;
    }

    public String getTipoCateg() {
        return tipoCateg;
    }

    public void setTipoCateg(String tipoCateg) {
        this.tipoCateg = tipoCateg;
    }
}