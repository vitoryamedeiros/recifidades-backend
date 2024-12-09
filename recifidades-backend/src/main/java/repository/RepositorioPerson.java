package repository;

import interfaces.interfaceRecificidades;
import model.person.person;

import java.util.ArrayList;
import java.util.List;

public class RepositorioPerson implements interfaceRecificidades{
    private List<person> persons;

    public RepositorioPerson() {
        persons = new ArrayList<>();
    }
    @Override
    public void inserirPersons(person person){persons.add(person);}

    @Override
    public void alterarPersons(person person){
    }

    @Override
    public void excluirPerson(String email) {
        int posicao = -1;
        for (person person : persons) {
            if (person.getEmail().equals(email)) {
                posicao = persons.indexOf(person);
            }
            if (posicao != -1) {
                persons.remove(posicao);
            }
        }
    }

    @Override
    public person BuscarPorEmail(String email){
        person personwanted = null;
        for (person person : persons) {
            if (person.getEmail().equals(email)) {
                personwanted = person;
            }
        }
            return personwanted;
    }

    @Override
    public List<person> personList(){ return this.persons; }

}
