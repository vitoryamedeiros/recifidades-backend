package repository;

import interfaces.interfaceRecificidades;
import model.events.Evento;

import java.util.ArrayList;
import java.util.List;

public class RepositorioEventos implements interfaceRecificidades {
    private List<Evento> eventos;

    public RepositorioEventos() {
        eventos = new ArrayList<>();
    }

    @Override
    public void inserirEvento(Evento evento) { eventos.add(evento); }

    @Override
    public void alterarEvento(Evento evento) {
        int index = eventos.indexOf(evento);
        eventos.set(index, evento);
    }

    @Override
    public void excluirEvento(int id) {
        int posicao = -1;
        for (Evento evento : eventos) {
            if (evento.getUUID()==id) {
                posicao = eventos.indexOf(evento);
            }
            if (posicao != -1) {
                eventos.remove(posicao);
            }
        }
    }

    @Override
    public Evento BuscarEvento(String nome){
        Evento eventowanted = null;
        for (Evento evento : eventos) {
            if (evento.getNome().equalsIgnoreCase(nome)) {
                eventowanted = evento;
            }
        }
        return eventowanted;
    }

    @Override
    public List<Evento> EventoList(){ return this.eventos; }
}