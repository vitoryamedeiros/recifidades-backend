package interfaces;

import model.events.Evento;
import java.util.List;

public interface InterfacEvents {
    void inserirEvento(Evento evento);
    void alterarEvento(Evento evento);
    void excluirEvento(int id);
    Evento BuscarEvento(int id);
    List<Evento> EventoList();
}
