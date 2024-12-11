package view;

/**
 * Classe principal para testar a criação de objetos de Pessoa Física.
 * @author SeuNome
 * @version 1.0
 * @since 2023
 */

import java.util.Scanner;
import controller.ControlPerson;
import controller.ControlEvents;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      MenuPrincipal menuPrincipal = new MenuPrincipal();
      ControlEvents controlEvents = new ControlEvents();
      ControlPerson controlPerson = new ControlPerson();
      String continuar;
      int op, opc, ope;

      do {
          menuPrincipal.menu();
          op = sc.nextInt();

          switch (op) {
              case 1:
                  menuPrincipal.MenuConta();
                  opc = sc.nextInt();
                  switch (opc) {
                      case 1:
                          controlPerson.criarperson();
                          break;
                      case 2:
                          controlPerson.buscarPorEmail();
                          break;
                      case 3:
                          controlPerson.buscarPorId();
                          break;
                      case 4:
                          controlPerson.removerPersonPorId();
                          break;
                      case 5:
                          controlPerson.ListarPersons();
                          break;
                      default:
                          System.out.println("Opção inválida. Tente novamente!");
                          break;
                  }
              case 2:
                  menuPrincipal.MenuEvento();
                  ope = sc.nextInt();
                  switch (ope) {
                      case 1:
                          controlEvents.createEvent();
                          break;
                      case 2:
                          controlEvents.FindEventByName();
                          break;
                      case 3:
                          controlEvents.FindEventById();
                          break;
                      case 4:
                          controlEvents.listAllEvents();
                          break;
                      case 5:
                          controlEvents.DeleteEventById();
                          break;
                      default:
                          System.out.println("Opção inválida. Tente novamente!");
                          break;
                  }
              default:
                  System.out.println("Opção inválida. Tente novamente!");
          }
          System.out.println("Deseja continuar? ");
          continuar = sc.nextLine();
      }while(continuar.equalsIgnoreCase("sim"));
    }
}
