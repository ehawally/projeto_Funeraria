package entities;
import java.time.LocalDate;

public class Agendamento {
    protected LocalDate dataAgendamento;
    protected int hora;
    protected int cod_agendamento;

public Agendamento(){

}
public Agendamento (LocalDate dataAgendamento, int hora, int cod_agendamento){
    this.dataAgendamento= dataAgendamento;
    this.hora= hora;
    this.cod_agendamento= cod_agendamento;
}
public LocalDate getdataAgendamento(){
    return dataAgendamento;
}
public int gethora(){
    return hora;
}
public int getcod_agendamento(){
    return cod_agendamento;
}
public void setdataAgendamento (LocalDate dataAgendamento){
    this.dataAgendamento= dataAgendamento;

}
public void sethora (int hora){
    this.hora= hora;

}
public void setcod_agendamento (int cod_agendamento){
    this.cod_agendamento= cod_agendamento;
}
}

