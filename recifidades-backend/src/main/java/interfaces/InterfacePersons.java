package interfaces;

import model.person.person;
import java.util.List;

public interface InterfacePersons {
    void inserirPersons(person person);
    void alterarPersons(person person);
    void excluirPerson(String UUID);
    person BuscarPorEmail(String email);
    person BuscarPorId(int id);
    List<person> personList();
}
