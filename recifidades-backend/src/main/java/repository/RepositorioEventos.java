package repository;

import interfaces.interfaceRecificidades;
import model.events.Evento;

import java.util.ArrayList;
import java.util.List;

public class RepositorioEventos implements interfaceRecificidades {
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

}
