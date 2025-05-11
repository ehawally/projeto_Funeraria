package entities;

public class Funcionario {
    protected String nome;
    protected int cod_funcionario;
    protected Agendamento agendamento;


public Funcionario (){

}
public Funcionario (String nome,int cod_funcionario, Agendamento agendamento){
    this.agendamento= agendamento;
    this.nome =nome;
    this.cod_funcionario= cod_funcionario;
}
public String getNome() {
    return nome;
}
public int getcod_funcionario(){
    return cod_funcionario;
}
public Agendamento getAgendamento(){
    return agendamento;
}
public void setNome (String nome) {
    this.nome = nome;
}
public void setcod_funcionario (int cod_funcionario) {
    this.cod_funcionario  = cod_funcionario;
}
public void setAgendamento (Agendamento agendamento) {
    this.agendamento = agendamento;

}
}
