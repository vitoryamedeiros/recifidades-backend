package view;
/**
 * @autor
 * @version
 * @since
 * */
/** Importa classes e porta de entrada */
import java.util.Scanner;
import model.PF;
import model.PJ;
import model.Evento;
import model.Patrocina;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o email:");
        String email = sc.nextLine();

        System.out.println("Digite a senha:");
        String senha = sc.nextLine();

        System.out.println("Digite o CPF:");
        String cpf = sc.nextLine();

        System.out.println("Digite o telefone:");
        String telefone = sc.nextLine();

        // Criar um objeto de Pessoa Física
        PF pessoaFisica = new PF(email, senha, cpf, telefone);
        pessoaFisica.exibirDados();

        sc.close();
    }
}