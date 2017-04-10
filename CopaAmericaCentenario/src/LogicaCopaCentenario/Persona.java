
package LogicaCopaCentenario;

public class Persona implements java.io.Serializable{
    protected String nombre;
    protected double peso;
    protected double estatura;
    protected int edad;
    
    Persona(String pNombre, double pPeso
            ,double pEstatura, int pEdad){
        nombre = pNombre;
        peso = pPeso;
        estatura = pEstatura;
        edad = pEdad;
    }
    
    public String getNombre(){return nombre;}
    public void setNombre(String pNombre){nombre = pNombre;}
    public double getPeso(){return peso;}
    public void setPeso(float pPeso){peso = pPeso;}
    public double getEstatura(){return estatura;}
    public void setEstatura(float pEstatura){estatura = pEstatura;}
    public int getEdad(){return edad;}
    public void setEdad(int pEdad){edad = pEdad;}
    
}
