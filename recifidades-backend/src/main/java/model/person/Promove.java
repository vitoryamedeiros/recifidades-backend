package model.person;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "promove")
public class Promove {

    @Id
    @Column(name = "uuid") // Defina o nome da coluna no banco de dados
    private int UUID;

    @Column(name = "tipo_categ") // Defina o nome da coluna no banco de dados
    private String tipoCateg;

    // Construtor
    public Promove(int UUID, String tipoCateg) {
        this.UUID = UUID;
        this.tipoCateg = tipoCateg;
    }

    public Promove() {

    }

    // Getters e Setters
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
