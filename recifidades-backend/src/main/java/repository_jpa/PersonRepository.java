package repository_jpa;

import factory.FactoryRecificidades;
import jakarta.persistence.EntityManager;
import model.person.person;

import java.util.List;

public class PersonRepository {
    private static EntityManager entityManager;

    public static void savePerson(person person){
        entityManager = FactoryRecificidades.ConfigFactoryRecificidades();
    try {
            entityManager.persist(person);
            FactoryRecificidades.saveAndClose(entityManager);
        }catch (Exception e){
        System.out.println(e.getMessage());
        entityManager.getTransaction().rollback();
    }
    }
    public static person getPersonById(final int id){
        entityManager = FactoryRecificidades.ConfigFactoryRecificidades();
        return entityManager.find(person.class, id);
    }
    public static List<person> getAllPersons(){
        String query = "SELECT p FROM person p";
        entityManager = FactoryRecificidades.ConfigFactoryRecificidades();
        return entityManager.createQuery(query, person.class).getResultList();
    }
    public static void deletePersonById(final int id){
        entityManager = FactoryRecificidades.ConfigFactoryRecificidades();
        try {
            person person = getPersonById(id);
            entityManager.remove(person);
            FactoryRecificidades.saveAndClose(entityManager);
        }catch (Exception e){
            System.out.println(e.getMessage());
            entityManager.getTransaction().rollback();
        }
    }
}
