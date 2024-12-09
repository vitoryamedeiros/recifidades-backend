package model.person;

import jakarta.persistence.*;

@Entity
@Table(name = "patrocina")
public class patrocina {
    @Id
    @Column(name = "partrocID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int partrocID;
    @Column(name = "valorpatrocinio")
    private double valorPatrocinio;

    public patrocina(double valorPatrocinio) {
        this.valorPatrocinio = valorPatrocinio;
    }


    public double getValorPatrocinio() {
        return valorPatrocinio;
    }

    public void setValorPatrocinio(double valorPatrocinio) {
        this.valorPatrocinio = valorPatrocinio;
    }
}