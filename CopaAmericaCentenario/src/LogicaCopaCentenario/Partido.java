
package LogicaCopaCentenario;
import java.time.LocalDate;
import java.util.ArrayList;

public class Partido implements java.io.Serializable{
    private LocalDate fecha;
    private ArrayList<Gol> golesLocal;
    private ArrayList<Gol> golesVisitante;
    private Seleccion equipoLocal;
    private Seleccion equipoVisitante;    
    
    boolean YaSeJugo = false;
    
    // Constructor
    Partido(LocalDate pFecha, Seleccion pEquipoLocal, Seleccion pEquipoVisitante)
    {
        // falta la fecha        
        golesLocal = new ArrayList<>();
        golesVisitante = new ArrayList<>(); 
        this.equipoLocal = pEquipoLocal;
        this.equipoVisitante = pEquipoVisitante;
        this.fecha = pFecha;
    }
    
    public ArrayList<Gol> getGolesLocal(){
        return golesLocal;
    }
    public ArrayList<Gol> getGolesVisita(){
        return golesVisitante;
    }
    
    public boolean getYajugaron(){
        return this.YaSeJugo;
    }
    
    public void setYajugaron(boolean yaJugaron){
        this.YaSeJugo = yaJugaron;
    }
    
    public Seleccion getLocal(){
        return this.equipoLocal;
    }
    public Seleccion getVisitante(){
        return this.equipoVisitante;
    }
   
    public LocalDate getFecha(){
        return this.fecha;
    }
    
    public void agregarGolesLocal(Gol pGol){
        golesLocal.add(pGol);
    }
    
    public void agregarGolesVisitante(Gol pGol){
        this.golesVisitante.add(pGol);
    }
    
    public void asignarPuntaje(){
        // aqui debemos tomar el dato que digita el usuario en la interfaz
        // y hacer las comparaciones para repartir los puntos a cada seleccion
    }
       
    public String toString(){
        return this.equipoLocal.getNombre() + "   VS   " + this.equipoVisitante.getNombre() +
                ":  " + fecha.toString();
    }
    
    public String ParaImprimir(){
        return this.equipoLocal.getNombre() + " VS " + this.equipoVisitante.getNombre();
    } 
}
