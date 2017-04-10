
package LogicaCopaCentenario;


public class Tecnico extends Persona implements java.io.Serializable{
    
    private String nacionalidad;
    private String seleccion;
    
    public Tecnico(String pNombre, double pPeso, double pEstatura, int pEdad,
            String pNacionalidad) {
        super(pNombre, pPeso, pEstatura, pEdad);
        nacionalidad = pNacionalidad;
        
    }
    
    public void asignarSeleccion(String pSeleccion){seleccion = pSeleccion;}
    public String getNacionalidad(){return nacionalidad;}
    public void setNacionalidad(String pNacionalidad){nacionalidad = pNacionalidad;}
    
}
