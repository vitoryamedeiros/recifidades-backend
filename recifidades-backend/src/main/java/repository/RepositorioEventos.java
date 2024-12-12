package repository;

import interfaces.InterfacEvents;
import model.events.Evento;

import java.util.ArrayList;
import java.util.List;

public class RepositorioEventos implements InterfacEvents {
    private List<Evento> eventos;

    public RepositorioEventos() {
        eventos = new ArrayList<Evento>();
    }

    @Override
    public void inserirEvento(Evento evento) { eventos.add(evento); }

    @Override
    public void alterarEvento(Evento evento) {
        int index = eventos.indexOf(evento);
        eventos.set(index, evento);
    }

    @Override
    public Evento BuscarEvento(int id){
        Evento eventwanted = null;
        for (Evento evento : eventos) {
            if (evento.getUUID() == id) {
                eventwanted = evento;
            }
        }
        return eventwanted;
    }

    @Override
    public List<Evento> EventoList(){ return this.eventos; }

    @Override
    public void excluirEvento(int id) {
        int posicao = -1;
        for (Evento evento : eventos) {
            if (evento.getUUID() == id) {
                posicao = eventos.indexOf(evento);
            }
            if (posicao != -1) {
                eventos.remove(posicao);
            }
        }
    }
}
