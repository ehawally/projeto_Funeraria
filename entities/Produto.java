package entities;

public class Produto {
    protected String nome;
    protected int cod_produto;
    protected double preco;

public Produto() {

    }
public Produto(String nome, int cod_produto, double preco) {
        this.nome = nome;
        this.cod_produto = cod_produto;
        this.preco = preco;
    }
public String getNome() {
        return nome;
    }
public int getCod_produto() {
        return cod_produto;
    }
public double getPreco() {
        return preco;
    }
public void setNome(String nome) {
        this.nome = nome;
    }  
public void setCod_produto(int cod_produto) {
        this.cod_produto = cod_produto;
    }
public void setPreco(double preco) {
        this.preco = preco;
    }
}