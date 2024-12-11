package model.person;

import jakarta.persistence.*;

@Entity
@Table(name="pessoa")
@MappedSuperclass
public abstract class person {
    @Id
    @Column(name = "UUID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int UUID;
    @Column(name = "email")
    private String email;
    @Column(name = "senha")
    private String senha;

    public person(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public int getUUID() {
        return UUID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public abstract String getTipoPessoa();

    public void exibirDados() {
        System.out.println("person ID: " + this.UUID + ", Email: " + this.email);
    }
}
