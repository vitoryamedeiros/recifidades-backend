package repository_jpa;

import factory.FactoryRecificidades;
import jakarta.persistence.EntityManager;
import model.events.Evento;

import java.util.List;

public class EventsRepository {
    private static EntityManager entityManager;

    public static void SaveEvents(Evento evento) {
        entityManager = FactoryRecificidades.ConfigFactoryRecificidades();
        try {
            entityManager.persist(evento);
            FactoryRecificidades.saveAndClose(entityManager);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            entityManager.getTransaction().rollback();
        }
    }

    public static Evento FindEventByName(String name) {
        entityManager = FactoryRecificidades.ConfigFactoryRecificidades();
        return entityManager.find(Evento.class, name);
    }

    public static Evento FindEventByID(int id) {
        entityManager = FactoryRecificidades.ConfigFactoryRecificidades();
        return entityManager.find(Evento.class, id);
    }

    public static List<Evento> ListAllEvents() {
        String query = "SELECT e FROM Evento e";
        entityManager = FactoryRecificidades.ConfigFactoryRecificidades();

        return entityManager.createQuery(query, Evento.class).getResultList();
    }

    public static void DeleteEventById(int id) {
        entityManager = FactoryRecificidades.ConfigFactoryRecificidades();
        try {
            Evento evento = FindEventByID(id);
            entityManager.remove(evento);
            FactoryRecificidades.saveAndClose(entityManager);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            entityManager.getTransaction().rollback();
        }
    }
}
