package model.events;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categoria")
public class Categoria {

    @Id
    @Column(name = "catID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int UUID;

    @Column(name = "tipocategoria")
    private String tipoCategoria;

    // Construtor sem parâmetros (obrigatório para o JPA)
    public Categoria() {
    }

    // Construtor com parâmetros (se necessário)
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
