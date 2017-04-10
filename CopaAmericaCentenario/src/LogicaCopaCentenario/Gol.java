
package LogicaCopaCentenario;

import java.time.LocalDate;

public class Gol implements java.io.Serializable{
    Jugador anotador;
    LocalDate fecha;
   
    Gol(LocalDate pFecha, Jugador pJugador){
        
        this.anotador = pJugador;
        this.fecha = pFecha;
    }
    public Jugador getAnotador(){
        return this.anotador;
    }
    
    public void setAnotador(Jugador pAnotador){
        this.anotador = pAnotador;
    }
    
    
    
    
}