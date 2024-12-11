package model.person;

import jakarta.persistence.*;
import model.events.Evento;

@Entity
@Table(name = "participa")
public class participa {
    @Id
    @Column(name = "participaID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int participaID;
    @Column(name = "participante")
    private person participante;
    @Column(name = "evento")
    private Evento evento;
    @Column(name = "valor")
    private double valor;

    public participa(person participante, Evento evento, double valor) {
        this.participante = participante;
        this.evento = evento;
        this.valor = valor;
    }

    public participa() {

    }

    public person getParticipante() {
        return participante;
    }

    public void setParticipante(person participante) {
        this.participante = participante;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }



    public void exibirPatrocinio() {
        System.out.println("Patrocinador: " + participante.getTipoPessoa() + ", Evento: " + evento.getNome() + ", Valor: " + valor);
    }
}
