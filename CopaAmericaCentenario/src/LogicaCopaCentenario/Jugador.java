
package LogicaCopaCentenario;

public class Jugador extends Persona implements java.io.Serializable{
    
    private int posicion;
    private String banderaSeleccion;
    private int cantGoles;
    private Seleccion seleccion;
    
    Jugador(String pNombre, double pPeso, double pEstatura,
            int pEdad, int pPosicion, int pSelecion){
        super(pNombre, pPeso, pEstatura,pEdad);
        posicion = pPosicion;
        cantGoles = 0;
        seleccion = null;
    }
    public Seleccion getSelecion(){return seleccion;}
    public void setSeleccion(Seleccion pSeleccion){seleccion = pSeleccion;}
    public int getPosicion(){return posicion;}
    public void setPosicion(int pPosicion){posicion = pPosicion;}
    public String getBanderaSeleccion(){return banderaSeleccion;}
    public void setBanderaSeleccion(String pBanderaSeleccion){banderaSeleccion = pBanderaSeleccion;}
    public int getCantGoles(){return cantGoles;}
    public void incrementarCantGoles(){cantGoles++;}
    public void decrementarCantGoles(){cantGoles--;}
    
}
