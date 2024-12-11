package interfaces;

import model.events.Evento;
import model.person.person;
import java.util.List;

public interface interfaceRecificidades {
    void inserirPersons(person person);
    void alterarPersons(person person);
    void excluirPerson(String UUID);
    person BuscarPorEmail(String email);
    List<person> personList();
    void inserirEvento(Evento evento);
    void alterarEvento(Evento evento);
    void excluirEvento(String UUID);
    Evento BuscarEvento(String nome);
    List<Evento> EventoList();
}
