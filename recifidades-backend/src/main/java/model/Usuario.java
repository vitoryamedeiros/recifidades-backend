package model;

import java.util.Scanner;

public class Usuario {
    private int UUID;
    private String email;

    public Usuario(int UUID, String email, String senha) {
        this.UUID = UUID;
        this.email = email;
        this.senha = senha;
    }

    private String senha;

    public int getUUID() {
        return UUID;
    }

    public void setUUID(int UUID) {
        this.UUID = UUID;
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
}
