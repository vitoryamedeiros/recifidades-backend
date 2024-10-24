package model;

public class Turista extends Usuario {
    private short idTurista;

    // criar funçao/classe de pontosacumulados
    private int pontosAcumulados;

    // Construtores, Getters e Setters
    public Turista(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.pontosAcumulados = 0;
    }

    public void adicionarPontos(int pontos) {
        this.pontosAcumulados += pontos;
    }
}
