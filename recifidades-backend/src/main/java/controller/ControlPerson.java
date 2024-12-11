package controller;

import model.person.person;
import model.person.PJ;
import model.person.PF;

import repository.RepositorioPerson;
import repository_jpa.PersonRepository;

import java.util.Scanner;

public class ControlPerson {
    RepositorioPerson persons;
    person Person;
    Scanner sc = new Scanner(System.in);
    String email, pass;
    int id, op;

    public void criarperson(){
        persons = new RepositorioPerson();
        System.out.println("Digite o email: ");
        email = sc.nextLine();
        System.out.println("Digite senha: ");
        pass = sc.nextLine();
        System.out.println("Infome o tipo de cadastro: ");
        System.out.println("Para Pessoa fisica = 1, Pera pessoa juridica = 2");
        op = sc.nextInt();
        sc.nextLine();
        switch (op){
            case 1:
                PF pessoaFisica = new PF();
                System.out.println("Informe o cpf: ");
                pessoaFisica.setCpf(sc.nextLine());
                pessoaFisica.setEmail(email);
                pessoaFisica.setSenha(pass);
                System.out.println("Informe o nome: ");
                pessoaFisica.setNome(sc.nextLine());
                System.out.println("Informe o Sexo: M = Mascolino, F = Feminino");
                pessoaFisica.setSexo(sc.next().charAt(0));
                sc.nextLine();
                System.out.println("Informe a data de nascimento: ");
                pessoaFisica.setDataNascimento(sc.nextLine());
                System.out.println("Informe a telefone: ");
                pessoaFisica.setTelefone(sc.nextLine());
                PersonRepository.savePerson(pessoaFisica);
                System.out.println("Cadastrado com sucesso!");
                break;
            case 2:
                PJ pessoaJuridica = new PJ();
                pessoaJuridica.setEmail(email);
                pessoaJuridica.setSenha(pass);
                System.out.println("Informe o cnpj: ");
                pessoaJuridica.setCnpj(sc.nextInt());
                System.out.println("Informe a Razão Social: ");
                pessoaJuridica.setRazaoSocial(sc.nextLine());
                System.out.println("Informe a Telefone: ");
                pessoaJuridica.setNumeroContato(sc.nextLine());
                System.out.println("Informe o nome do contato: ");
                pessoaJuridica.setNomeContato(sc.nextLine());
                System.out.println("Informe o seu logradouro: ");
                pessoaJuridica.setLogradouro(sc.nextLine());
                System.out.println("Informe o bairro: ");
                pessoaJuridica.setBairro(sc.nextLine());
                System.out.println("Informe a cidade: ");
                pessoaJuridica.setCidade(sc.nextLine());
                System.out.println("Informe a estado: ");
                pessoaJuridica.setEstado(sc.nextLine());
                PersonRepository.savePerson(pessoaJuridica);
                System.out.println("Cadastrado com sucesso!");
                break;
            default:
                System.out.println("Não foi selecionado uma opção valida");
                System.exit(0);
                break;
        }
    }
    public void buscarPorEmail(){
        System.out.println("Informe o email: ");
        email = sc.nextLine();
        System.out.println("Informações do usuario: " + persons.BuscarPorEmail(email));
    }

    public void buscarPorId(){
        System.out.println("Informe o id: ");
        id = sc.nextInt();
        System.out.println("Informações da conta: " + persons.BuscarPorId(id));
    }

    public void removerPersonPorId(){
        System.out.println("Informe o id: ");
        id = sc.nextInt();
        PersonRepository.deletePersonById(id);
        System.out.println("Conta deletada com sucesso!");
    }

    public void ListarPersons() {
        System.out.println("Listar contas: ");
        for (person persons : PersonRepository.getAllPersons()) {
            System.out.println(persons);
        }
    }
}