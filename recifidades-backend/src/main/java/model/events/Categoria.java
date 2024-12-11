package model.events;

import jakarta.persistence.*;

@Entity
@Table(name = "categoria")
public class Categoria {
    @Id
    @Column(name = "catID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int UUID;
    @Column(name = "tipocategoria")
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
