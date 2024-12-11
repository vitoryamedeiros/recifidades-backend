package model.person;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pessoafisica")
public class PF extends person {
    @Id
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "nome")
    private String nome;
    @Column(name = "dataNascimento")
    private String dataNascimento;
    @Column(name = "telefone")
    private String telefone;
    @Column(name = "sexo")
    private char sexo;

    // Adicionei os parâmetros email e senha no construtor
    public PF(String email, String senha, String cpf, String nome, String dataNascimento, String telefone, char sexo) {
        super(email, senha); // Chama o construtor da superclasse com email e senha
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.sexo = sexo;
    }

    public PF() {
        super();
    }

    @Override
    public String getTipoPessoa() {
        return "Pessoa Física";
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("CPF: " + cpf + ", Telefone: " + telefone + ", Data de Nascimento: " + dataNascimento);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
