package controller;

import model.events.Evento;
import repository.RepositorioEventos;
import repository_jpa.EventsRepository;

import java.util.Scanner;

public class ControlEvents {
    RepositorioEventos Events;
    Evento evento = new Evento();
    Scanner sc = new Scanner(System.in);
    String nome;
    int id;


    public void createEvent() {
        Events = new RepositorioEventos();
        System.out.println("Digite o nome do evento: ");
        evento.setNome(sc.nextLine());
        System.out.println("Digite a data do evento: ");
        evento.setDataEvento(sc.nextLine());
        System.out.println("Digite a hora de inicio do evento: ");
        evento.setHoraEventoInicio(sc.nextLine());
        System.out.println("Digite a hora de fim do evento: ");
        evento.setHoraEventoFim(sc.nextLine());
        System.out.println("Digite a capacidade do evento: ");
        evento.setQtMaxPessoas(sc.nextInt());
        System.out.println("Digite a classificação indicativa do evento: ");
        evento.setClassificacao(sc.nextLine());
        EventsRepository.SaveEvents(evento);
    }

    public void FindEventByName(){
        System.out.println("Digite o nome do evento: ");
        nome = sc.nextLine();
        System.out.println("Evento: " + EventsRepository.FindEventByName(nome));
    }

    public void FindEventById(){
        System.out.println("Digite o codigo do evento: ");
        id = sc.nextInt();
        System.out.println("Evento: " + EventsRepository.FindEventByID(id));

    }

    public void DeleteEventById(){
        System.out.println("Digite o codigo do evento: ");
        id = sc.nextInt();
        EventsRepository.DeleteEventById(id);
        System.out.println("Evento deletado com sucesso!");
    }
    /*public void UpdateEventById(){
        System.out.println("Digite o codigo do evento: ");
        id = sc.nextInt();
        System.out.println("Digite o nome do evento: ");
        nome = sc.nextLine();
        System.out.println("Evento: " + EventsRepository.FindEventByID(id));
    }*/
    public void listAllEvents(){
        System.out.println("Lista de eventos: ");
        for (Evento events : EventsRepository.ListAllEvents()){
            System.out.println(events);
        }
    }


}
