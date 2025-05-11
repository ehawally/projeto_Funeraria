package entities;

public class Administrador {
    protected String areaVisualizacao;

public Administrador(){

}   
public Administrador (String areaVisualizacao){
    this.areaVisualizacao = areaVisualizacao;
}
public String getareaVisualizacao(){
    return areaVisualizacao;
}
public void setareaVisualizacao (String areaVisualizacao){
    this.areaVisualizacao = areaVisualizacao;
}
}
