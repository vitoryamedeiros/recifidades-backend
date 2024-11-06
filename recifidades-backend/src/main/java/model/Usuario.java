package model;

public abstract class Usuario {
    private int UUID;
    private static int incId = 1;
    private String email;
    private String senha;

    public Usuario(String email, String senha) {
        this.UUID = incId++;
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
        System.out.println("Usuario ID: " + this.UUID + ", Email: " + this.email);
    }
}
