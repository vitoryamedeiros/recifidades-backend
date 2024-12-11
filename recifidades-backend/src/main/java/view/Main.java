package view;

/**
 * Classe principal para testar a criação de objetos de Pessoa Física.
 * @author SeuNome
 * @version 1.0
 * @since 2023
 */

import java.util.Scanner;
import model.person.PF;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o email:");
        String email = sc.nextLine();

        System.out.println("Digite a senha:");
        String senha = sc.nextLine();

        System.out.println("Digite o CPF:");
        String cpf = sc.nextLine();

        System.out.println("Digite o nome:");
        String nome = sc.nextLine();

        System.out.println("Digite a data de nascimento (dd/MM/yyyy):");
        String dataNascimento = sc.nextLine();

        System.out.println("Digite o telefone:");
        String telefone = sc.nextLine();

        System.out.println("Digite o sexo (M/F):");
        char sexo = sc.nextLine().charAt(0);

        // Criar um objeto de Pessoa Física
        PF pessoaFisica = new PF(email, senha, cpf, nome, dataNascimento, telefone, sexo);
        pessoaFisica.exibirDados();

        sc.close();
    }
}
