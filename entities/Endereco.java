package entities;

public class Endereco {
    protected String rua;
    protected String numero;
    protected String bairro;
    protected String cidade;
    protected String estado;
    protected String cep;

public Endereco() {
}
public Endereco(String rua, String numero, String bairro, String cidade, String estado, String cep) {
    this.rua = rua;
    this.numero = numero;
    this.bairro = bairro;
    this.cidade = cidade;
    this.estado = estado;
    this.cep = cep;
}
public String getRua() {
    return rua;
}
public String getNumero() {
    return numero;
}
public String getBairro() {
    return bairro;
}
public String getCidade() {
    return cidade;
}
public String getEstado() {
    return estado;
}
public String getCep() {
    return cep;
}
public void setRua(String rua) {
    this.rua = rua;
}
public void setNumero(String numero) {
    this.numero = numero;
}
public void setBairro(String bairro) {
    this.bairro = bairro;
}
public void setCidade(String cidade) {
    this.cidade = cidade;
}
public void setEstado(String estado) {
    this.estado = estado;
}
public void setCep(String cep) {
    this.cep = cep;
}
}
