package entities;

public class Cliente {
    protected String nome;
    protected String cpf;
    protected String telefone;
    protected int cod_cliente;
    protected Endereco endereco;
    protected int cod_falecido;

public Cliente() {
    }
public Cliente(String nome, String cpf, String telefone, int cod_cliente, Endereco endereco,int cod_falecido) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.cod_cliente = cod_cliente;
        this.endereco = endereco;
        this.cod_falecido = cod_falecido;
    }
public String getNome() {
        return nome;
    }
public String getCpf() {
        return cpf;
    }
public String getTelefone() {
        return telefone;
    }
public int getCod_cliente() {
        return cod_cliente;
    }
public Endereco getEndereco() {
        return endereco;
    }
public int getCod_falecido() {
        return cod_falecido;
    }
public void setNome(String nome) {
        this.nome = nome;
    }
public void setCpf(String cpf) {
        this.cpf = cpf;
    }
public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
public void setCod_cliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }
public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
public void setCod_falecido(int cod_falecido) {
        this.cod_falecido = cod_falecido;
    }
}
