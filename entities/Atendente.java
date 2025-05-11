package entities;

public class Atendente extends Funcionario {
    protected int nivelAcesso;

public Atendente(){

}
public Atendente (int nivelAcesso){
    this.nivelAcesso = nivelAcesso;
}
public int getnivelAcesso(){
    return nivelAcesso;
}
public void setNivelAcesso (int nivelAcesso) {
    this.nivelAcesso = nivelAcesso;
}
}
