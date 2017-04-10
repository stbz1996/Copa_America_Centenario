
package LogicaCopaCentenario;

import java.util.ArrayList;


public class Seleccion implements java.io.Serializable{
    private String nombre;
    private String bandera;
    private int golesEnContra;
    private int golesAFavor;
    private int golDiferencia;
    private int puntaje;
    private int partidosGanados;
    private int partidosPerdidos;
    private int partidosEmpatados;
    private String grupo;
    private ArrayList<Jugador> jugadores;
    private ArrayList<Gol> golesAnotados;
    private Tecnico tecnico;
    private boolean yaSeVerifico;
    
    public Seleccion(String pNombre, String pBandera){
        this.tecnico = null;
        yaSeVerifico = false;
        nombre = pNombre;
        bandera = pBandera;
        golesEnContra = 0;
        golesAFavor = 0;
        golDiferencia = 0;
        puntaje = 0;
        jugadores = new ArrayList();
        golesAnotados = new ArrayList();
        partidosGanados = 0;
        partidosPerdidos = 0;
        partidosEmpatados = 0;
        
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    
    
    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico pNombre) {
        tecnico = pNombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String pNombre) {
        nombre = pNombre;
    }

    public String getBandera() {
        return bandera;
    }

    public String getGrupo() {
        return grupo;
    }
    
    public void setGrupo(String pGrupo) {
        grupo = pGrupo;
    }
    
    public void setBandera(String pBandera) {
        bandera = pBandera;
    }

    public int getGolesEnContra() {
        return golesEnContra;
    }

    public int getGolesAFavor() {
        return golesAFavor;
    }

    public int getGolDiferencia() {
        calcularGolDiferencia();
        return golDiferencia;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
    public void ganoPartido(){
        puntaje+=3;
        partidosGanados++;
    }
    public void empatoPartido(){
        puntaje+=1;
        partidosEmpatados++;
    }
    public void perdioPartido(){
        partidosPerdidos++;
    }
            
    public void sumarGolAFavor(){
        golesAFavor++;
    }
   public void sumarGolEnContra(){
       golesEnContra++;
   }
   private void calcularGolDiferencia(){
       golDiferencia = golesAFavor - golesEnContra;
   }
   
   public void setYaSeVerifico(boolean x){
       this.yaSeVerifico = x;
   }
   public boolean getYaSeVerifico(){
       return this.yaSeVerifico;
   }
   
    public int getPartidosGanados(){return this.partidosGanados;}
    public int getPartidosPerdidos(){return this.partidosPerdidos;}
    public int getPartidosEmpatados(){return this.partidosEmpatados;}
   
   public int getPartidosJugados(){
       return this.partidosEmpatados + this.partidosGanados + this.partidosPerdidos;}
}
