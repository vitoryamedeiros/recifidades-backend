package model;

public class participa {
    private int UUID;
    private static int contaidparticipante = 1;
    private Usuario patrocinador;
    private Evento evento;
    private double valor;

    public participa(Usuario patrocinador, Evento evento, double valor) {
        this.UUID = contaidparticipante++;
        this.patrocinador = patrocinador;
        this.evento = evento;
        this.valor = valor;
    }

    public Usuario getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(Usuario patrocinador) {
        this.patrocinador = patrocinador;
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
        System.out.println("Patrocinador: " + patrocinador.getTipoPessoa() + ", Evento: " + evento.getNome() + ", Valor: " + valor);
    }
}
