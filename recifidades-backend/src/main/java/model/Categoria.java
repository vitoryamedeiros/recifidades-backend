package model;

public class Categoria {
    private int UUID;
    private String tipoCategoria;

    public Categoria(int UUID, String tipoCategoria) {
        this.UUID = UUID;
        this.tipoCategoria = tipoCategoria;
    }

    public int getUUID() {
        return UUID;
    }

    public void setUUID(int UUID) {
        this.UUID = UUID;
    }

    public String getTipoCategoria() {
        return tipoCategoria;
    }

    public void setTipoCategoria(String tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
    }
}
