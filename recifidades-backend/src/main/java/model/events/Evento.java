package model.events;

import jakarta.persistence.*;

/**
 * @author
 * @version
 * @since
 * */
@Entity
@Table(name = "evento")
@MappedSuperclass
public class Evento {
    @Id
    @Column(name = "evID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int UUID;
    @Column(name = "nome")
    private String nome;
    @Column(name = "classificacao")
    private String classificacao;
    @Column(name = "dataevento")
    private String dataEvento;
    @Column(name = "horaeventoI")
    private String horaEventoInicio;
    @Column(name = "horaeventoF")
    private String horaEventoFim;
    @Column(name = "qtmaxp")
    private int qtMaxPessoas;
    @Column(name = "localevento")
    private String localEvento;

    public Evento(String nome, String classificacao, String dataEvento, String horaEventoInicio, String horaEventoFim, int qtMaxPessoas, String localEvento) {
        this.nome = nome;
        this.classificacao = classificacao;
        this.dataEvento = dataEvento;
        this.horaEventoInicio = horaEventoInicio;
        this.horaEventoFim = horaEventoFim;
        this.qtMaxPessoas = qtMaxPessoas;
        this.localEvento = localEvento;
    }
    public void exibirInformacoes() {
        System.out.println("ID: " + UUID + ", Nome: " + nome + ", Local: " + localEvento + ", Capacidade: " + qtMaxPessoas);
    }

    public int getUUID() {
        return UUID;
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


}
