package model;
/**
 * @author
 * @version
 * @since
 * */

public class Evento {
    private int UUID;
    private String nome;
    private String classificacao;
    private String dataEvento;

    public Evento(int UUID, String nome, String classificacao, String dataEvento, String horaEventoInicio, String horaEventoFim, int qtMaxPessoas, String localEvento) {
        this.UUID = UUID;
        this.nome = nome;
        this.classificacao = classificacao;
        this.dataEvento = dataEvento;
        this.horaEventoInicio = horaEventoInicio;
        this.horaEventoFim = horaEventoFim;
        this.qtMaxPessoas = qtMaxPessoas;
        this.localEvento = localEvento;
    }

    public int getUUID() {
        return UUID;
    }

    public void setUUID(int UUID) {
        this.UUID = UUID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(String dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getHoraEventoInicio() {
        return horaEventoInicio;
    }

    public void setHoraEventoInicio(String horaEventoInicio) {
        this.horaEventoInicio = horaEventoInicio;
    }

    public String getHoraEventoFim() {
        return horaEventoFim;
    }

    public void setHoraEventoFim(String horaEventoFim) {
        this.horaEventoFim = horaEventoFim;
    }

    public int getQtMaxPessoas() {
        return qtMaxPessoas;
    }

    public void setQtMaxPessoas(int qtMaxPessoas) {
        this.qtMaxPessoas = qtMaxPessoas;
    }

    public String getLocalEvento() {
        return localEvento;
    }

    public void setLocalEvento(String localEvento) {
        this.localEvento = localEvento;
    }

    private String horaEventoInicio;
    private String horaEventoFim;
    private int qtMaxPessoas;
    private String localEvento;

}
