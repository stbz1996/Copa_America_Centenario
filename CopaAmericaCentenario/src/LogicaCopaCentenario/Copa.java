
package LogicaCopaCentenario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Copa implements java.io.Serializable{
    
    private static Copa instanceCopa = null;
    private ArrayList<Tecnico> tecnicos;
    private ArrayList<Partido> partidos;
    private ArrayList<Partido> cuartosDeFinal;
    private ArrayList<Partido> tercerLugar;
    private ArrayList<Partido> Final;
    private ArrayList<Partido> semifinales;
    private ArrayList<Partido> CopiaPartidosIniciales;
    private ArrayList<Seleccion> selecciones;
    private ArrayList<Integer> grupo1;
    private ArrayList<Integer> grupo2;
    private ArrayList<Integer> grupo3;
    private ArrayList<Integer> grupo4;
    private ArrayList <Seleccion> ordenGrupo1;
    private ArrayList <Seleccion> ordenGrupo2;
    private ArrayList <Seleccion> ordenGrupo3;
    private ArrayList <Seleccion> ordenGrupo4;
    private ArrayList<Gol> goles;
    private String Control;
    private boolean cuartosControl;
    private boolean semiControl;
    
    private final Seleccion campeon;
    private final Seleccion subcampeon;
    
    private Copa(){
        Control = "cuartos";
        cuartosControl = false;
        semiControl = false;
        CopiaPartidosIniciales = new ArrayList();
        grupo1 = new ArrayList();
        grupo2 = new ArrayList();
        grupo3 = new ArrayList();
        grupo4 = new ArrayList();
        tercerLugar = new ArrayList();
        Final = new ArrayList();
        cuartosDeFinal = new ArrayList();
        semifinales = new ArrayList();
        ordenGrupo1 = new ArrayList();
        ordenGrupo2 = new ArrayList();
        ordenGrupo3 = new ArrayList();
        ordenGrupo4 = new ArrayList();
        tecnicos = new ArrayList();
        partidos = new ArrayList();
        selecciones = new ArrayList();
        goles = new ArrayList();
        campeon = null;
        subcampeon = null;
        ponerCerosenGrupos();
      
    }
    
    public void asignarGrupoASelecciones(){
        for(int i = 0; i < 4; i++){
            selecciones.get(grupo1.get(i)).setGrupo("A");
            selecciones.get(grupo2.get(i)).setGrupo("B");
            selecciones.get(grupo3.get(i)).setGrupo("C");
            selecciones.get(grupo4.get(i)).setGrupo("D");
        }
    }
    
    public String getControl(){return this.Control;}
    public void setControl(String cambio){this.Control = cambio;}
    
    public boolean getControlcuartos(){return this.cuartosControl;}
    public void setCuartosControl(boolean cambio){this.cuartosControl = cambio;}
    
    public boolean getsemiControl(){return this.semiControl;}
    public void setsemiControl(boolean cambio){this.semiControl = cambio;}
    
    
   private void ponerCerosenGrupos(){
       for ( int i = 0; i < 4; i++){
           grupo1.add(0);
           grupo2.add(0);
           grupo3.add(0);
           grupo4.add(0);
       }
   }
    
    public static Copa getInstance() {
        if (instanceCopa == null) {
            instanceCopa = new Copa();
        }
        return instanceCopa;
    }
    
    public ArrayList<Integer> getGrupo1(){return grupo1;}
    public ArrayList<Integer> getGrupo2(){return grupo2;}
    public ArrayList<Integer> getGrupo3(){return grupo3;}
    public ArrayList<Integer> getGrupo4(){return grupo4;}
    
    public static void setCopa(Copa pCopa){
        instanceCopa = pCopa;
    }
    
    public ArrayList<Seleccion> getSelecciones(){
        return selecciones;
    }
    
    public ArrayList<Tecnico> getTecnicos(){
        return this.tecnicos;
    }
     
    public ArrayList<Partido> getPartidos(){
        return partidos;
    }
    
    public void crearSeleccion(String pNombre, String pBandera)throws Exception{
        for(int i = 0; i < selecciones.size(); i++){
            
            if((selecciones.get(i).getNombre().equals(pNombre)))  
            {
                throw new Exception("la selección ya existe");
            }
        }
        Seleccion nuevaSeleccion = new Seleccion(pNombre, pBandera);
        selecciones.add(nuevaSeleccion);
    }
    
    
    public void borrarSeleccion(int lugar){
       this.selecciones.remove(lugar);
        
    }
    
    public void ActualizarTecnicos(){
       for (int i = 0; i < selecciones.size(); i++){
           if(selecciones.get(i).getTecnico() != null){
               tecnicos.add(selecciones.get(i).getTecnico());
           }
       }
   }
    
    public void CrearTecnico(int posSeleccion, String nombre, String nacionalidad){        
       Tecnico tecnico = new Tecnico(nombre, 0.1, 0.1, 30, nacionalidad);
       selecciones.get(posSeleccion).setTecnico(tecnico);
    }
    
    public void eliminarJugador(int pSeleccion, int pJugador){
        selecciones.get(pSeleccion).getJugadores().remove(pJugador);
    }
    
    
    public void crearJugador(String pNombre, double pPeso, double pEstatura,
            int pEdad, int pPosicion, int pSelecion){
        
        Jugador jug = new Jugador(pNombre,  pPeso,  pEstatura,
             pEdad,  pPosicion,  pSelecion);
        
        jug.setSeleccion(selecciones.get(pSelecion));
        selecciones.get(pSelecion).getJugadores().add(jug);
    }
    
    public void crearPartido(LocalDate pFecha, Seleccion pEquipoLocal, Seleccion pEquipoVisitante) throws Exception{
        
        for (int i = 0; i < partidos.size(); i++){
            // si juegan los mismos equipos en la misma fecha
            if((partidos.get(i).getLocal().getNombre() == pEquipoLocal.getNombre()) 
                    &&
               (partidos.get(i).getVisitante().getNombre() == pEquipoVisitante.getNombre())
                    &&
               (partidos.get(i).getFecha().toString().equals(pFecha.toString()))
                    ){
                throw new Exception("Estos equipos ya se enfrentan");
            }     
            // si un equipo juega dos partidos el mismo dia
            if((partidos.get(i).getVisitante().getNombre() == pEquipoVisitante.getNombre()) &&
               (partidos.get(i).getFecha().toString().equals(pFecha.toString()))){
                throw new Exception(pEquipoVisitante.getNombre() + " ya tiene un partido esta fecha");
            }
            
            if((partidos.get(i).getLocal().getNombre() == pEquipoLocal.getNombre()) &&
               (partidos.get(i).getFecha().toString().equals(pFecha.toString()))){
                throw new Exception(pEquipoLocal.getNombre() + " ya tiene un partido esta fecha");
            }
        }
        this.partidos.add(new Partido(pFecha, pEquipoLocal, pEquipoVisitante));
    }
    
    public void completarGrupos(int g1_1, int g1_2, int g1_3, int g1_4,
                                int g2_1, int g2_2, int g2_3, int g2_4,
                                int g3_1, int g3_2, int g3_3, int g3_4,
                                int g4_1, int g4_2, int g4_3, int g4_4){
        grupo1.clear();
        grupo2.clear();
        grupo3.clear();
        grupo4.clear();
        
        grupo1.add(g1_1); 
        grupo1.add(g1_2); 
        grupo1.add(g1_3); 
        grupo1.add(g1_4);
        
        grupo2.add(g2_1); 
        grupo2.add(g2_2); 
        grupo2.add(g2_3); 
        grupo2.add(g2_4);
        
        grupo3.add(g3_1); 
        grupo3.add(g3_2); 
        grupo3.add(g3_3); 
        grupo3.add(g3_4);
        
        grupo4.add(g4_1); 
        grupo4.add(g4_2); 
        grupo4.add(g4_3); 
        grupo4.add(g4_4);        
    }


    public void crearGol(LocalDate pFecha, int seleccion, int pIndiceJugador, int pIndicePartido, int pEquipo ){                
        Gol gol = new Gol(pFecha,selecciones.get(seleccion).getJugadores().get(pIndiceJugador));
        if(pEquipo == 1){
            partidos.get(pIndicePartido).agregarGolesLocal(gol);
            partidos.get(pIndicePartido).getVisitante().sumarGolEnContra();
            partidos.get(pIndicePartido).getLocal().sumarGolAFavor();
            
        }else{
            partidos.get(pIndicePartido).agregarGolesVisitante(gol);
            partidos.get(pIndicePartido).getLocal().sumarGolEnContra();
            partidos.get(pIndicePartido).getVisitante().sumarGolAFavor();
        }        
        selecciones.get(seleccion).getJugadores().get(pIndiceJugador).incrementarCantGoles();
        goles.add(new Gol(pFecha,selecciones.get(seleccion).getJugadores().get(pIndiceJugador)));
    }
  
       
    public void crearPartidos(){
        partidos.clear();
        System.out.println("ok " + partidos.size());
        
        String datosFecha = "2016-06-03";
        LocalDate fecha = LocalDate.parse(datosFecha);
        this.partidos.add(new Partido(fecha, selecciones.get(grupo1.get(0)),selecciones.get(grupo1.get(1))));
        datosFecha = "2016-06-03";
        fecha = LocalDate.parse(datosFecha);
        this.partidos.add(new Partido(fecha, selecciones.get(grupo1.get(2)),selecciones.get(grupo1.get(3))));
        
        datosFecha = "2016-06-04";
        fecha = LocalDate.parse(datosFecha);
        this.partidos.add(new Partido(fecha, selecciones.get(grupo2.get(2)),selecciones.get(grupo2.get(3))));
        datosFecha = "2016-06-04";
        fecha = LocalDate.parse(datosFecha);
        this.partidos.add(new Partido(fecha, selecciones.get(grupo2.get(0)),selecciones.get(grupo2.get(1))));
      
        datosFecha = "2016-06-05";
        fecha = LocalDate.parse(datosFecha);
        this.partidos.add(new Partido(fecha, selecciones.get(grupo3.get(2)),selecciones.get(grupo3.get(3))));
        datosFecha = "2016-06-05";
        fecha = LocalDate.parse(datosFecha);
        this.partidos.add(new Partido(fecha, selecciones.get(grupo3.get(0)),selecciones.get(grupo3.get(1))));
        
        datosFecha = "2016-06-06";
        fecha = LocalDate.parse(datosFecha);
        this.partidos.add(new Partido(fecha, selecciones.get(grupo4.get(2)),selecciones.get(grupo4.get(3))));
        datosFecha = "2016-06-06";
        fecha = LocalDate.parse(datosFecha);
        this.partidos.add(new Partido(fecha, selecciones.get(grupo4.get(0)),selecciones.get(grupo4.get(1))));
        
        datosFecha = "2016-06-07";
        fecha = LocalDate.parse(datosFecha);
        this.partidos.add(new Partido(fecha, selecciones.get(grupo1.get(0)),selecciones.get(grupo1.get(2))));
        datosFecha = "2016-06-07";
        fecha = LocalDate.parse(datosFecha);
        this.partidos.add(new Partido(fecha, selecciones.get(grupo1.get(1)),selecciones.get(grupo1.get(3))));
       
        datosFecha = "2016-06-08";
        fecha = LocalDate.parse(datosFecha);
        this.partidos.add(new Partido(fecha, selecciones.get(grupo2.get(0)),selecciones.get(grupo2.get(2))));
        datosFecha = "2016-06-08";
        fecha = LocalDate.parse(datosFecha);
        this.partidos.add(new Partido(fecha, selecciones.get(grupo2.get(1)),selecciones.get(grupo2.get(3))));
      
        datosFecha = "2016-06-09";
        fecha = LocalDate.parse(datosFecha);
        this.partidos.add(new Partido(fecha, selecciones.get(grupo3.get(0)),selecciones.get(grupo3.get(2))));
        datosFecha = "2016-06-09";
        fecha = LocalDate.parse(datosFecha);
        this.partidos.add(new Partido(fecha, selecciones.get(grupo3.get(1)),selecciones.get(grupo3.get(3))));
        
        datosFecha = "2016-06-10";
        fecha = LocalDate.parse(datosFecha);
        this.partidos.add(new Partido(fecha, selecciones.get(grupo4.get(1)),selecciones.get(grupo4.get(3))));
        datosFecha = "2016-06-10";
        fecha = LocalDate.parse(datosFecha);
        this.partidos.add(new Partido(fecha, selecciones.get(grupo4.get(0)),selecciones.get(grupo4.get(2))));
        
        datosFecha = "2016-06-11";
        fecha = LocalDate.parse(datosFecha);
        this.partidos.add(new Partido(fecha, selecciones.get(grupo1.get(1)),selecciones.get(grupo1.get(2))));
        datosFecha = "2016-06-11";
        fecha = LocalDate.parse(datosFecha);
        this.partidos.add(new Partido(fecha, selecciones.get(grupo1.get(0)),selecciones.get(grupo1.get(3))));
        
        datosFecha = "2016-06-12";
        fecha = LocalDate.parse(datosFecha);
        this.partidos.add(new Partido(fecha, selecciones.get(grupo2.get(1)),selecciones.get(grupo2.get(2))));
        datosFecha = "2016-06-13";
        fecha = LocalDate.parse(datosFecha);
        this.partidos.add(new Partido(fecha, selecciones.get(grupo2.get(0)),selecciones.get(grupo2.get(3))));
      
        datosFecha = "2016-06-13";
        fecha = LocalDate.parse(datosFecha);
        this.partidos.add(new Partido(fecha, selecciones.get(grupo3.get(0)),selecciones.get(grupo3.get(3))));
        datosFecha = "2016-06-13";
        fecha = LocalDate.parse(datosFecha);
        this.partidos.add(new Partido(fecha, selecciones.get(grupo3.get(1)),selecciones.get(grupo3.get(2))));
        
        datosFecha = "2016-06-14";
        fecha = LocalDate.parse(datosFecha);
        this.partidos.add(new Partido(fecha, selecciones.get(grupo4.get(1)),selecciones.get(grupo4.get(2))));
        datosFecha = "2016-06-14";
        fecha = LocalDate.parse(datosFecha);
        this.partidos.add(new Partido(fecha, selecciones.get(grupo4.get(0)),selecciones.get(grupo4.get(3))));
            
        // hace una copia de los partidos
        for (int i = 0; i < partidos.size(); i++){
            this.CopiaPartidosIniciales.add(partidos.get(i));
        }
    }
    
    public ArrayList<Partido> getBuackuPartidos(){return this.CopiaPartidosIniciales;}

    public void CrearCuartosFinal(){
        LocalDate fecha = LocalDate.parse("2016-06-16");
        LocalDate fecha1 = LocalDate.parse("2016-06-17");
        LocalDate fecha2 = LocalDate.parse("2016-06-18");
        LocalDate fecha3 = LocalDate.parse("2016-06-18");
        this.cuartosDeFinal.add(new Partido(fecha , ordenGrupo1.get(0), ordenGrupo2.get(1)));
        this.cuartosDeFinal.add(new Partido(fecha1, ordenGrupo2.get(0), ordenGrupo1.get(1)));
        this.cuartosDeFinal.add(new Partido(fecha2, ordenGrupo4.get(0), ordenGrupo3.get(1)));
        this.cuartosDeFinal.add(new Partido(fecha3, ordenGrupo3.get(0), ordenGrupo4.get(1)));
    }                                                     
    
    public ArrayList<Partido> getCuartosFinal(){
        return this.cuartosDeFinal;
    }
    
    public void ordenarGrupos(){
        // ordengrupo1 estan todas las SELECCIONES
        ArrayList<Seleccion> paraOrdenar1 = new ArrayList();
        ArrayList<Seleccion> paraOrdenar2 = new ArrayList();
        ArrayList<Seleccion> paraOrdenar3 = new ArrayList();
        ArrayList<Seleccion> paraOrdenar4 = new ArrayList();
        this.ordenGrupo1.clear();
        this.ordenGrupo2.clear();
        this.ordenGrupo3.clear();
        this.ordenGrupo4.clear();
        for(int i = 0; i < 4; i++){paraOrdenar1.add(selecciones.get(grupo1.get(i)));}
        for(int i = 0; i < 4; i++){paraOrdenar2.add(selecciones.get(grupo2.get(i)));}
        for(int i = 0; i < 4; i++){paraOrdenar3.add(selecciones.get(grupo3.get(i)));}
        for(int i = 0; i < 4; i++){paraOrdenar4.add(selecciones.get(grupo4.get(i)));}
        this.ordenGrupo1 = this.ordenar(paraOrdenar1);
        this.ordenGrupo2 = this.ordenar(paraOrdenar2);
        this.ordenGrupo3 = this.ordenar(paraOrdenar3);
        this.ordenGrupo4 = this.ordenar(paraOrdenar4);
        
        ///////////////////////////////////////////
        ordenGrupo1 = ordenarPorGoles(ordenGrupo1);
        ordenGrupo2 = ordenarPorGoles(ordenGrupo2);
        ordenGrupo3 = ordenarPorGoles(ordenGrupo3);
        ordenGrupo4 = ordenarPorGoles(ordenGrupo4);

    }
    
    private ArrayList<Seleccion> ordenar(ArrayList<Seleccion> ordenar){
         ArrayList<Seleccion> aux = new ArrayList();
         if((ordenar.get(0).getPuntaje() >=  ordenar.get(1).getPuntaje()) &&
           (ordenar.get(0).getPuntaje() >=  ordenar.get(2).getPuntaje()) &&
           (ordenar.get(0).getPuntaje() >=  ordenar.get(3).getPuntaje())){
                        aux.add(ordenar.get(0));
                        ordenar.remove(0);
        }
        
        
        else if((ordenar.get(1).getPuntaje() >=  ordenar.get(2).getPuntaje()) &&
                (ordenar.get(1).getPuntaje() >=  ordenar.get(3).getPuntaje())){
                        aux.add(ordenar.get(1));
                        ordenar.remove(1);
        }
        
        else if((ordenar.get(2).getPuntaje() >=  ordenar.get(3).getPuntaje())){
                        aux.add(ordenar.get(2));
                        ordenar.remove(2);
        }
        else{
            aux.add(ordenar.get(3));
            ordenar.remove(3);
        }
        ////////////////////////////////////////////////////////////////////////
        if((ordenar.get(0).getPuntaje() >=  ordenar.get(1).getPuntaje()) &&
           (ordenar.get(0).getPuntaje() >=  ordenar.get(2).getPuntaje())){
                        aux.add(ordenar.get(0));
                        ordenar.remove(0);
        }
        else if((ordenar.get(1).getPuntaje() >=  ordenar.get(2).getPuntaje())){
                        aux.add(ordenar.get(1));
                        ordenar.remove(1);
        }
        else{
            
            aux.add(ordenar.get(2));
            ordenar.remove(2);
        }
        ////////////////////////////////////////////////////////////////////////
        if((ordenar.get(0).getPuntaje() >=  ordenar.get(1).getPuntaje())){
                        aux.add(ordenar.get(0));
                        aux.add(ordenar.get(1));
                        ordenar.remove(0);
                        ordenar.remove(0);
                        
        }
        else{
            aux.add(ordenar.get(1));
            ordenar.remove(1);
            aux.add(ordenar.get(0));
            ordenar.remove(0);
        }
        ////////////////////////////////////////////////////////////////////////
        return aux;
        
    }
    
    public ArrayList<Seleccion> ordenarPorGoles(ArrayList<Seleccion> ordenar){
        //////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////
        ArrayList<Seleccion> ordenPorGoles1 = new ArrayList();
        
        // añade el primero
        ordenPorGoles1.add(ordenar.get(0));
        
        // añade el segundo y verifica
        if((ordenar.get(1).getPuntaje() == ordenPorGoles1.get(0).getPuntaje()) &&
           (ordenar.get(1).getGolDiferencia() > ordenPorGoles1.get(0).getGolDiferencia())){
            ordenPorGoles1.add(0, ordenar.get(1));
        }
        else{
            ordenPorGoles1.add(ordenar.get(1));
        }
        
        
        // sigue el segundo equipo
        if((ordenar.get(2).getPuntaje() == ordenPorGoles1.get(0).getPuntaje())){
            if(ordenar.get(2).getGolDiferencia() > ordenPorGoles1.get(0).getGolDiferencia()){
                ordenPorGoles1.add(0, ordenar.get(2));
            }
            else{
                if((ordenar.get(2).getPuntaje() == ordenPorGoles1.get(1).getPuntaje())){
                    if(ordenar.get(2).getGolDiferencia() > ordenPorGoles1.get(1).getGolDiferencia()){
                        ordenPorGoles1.add(1, ordenar.get(2));
                    }
                    else{
                        ordenPorGoles1.add(ordenar.get(2));
                    }
                
                }
                else{
                    ordenPorGoles1.add(ordenar.get(2));
                }
            }
        }
        else{
            if((ordenar.get(2).getPuntaje() == ordenPorGoles1.get(1).getPuntaje())){
                if(ordenar.get(2).getGolDiferencia() > ordenPorGoles1.get(1).getGolDiferencia()){
                        ordenPorGoles1.add(1, ordenar.get(2));
                }
                else{
                    ordenPorGoles1.add(ordenar.get(2));
                }
            }
            else{
                ordenPorGoles1.add(ordenar.get(2));
            }
        }
        

        // agrega el ultimo
        if((ordenar.get(3).getPuntaje() == ordenPorGoles1.get(0).getPuntaje())){
            if((ordenar.get(3).getGolDiferencia() >= ordenPorGoles1.get(0).getGolDiferencia())){
                 ordenPorGoles1.add(0, ordenar.get(3));
            }
            else{
                if((ordenar.get(3).getPuntaje() == ordenPorGoles1.get(1).getPuntaje())){
                    if((ordenar.get(3).getGolDiferencia() >= ordenPorGoles1.get(0).getGolDiferencia())){
                         ordenPorGoles1.add(1, ordenar.get(3));
                    }
                    else{
                        // compara con el ultimo
                        if((ordenar.get(3).getPuntaje() == ordenPorGoles1.get(2).getPuntaje())){
                            if((ordenar.get(3).getGolDiferencia() >= ordenPorGoles1.get(2).getGolDiferencia())){
                                ordenPorGoles1.add(2, ordenar.get(3));
                            }
                            else{
                                ordenPorGoles1.add(ordenar.get(3));
                            }
                        }
                        else{
                             ordenPorGoles1.add(ordenar.get(3));
                        }
                    }
                }
                else{
                    // debe verificar el tercero
                    if((ordenar.get(3).getPuntaje() == ordenPorGoles1.get(2).getPuntaje())) {
                        if((ordenar.get(3).getGolDiferencia() >= ordenPorGoles1.get(2).getGolDiferencia())){
                            ordenPorGoles1.add(2,ordenar.get(3));
                        }
                        else{
                            ordenPorGoles1.add(ordenar.get(3));
                        }
                    }
                    else{
                        ordenPorGoles1.add(ordenar.get(3));
                    }
                }
            }
        
        }
        else{
             if((ordenar.get(3).getPuntaje() == ordenPorGoles1.get(1).getPuntaje())) {
                 if((ordenar.get(3).getGolDiferencia() >= ordenPorGoles1.get(1).getGolDiferencia())){
                            ordenPorGoles1.add(1,ordenar.get(3));
                 }
                 else{
                     if((ordenar.get(3).getPuntaje() == ordenPorGoles1.get(2).getPuntaje())) {
                         if((ordenar.get(3).getGolDiferencia() >= ordenPorGoles1.get(2).getGolDiferencia())){
                                    ordenPorGoles1.add(2,ordenar.get(3));
                         }
                         else{
                             ordenPorGoles1.add(ordenar.get(3));
                         }
                     }
                     else{
                         ordenPorGoles1.add(ordenar.get(3));
                     }
                 
                 }
             }
             else{
                 if((ordenar.get(3).getPuntaje() == ordenPorGoles1.get(2).getPuntaje())) {
                         if((ordenar.get(3).getGolDiferencia() >= ordenPorGoles1.get(2).getGolDiferencia())){
                                    ordenPorGoles1.add(2,ordenar.get(3));
                         }
                         else{
                             ordenPorGoles1.add(ordenar.get(3));
                         }
                 }
                 else{
                     ordenPorGoles1.add(ordenar.get(3));
                 }   
             }
        }
        
        ////////////////////
        return ordenPorGoles1;
           
    }

    public void ColocarCuartosFinal(){
        partidos.clear();
        for(int i = 0; i < 4; i++){
            partidos.add(this.cuartosDeFinal.get(i));
        }
    }
    
    public void cargarSemifinales(){
        //se cargan las semifinales
        // 0 -> 2  y 1 -> 3
        
        // ver ganadores
        Seleccion ganador1;
        Seleccion ganador2;
        Seleccion ganador3;
        Seleccion ganador4;
        
        // asigna el ganador 1
        if(partidos.get(0).getGolesLocal().size() > partidos.get(0).getGolesVisita().size()){
            ganador1 = partidos.get(0).getLocal();}
        else{ganador1 = partidos.get(0).getVisitante();}
        
        // asigna el ganador 2
        if(partidos.get(2).getGolesLocal().size() > partidos.get(2).getGolesVisita().size()){
            ganador2 = partidos.get(2).getLocal();}
        else{ganador2 = partidos.get(2).getVisitante();}
        
        // asigna el ganador 3
        if(partidos.get(1).getGolesLocal().size() > partidos.get(1).getGolesVisita().size()){
            ganador3 = partidos.get(1).getLocal();}
        else{ganador3 = partidos.get(1).getVisitante();}
        
        // asigna el ganador 4
        if(partidos.get(3).getGolesLocal().size() > partidos.get(3).getGolesVisita().size()){
            ganador4 = partidos.get(3).getLocal();}
        else{ganador4 = partidos.get(3).getVisitante();}
        
        // crea las semifinales
        partidos.clear();
        LocalDate fecha1 = LocalDate.parse("2016-06-21");
        LocalDate fecha2 = LocalDate.parse("2016-06-22");
        partidos.add(new Partido(fecha1, ganador1, ganador2));
        partidos.add(new Partido(fecha2, ganador3, ganador4));
        semifinales.add(new Partido(fecha1, ganador1, ganador2));
        semifinales.add(new Partido(fecha2, ganador3, ganador4));
    }
    
    public ArrayList<Partido> getSemifinales(){
        return this.semifinales;
    }

    public void cargartercerLugar_y_laGranFinal(){
        Seleccion ganador1; // ganador va a la final
        Seleccion ganador2; // va por el tercer lugar
        Seleccion ganador3; // va a la final
        Seleccion ganador4; // va por el tercer lugar
        
        if(this.semifinales.get(0).getGolesLocal().size() > this.semifinales.get(0).getGolesVisita().size()){
            ganador1 = this.semifinales.get(0).getLocal();// ganador
            ganador2 = this.semifinales.get(0).getVisitante();
        }
        else{
            ganador2 = this.semifinales.get(0).getLocal();
            ganador1 = this.semifinales.get(0).getVisitante();
        }
        if(this.semifinales.get(1).getGolesLocal().size() > this.semifinales.get(1).getGolesVisita().size()){
            ganador3 = this.semifinales.get(1).getLocal();// ganador
            ganador4 = this.semifinales.get(1).getVisitante();
        }
        else{
            ganador3 = this.semifinales.get(1).getLocal();
            ganador4 = this.semifinales.get(1).getVisitante();
        }
        LocalDate fecha1 = LocalDate.parse("2016-06-25");
        LocalDate fecha2 = LocalDate.parse("2016-06-26");
        Final.add(new Partido(fecha2,ganador1, ganador3));
        tercerLugar.add(new Partido(fecha1,ganador2, ganador4));
        partidos.clear();
        partidos.add(new Partido(fecha1,ganador2, ganador4));
    }
    
    public void cargarFinal(){
        partidos.clear();
        partidos.add(this.Final.get(0));
        
    }
    
    public String getCampeon(){
        if(Final.get(0).getGolesLocal().size() > Final.get(0).getGolesVisita().size()){
            return Final.get(0).getLocal().getNombre();}
        else{return Final.get(0).getVisitante().getNombre();}
    
    }
    
    public ArrayList<Partido> getTercerLugar(){
        return this.tercerLugar;
    }
    
    public ArrayList<Partido> getFinal(){
        return this.Final;
    }


    public ArrayList<Seleccion> getOrdenGrupo1(){
        return this.ordenGrupo1;
    }
    public ArrayList<Seleccion> getOrdenGrupo2(){
        return this.ordenGrupo2;
    }
    public ArrayList<Seleccion> getOrdenGrupo3(){
        return this.ordenGrupo3;
    }
    public ArrayList<Seleccion> getOrdenGrupo4(){
        return this.ordenGrupo4;
    }
}
