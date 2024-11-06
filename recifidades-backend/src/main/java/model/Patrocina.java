package model;
/**
 * @author
 * @version
 * @since
 * */

import model.Usuario;
import model.Evento;

 public class Patrocinacao {
     private int UUID;
     private Usuario patrocinador;
     private Evento evento;
     private double valor;

    public Patrocinacao(int UUID, double valor, Usuario patrocinador, Evento evento) {
        this.UUID = UUID;
        this.patrocinador = patrocinador;
        this.evento = evento;
        this.valor = valor;
    }
     public void exibirPatrocinio() {
         System.out.println("Patrocinador: " + patrocinador.getTipoPessoa() + ", Evento: " + evento.getNome() + ", Valor: " + vlrPatrocinio);
     }

    public int getUUID() {
        return UUID;
    }

    public void setUUID(int UUID) {
        this.UUID = UUID;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}