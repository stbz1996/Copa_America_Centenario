
package LogicaCopaCentenario;

//import GUI.Usuario.menuUsuario;
import Gui_Administrador.MenuAdministrador;
import Gui_Administrador.PantallaInicial;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ProyectoCopaCentenario {

    public static void main(String[] args) throws Exception {
        Copa copa = Copa.getInstance();
        copa = leerArchivo(copa);        
        copa.setCopa(copa);
        
        // crea las selecciones y demas datos automaticos
        //copa.getSelecciones().clear();
        //copa.getEstadios().clear();
        /*cargarSelecciones();
        cargarJugadoresGrupoA();
        cargarJugadoresGrupoB();
        cargarJugadoresGrupoC();
        cargarJugadoresGrupoD();
        
        /*
        copa.crearArbitro("Steven", "Costarricense", "");
        copa.crearArbitro("Erick", "Cubano", "");
        copa.crearArbitro("Jorge", "Paisa", "");
        copa.crearEstadio("Morera Soto", "Alajuela Costa Rica", "", 4);
        copa.crearEstadio("Rosabal Cordero", "Heredia Costa Rica", "", 4);
        */        
        
        
        // datos iniciales 
        PantallaInicial inicio = new PantallaInicial();
        guardarArchivo(copa);        
    }
    public static void cargarSelecciones() throws Exception{
        Copa copa = Copa.getInstance();
        File rutaBandera = new File("src\\imagenes\\selecciones\\usa.gif");                
        copa.crearSeleccion("Estados Unidos", rutaBandera.toString());
        
        rutaBandera = new File("src\\imagenes\\selecciones\\colombia.png");
        copa.crearSeleccion("Colombia", rutaBandera.toString());
        
        rutaBandera = new File("src\\imagenes\\selecciones\\costaRica.jpg");                
        copa.crearSeleccion("Costa Rica", rutaBandera.toString());
        
        rutaBandera = new File("src\\imagenes\\selecciones\\paraguay.png");                
        copa.crearSeleccion("Paraguay", rutaBandera.toString());
        
        rutaBandera = new File("src\\imagenes\\selecciones\\brasil.gif");                
        copa.crearSeleccion("Brasil", rutaBandera.toString());
        
        rutaBandera = new File("src\\imagenes\\selecciones\\ecuador.png");               
        copa.crearSeleccion("Ecuador", rutaBandera.toString());
        
        rutaBandera = new File("src\\imagenes\\selecciones\\haiti.png");               
        copa.crearSeleccion("Haití", rutaBandera.toString());
        
        rutaBandera = new File("src\\imagenes\\selecciones\\peru.png");                
        copa.crearSeleccion("Perú", rutaBandera.toString());
        
        rutaBandera = new File("src\\imagenes\\selecciones\\mexico.jpg");               
        copa.crearSeleccion("México", rutaBandera.toString());
        
        rutaBandera = new File("src\\imagenes\\selecciones\\uruguay.png");               
        copa.crearSeleccion("Uruguay", rutaBandera.toString());
        
        rutaBandera = new File("src\\imagenes\\selecciones\\jamaica.png");                
        copa.crearSeleccion("Jamaica", rutaBandera.toString());
        
        rutaBandera = new File("src\\imagenes\\selecciones\\venezuela.jpg");                
        copa.crearSeleccion("Venezuela", rutaBandera.toString());
        
        rutaBandera = new File("src\\imagenes\\selecciones\\argentina.png");                
        copa.crearSeleccion("Argentina", rutaBandera.toString());
        
        rutaBandera = new File("src\\imagenes\\selecciones\\chile.jpg");                
        copa.crearSeleccion("Chile", rutaBandera.toString());
        
        rutaBandera = new File("src\\imagenes\\selecciones\\panama.png");                
        copa.crearSeleccion("Panamá", rutaBandera.toString());
        
        rutaBandera = new File("src\\imagenes\\selecciones\\bolivia.jpg");                                                                                                                                                      
        copa.crearSeleccion("Bolivia", rutaBandera.toString());
    }
    public static void cargarJugadoresGrupoA(){
        Copa copa = Copa.getInstance();
        //ESTADOS UNIDOS
        copa.crearJugador("Brad Guzan", 95, 1.93, 31, 3, 0);//PORTEROS
        copa.crearJugador("Tim Howard", 88, 1.91, 37, 3, 0);
        copa.crearJugador("Ethan Horvath", 88, 1.94, 21, 0, 0);
        copa.crearJugador("Matt Besler", 77, 1.83, 29, 1, 0);//DEFENSAS
        copa.crearJugador("Steven BirnBaum", 78, 1.83, 25, 1, 0);
        copa.crearJugador("John Brooks", 78, 1.93, 23, 1, 0);
        copa.crearJugador("Geoff Cameron", 84, 1.9, 30, 1, 0);
        copa.crearJugador("Timmy Chandler", 78, 1.86, 26, 1, 0);
        copa.crearJugador("Fabian Johnson", 74, 1.83, 28, 1, 0);
        copa.crearJugador("Michael Orozco", 75, 1.8, 30, 1, 0);
        copa.crearJugador("DeAndre Yedlin", 68, 1.73, 22, 1, 0);
        copa.crearJugador("Kyle Beckerman", 75, 1.8, 34, 2, 0);//MEDIOCAMPISTAS
        copa.crearJugador("Alejandro Bedoya", 73, 1.78, 29, 2, 0);
        copa.crearJugador("Michael Bradley", 81, 1.85, 28, 2,0);
        copa.crearJugador("Jermaine Jones", 81, 1.83, 34, 2, 0);
        copa.crearJugador("Perry Kitchen", 82, 1.83, 24, 2, 0);
        copa.crearJugador("Darlington Nagbe", 68, 1.75, 25, 2, 0);
        copa.crearJugador("Christian Pulisic", 63, 1.73, 17, 2, 0);
        copa.crearJugador("Graham Zusi", 73, 1.78, 29, 2, 0);
        copa.crearJugador("Gyasi Zardes", 79, 1.88, 24, 1, 0);//DELANTEROS
        copa.crearJugador("Bobby Wood", 73, 1.78, 23, 1, 0);
        copa.crearJugador("Clint Dempsey", 77, 1.86, 33, 1, 0);
        copa.crearJugador("Chris Wondolowski", 77, 1.83, 33, 1, 0);


        //COLOMBIA
        copa.crearJugador("Davi Ospina", 81, 1.83, 27, 3, 1);//PORTEROS
        copa.crearJugador("Róbinson Zapata", 80, 1.83, 37, 3, 1);
        copa.crearJugador("Cristian Bonilla", 84, 1.87, 23, 3, 1);
        copa.crearJugador("Cristian Zapata", 82, 1.87, 29, 1, 1);//DEFENSAS
        copa.crearJugador("Jeison Murillo", 78, 1.82, 24, 1, 1);
        copa.crearJugador("Santiago Arias", 68, 1.75, 24, 1, 1);
        copa.crearJugador("Stefan Medina", 77, 1.8, 23, 1, 1);
        copa.crearJugador("Óscar Murillo", 84, 1.84, 28, 1, 1);
        copa.crearJugador("Frank Fabra", 72, 1.17, 25, 1, 1);
        copa.crearJugador("Farid Díaz", 72, 1.7, 32, 1, 1);
        copa.crearJugador("Andrés Felipe Roa", 69, 1.76, 23, 2, 1);//MEDIOCAMPISTAS
        copa.crearJugador("Juan Guillermo Cuadrado", 71, 1.78, 28, 2, 1);
        copa.crearJugador("Carlos Sánchez", 74, 1.71, 31, 2, 1);
        copa.crearJugador("James Rodríguez", 75, 1.8, 24, 2, 1);
        copa.crearJugador("Edwin Cardona", 89, 1.9, 23, 2, 1);
        copa.crearJugador("Sebastián Pérez", 70, 1.76, 23, 2, 1);
        copa.crearJugador("Marlos Moreno", 67, 1.73, 19, 0, 1);//DELANTEROS
        copa.crearJugador("Dayro Moreno", 73, 1.77, 30, 0, 1);
        copa.crearJugador("Carlos Bacca", 77, 1.81, 29, 0, 1);
        copa.crearJugador("Roger Martínez", 85, 1.8, 21, 0, 1); 

        //COSTA RICA
        copa.crearJugador("Leonel Moreira", 78, 1.79, 26, 3,2);//PORTEROS
        copa.crearJugador("Patrick Pemberton", 75, 1.78, 34, 3, 2);
        copa.crearJugador("Danny Carvajal", 78, 1.83, 27, 3, 2);
        copa.crearJugador("Cristian Gamboa", 67, 1.75, 26, 1, 2);//DEFENSAS
        copa.crearJugador("Johnny Acosta", 73, 1.76, 32, 1, 2);
        copa.crearJugador("Francisco Calvo", 80, 1.81, 23, 1, 2);
        copa.crearJugador("Kendall Waston", 86, 1.96, 28, 1, 2);
        copa.crearJugador("José Salvatierra", 73, 1.79, 26, 1, 2);
        copa.crearJugador("Ronald Matarrita", 70, 1.75, 21, 1, 2);
        copa.crearJugador("Bryan Oviedo", 70, 1.72, 26, 1, 2);
        copa.crearJugador("Oscar Duarte", 83, 1.84, 27, 1, 2);
        copa.crearJugador("Michael Umaña", 72, 1.78, 33, 1, 2);
        copa.crearJugador("Esteban Granados", 75, 1.83, 30, 2, 2);//MEDIOCAMPISTAS
        copa.crearJugador("Yeltsin Tejeda", 66, 1.79, 24, 2, 2);
        copa.crearJugador("Celso Borges", 84, 1.87, 28, 2, 2);
        copa.crearJugador("Randall Azofeifa", 82, 1.83, 31, 2, 2);
        copa.crearJugador("Bryan Ruiz", 76, 1.88, 30, 2, 2);
        copa.crearJugador("Cristian Bolaños", 68, 1.77, 32, 2, 2);
        copa.crearJugador("Joel Campbell", 71, 1.78, 23, 0, 2);//DELANTEROS
        copa.crearJugador("Johan Venegas", 71, 1.74, 27, 0, 2);
        copa.crearJugador("Álvaro Saborío", 82, 1.83, 34, 0, 2);
        copa.crearJugador("Marco Ureña", 70, 1.79, 26, 0, 2);

        //PARAGUAY
        copa.crearJugador("Justo Villar", 85, 1.8, 38, 3, 3);//PORTEROS
        copa.crearJugador("Antony Silva", 70, 1.9, 32, 3, 3);
        copa.crearJugador("Diego Barreto", 76, 1.82, 34, 3, 3);
        copa.crearJugador("Paulo Da Silva", 76, 1.8, 36, 1, 3);//DEFENSAS
        copa.crearJugador("Pablo Aguilar", 76, 1.8, 29, 1, 3);
        copa.crearJugador("Gustavo Gómez", 85, 1.87, 23, 1, 3);
        copa.crearJugador("Fabián Balvuena", 83, 1.88, 24, 1, 3);
        copa.crearJugador("Miguel Samudio", 74, 1.72, 29, 1, 3);
        copa.crearJugador("Bruno Valdez", 79, 1.83, 23, 21, 3);
        copa.crearJugador("Blas Riveros", 68, 1.78, 18, 1, 3);
        copa.crearJugador("Néstor Ortigoza", 80, 1.76, 31, 2, 3);//MEDIOCAMPISTAS
        copa.crearJugador("Óscar Romero", 75, 1.8, 25, 2, 3);
        copa.crearJugador("Robert Piris Da Motta", 72, 1.78, 21, 2, 3);
        copa.crearJugador("Rodrigo Rojas", 73, 1.8, 28, 2, 3);
        copa.crearJugador("Celso Ortiz", 71, 1.75, 27, 2, 3);
        copa.crearJugador("Miguel Almirón", 70, 1.76, 22, 2, 3);
        copa.crearJugador("Roque Santa Cruz", 80, 1.93, 34, 0, 3);//DELANTEROS
        copa.crearJugador("Nelson Haedo Valdez", 73, 1.78, 32, 0, 3);
        copa.crearJugador("Edgar Benítez", 71, 1.76, 28, 0, 3);
        copa.crearJugador("Derlis González", 64, 1.72, 22, 0, 3);
        copa.crearJugador("Darío Lezcano", 79, 1.78, 25, 0, 3);
        copa.crearJugador("Juan Iturbe", 62, 1.72, 23, 0, 3);
        copa.crearJugador("Jorge Benítez", 80,  1.82, 23, 0, 3);
    }
    public static void cargarJugadoresGrupoB(){
        Copa copa = Copa.getInstance();
        //Seleccion Brazil
        copa.crearJugador("Alisson" , 91 , 1.93 , 23 , 3 , 4);
        copa.crearJugador("Diego Alves", 75 , 1.87 , 30 , 3 , 4);
        copa.crearJugador("Ederson", 76 , 1.81 , 30 , 3, 4);
        copa.crearJugador("Miranda",79,1.86,31, 1, 4);
        copa.crearJugador("Gil",85,1.92,29, 1, 4);
        copa.crearJugador("Marquinhos",75,1.79,22, 1, 4);
        copa.crearJugador("Rodrigo Caio",73,1.82,22, 1, 4);
        copa.crearJugador("Dani Alves",70,1.72,33, 1, 4);
        copa.crearJugador("Filipe Luis",66,1.79,30, 1, 4);
        copa.crearJugador("Fabinho",78,1.88,22, 1, 4);
        copa.crearJugador("Douglas Santos",69,1.73,22, 1, 4);
        copa.crearJugador("Luiz Gustavo",78,1.88,28, 2, 4);
        copa.crearJugador("Elias",75,1.73,31, 2, 4);
        copa.crearJugador("Renato Augusto",81,1.86,21, 2, 4);
        copa.crearJugador("Philippe Coutinho",68,1.71,23, 2, 4);
        copa.crearJugador("Lucas Lima",70,1.74,25, 2, 4);
        copa.crearJugador("Willian",75,1.75,27, 2, 4);
        copa.crearJugador("Casemiro",80,1.84,24, 2, 4);
        copa.crearJugador("Rafinha",71,1.74,23, 2, 4);
        copa.crearJugador("Douglas Costa",67,1.72,25, 0, 4);
        copa.crearJugador("Hulk",85,1.80,29, 0, 4);
        copa.crearJugador("Gabriel",68,1.78,19, 0, 4);
        copa.crearJugador("Ricardo Oliveira",78,1.83,36, 0, 4);

        //Seleccion Ecuador
        copa.crearJugador("Alexander Domínguez",80,1.95,29,3,5);
        copa.crearJugador("Esteban Dreer",79,1.85,34,3,5);
        copa.crearJugador("Máximo Banguera",90,1.88,34,3,5);
        copa.crearJugador("Juan Paredes",72,1.78,28,1,5);
        copa.crearJugador("Gabriel Achilier",83,1.83,29,1,5);
        copa.crearJugador("Arturo Mina",80,1.90,25,1,5);
        copa.crearJugador("Frickson Erazo",78,1.88,28,1,5);
        copa.crearJugador("Robert Arboleda",70,1.80,24,1,5);
        copa.crearJugador("Walter Ayoví",67,1.71,36,1,5);
        copa.crearJugador("Cristian Ramírez",74,1.73,21,1,5);
        copa.crearJugador("Antonio Valencia",78,1.81,30,2,5);
        copa.crearJugador("Ángel Mena",65,1.68,28,2,5);
        copa.crearJugador("Cristhian Noboa",75,1.80,31,2,5);
        copa.crearJugador("Fernando Gaibor",72,1.78,24,2,5);
        copa.crearJugador("Carlos Gruezo",67,1.71,21,2,5);
        copa.crearJugador("Pedro Larrea",69,1.74,30,2,5);
        copa.crearJugador("Jefferson Montero",70,1.73,26,2,5);
        copa.crearJugador("Fidel Martínez",68,1.78,26,2,5);
        copa.crearJugador("Michael Arroyo",72,1.77,29,2,5);
        copa.crearJugador("Enner Valencia",72,1.79,26,0,5);
        copa.crearJugador("Jaime Ayoví",76,1.85,28,0,5);
        copa.crearJugador("Miller Bolaños",53,1.73,26,0,5);
        copa.crearJugador("Juan Cazares",61,1.71,24,0,5);

        //Selección Haiti
        copa.crearJugador("Johny Placide",82,1.81,28,3,6);
        copa.crearJugador("Steward Ceus",95,1.98,29,3,6);
        copa.crearJugador("Luis Odelus",81,1.84,21,3,6);
        copa.crearJugador("Romain Genevois",66,1.80,28,1,6);
        copa.crearJugador("Judelin Aveska",78,1.83,28,1,6);
        copa.crearJugador("Jerome Mechack",79,1.78,26,1,6);
        copa.crearJugador("Stéphane Lambese",84,1.90,21,1,6);
        copa.crearJugador("Reginal Goreux",73,1.75,28,1,6);
        copa.crearJugador("Jean Alcénat",73,1.74,30,1,6);
        copa.crearJugador("Kim Jaggy",68,1.76,33,1,6);
        copa.crearJugador("Alex Christian",70,1.75,22,1,6);
        copa.crearJugador("Kevin Lafrance",80,1.86,26,2,6);
        copa.crearJugador("Jean Marc Alexandre",86,1.80,29,2,6);
        copa.crearJugador("Max Hilaire",85,1.90,30,2,6);
        copa.crearJugador("Soni Mustivar",77,1.78,26,2,6);
        copa.crearJugador("Pascal Millien",70,1.74,30,2,6);
        copa.crearJugador("Sony Norde",74,1.76,26,2,6);
        copa.crearJugador("James Marcelin",79,1.88,29,2,6);
        copa.crearJugador("Jean-Eudes Maurice",71,1.80,29,0,6);
        copa.crearJugador("Kervens Belfort",76,1.85,24,0,6);
        copa.crearJugador("Duckens Nazon",79,1.81,22,0,6);
        copa.crearJugador("Jeff Louis",70,1.78,23,0,6);
        copa.crearJugador("Wilde-Donald Guerrier",72,1.75,27,0,6);

        //Seleccion Peru,
        copa.crearJugador("Diego Penny",81,1.97,32,3,7);
        copa.crearJugador("Pedro Gallese",68,1.89,26,3,7);
        copa.crearJugador("Carlos Cáceda",66,1.75,24,3,7);
        copa.crearJugador("Jair Céspedes",65,1.71,32,1,7);
        copa.crearJugador("Aldo Corzo",75,1.73,27,1,7);
        copa.crearJugador("Christian Ramos",74,1.85,27,1,7);
        copa.crearJugador("Alberto Rodríguez",80,1.82,32,1,7);
        copa.crearJugador("Renato Tapia",78,1.85,20,1,7);
        copa.crearJugador("Cristian Benavente",68,1.72,22,1,7);
        copa.crearJugador("Beto Da Silva",71,1.82,19,1,7);
        copa.crearJugador("Andy Polo",70,1.75,21,2,7);
        copa.crearJugador("Óscar Vilchez",76,1.82,30,2,7);
        copa.crearJugador("Yoshimar Yotún",60,1.71,26,2,7);
        copa.crearJugador("Christian Cueva",63,1.69,24,2,7);
        copa.crearJugador("Edison Flores",65,1.70,22,2,7);
        copa.crearJugador("Paolo Guerrero",77,1.83,32,2,7);
        copa.crearJugador("Raúl Ruidíaz",60,1.67,25,2,7);
        copa.crearJugador("Adán Balbín",75,1.80,29,2,7);
        copa.crearJugador("Miguel Araujo",73,1.82,30,2,7);
        copa.crearJugador("Miguel Trauco",62,1.75,23,0,7);
        copa.crearJugador("Luis Abram",78,1.80,20,0,7);
        copa.crearJugador("Armando Alfageme",72,1.75,25,0,7);
        copa.crearJugador("Alejandro Hohberg",66,1.74,24,0,7);
    }
    public static void cargarJugadoresGrupoC(){
        Copa copa = Copa.getInstance();
        //MEXICO
        copa.crearJugador("Alfredo Talavera", 73, 1.88, 33, 3, 8);//PORTEROS
        copa.crearJugador("José de Jesús Corona", 74, 1.84, 35, 3, 8);
        copa.crearJugador("Guillermo Ochoa", 78, 1.85, 30, 3, 8);
        copa.crearJugador("Paúl Aguilar", 66, 1.78, 30, 1, 8);//DEFENSAS
        copa.crearJugador("Néstor Araujo", 87, 1.88, 24, 1, 8);
        copa.crearJugador("Diego Reyes", 65, 1.93, 23, 1, 8);
        copa.crearJugador("Héctor Moreno", 76, 1.84, 28, 1, 8);
        copa.crearJugador("Yasser Corona", 71, 1.74, 28, 1, 8);
        copa.crearJugador("Jorge Torres Nilo", 75, 1.8, 28, 1, 8);
        copa.crearJugador("Miguel Layún", 66, 1.76, 27, 1, 8);
        copa.crearJugador("Rafaél Márquez", 83, 1.83, 37, 1, 8);
        copa.crearJugador("Jesús Molina", 74, 1.84, 28, 2, 8);//MEDIOCAMPISTAS
        copa.crearJugador("Héctor Herrera", 74, 1.8, 26, 2, 8);
        copa.crearJugador("Jesús Dueñas", 67, 1.74, 27, 2, 8);
        copa.crearJugador("Andrés Guardado", 60, 1.74, 29, 2, 8);
        copa.crearJugador("Javier Hernández", 71, 1.75, 28, 0, 8);//DELANTEROS
        copa.crearJugador("Raúl Alonso Jiménez", 76, 1.9, 25, 0, 8);
        copa.crearJugador("Oribe Peralta", 72, 1.77, 32, 0, 8);
        copa.crearJugador("Jürguen Damm", 67, 1.86, 23, 0, 8);
        copa.crearJugador("Hirving Lozano", 70, 1.74, 20, 0, 8);
        copa.crearJugador("Jesús Manuel Corona", 62, 1.73, 23, 0, 8);
        copa.crearJugador("Javier Aquino", 62, 1.65, 26, 0, 8);

        //URUGUAY
        copa.crearJugador("Fernando Muslera", 88, 1.9, 29, 3, 9);//PORTEROS
        copa.crearJugador("Marín Silva", 88, 1.87, 33, 3, 9);
        copa.crearJugador("Martín Champaña", 88, 1.87, 27, 3, 9);
        copa.crearJugador("Maximiliano Pereira", 75, 1.73, 32, 1, 9);//DEFENSAS
        copa.crearJugador("Mauricio Victorino", 80, 1.8, 33, 1, 9);
        copa.crearJugador("José Giménez", 85, 1.85, 21, 1, 9);
        copa.crearJugador("Diego Godín", 79, 1.87, 30, 1, 9);
        copa.crearJugador("Sebastían Coates", 85, 1.96, 25, 1, 9);
        copa.crearJugador("Jorge Fucile", 70, 1.78, 31, 1, 9);
        copa.crearJugador("Álvaro Pereira", 78, 1.85, 30, 1, 9);
        copa.crearJugador("Mathias Corujo", 76, 1.73, 30, 1, 9);
        copa.crearJugador("Matías Vecino", 85, 1.87, 24, 2, 9);//MEDIOCAMPISTAS
        copa.crearJugador("Cristián Rodríguez", 78, 1.77, 30, 2, 9);
        copa.crearJugador("Álvaro Pereira", 80, 1.85, 30, 2, 9);
        copa.crearJugador("Carlos Sánchez", 74, 1.71, 31, 2, 9);
        copa.crearJugador("Egidio Arévalo", 71, 1.68, 34, 2, 9);
        copa.crearJugador("Nicolás Lodeiro", 75, 1.7, 27, 2, 9);
        copa.crearJugador("Álvaro González", 75, 1.75, 31, 2, 9);
        copa.crearJugador("Diedo Rolán", 71, 1.77, 23, 0, 9);//DELANTEROS
        copa.crearJugador("Luis Suárez", 85, 1.82, 29, 0, 9);
        copa.crearJugador("Edinson Cavani", 74, 1.88, 29, 0, 9);
        copa.crearJugador("Cristian Stuani", 72, 1.86, 29, 0, 9);
        copa.crearJugador("Abel Hernández", 73, 1.85, 25, 0, 9);

        //JAMAICA
        copa.crearJugador("Andre Blake", 85, 1.93, 25, 3, 10);//PORTEROS
        copa.crearJugador("Duwayne Kerr", 90, 1.99, 29, 3, 10);
        copa.crearJugador("Ryan Thompson", 80, 1.85, 31, 3, 10);
        copa.crearJugador("Rosario Harriott", 84, 1.91, 26, 1, 10);//DEFENSAS
        copa.crearJugador("Michael Hector", 85, 1.93, 23, 1, 10);
        copa.crearJugador("Kemar Lawrence", 80, 1.78, 23, 1, 10);
        copa.crearJugador("Adrian Mariappa", 81, 1.78, 27, 1, 10);
        copa.crearJugador("Wes Morgan", 94, 1.85, 32, 1, 10);
        copa.crearJugador("Damano Solomon", 79, 1.8, 30, 1, 10);
        copa.crearJugador("Jermaine Taylor", 83, 1.81, 31, 1, 10);
        copa.crearJugador("Rodolph Austin", 85, 1.83, 31, 2, 10);//MEDIOCAMPISTAS
        copa.crearJugador("Michael Binns", 80, 1.8, 28, 2, 10);
        copa.crearJugador("Chevonne Marsh", 70, 1.6, 22, 2, 10);
        copa.crearJugador("Joel MacAnuff", 82, 1.8, 34, 2, 10);
        copa.crearJugador("Garath McCleary", 79, 1.78, 29, 2, 10);
        copa.crearJugador("Andrew Vanzie", 80, 1.85, 25, 2, 10);
        copa.crearJugador("Je-Vaughn Watson", 75, 1.78, 34, 2, 10);
        copa.crearJugador("Lee Williamso", 75, 1.78, 34, 2, 10);
        copa.crearJugador("Giles Barnes", 79, 1.88, 27, 0, 10);//DELANTEROS
        copa.crearJugador("Simon Dawkins", 70, 1.78, 28, 0, 10);
        copa.crearJugador("Clayton Donaldsor", 79, 1.85, 32, 0, 10);
        copa.crearJugador("Dever Orgill", 80, 1.83, 26, 0, 10);
        copa.crearJugador("Allan Ottey", 79, 1.8, 23, 0, 10);

        //VENEZUELA
        copa.crearJugador("José Contreras", 68, 1.73, 24, 3, 11);//PORTEROS
        copa.crearJugador("Daniel Hernández", 68, 1.75, 22, 3, 11);
        copa.crearJugador("Wuilker Fariñez", 70, 1.8, 28, 3, 11);
        copa.crearJugador("Oswaldo Vizcarrondo", 85, 1.9, 32, 1, 11);//DEFENSAS
        copa.crearJugador("Roberto Rosales", 73, 1.74, 27, 1, 11);
        copa.crearJugador("José Manuel Velázquez", 81, 1.82, 25, 1, 11);
        copa.crearJugador("Alexander González", 69, 1.8, 23, 1, 11);
        copa.crearJugador("Wilker Ángel", 82, 1.9, 23, 1, 11);
        copa.crearJugador("Mikel Villanueva", 78, 1.9, 23, 1, 11);
        copa.crearJugador("Rolf Feltscher", 85, 1.81, 25, 1, 11);
        copa.crearJugador("Tomás Rincón", 78, 1.84, 22, 2, 11);//CENTROCAMPISTAS
        copa.crearJugador("Carlos Suárez", 78, 1.86, 20, 2, 11);
        copa.crearJugador("Arquímedes Figueroa", 68, 1.72, 26, 2, 11);
        copa.crearJugador("Yangel Herrera", 69, 1.69, 22, 2, 11);
        copa.crearJugador("Rómulo Otero", 65, 1.65, 23, 2, 11);
        copa.crearJugador("Juan Pablo Añor", 70, 1.69, 19, 2, 11);
        copa.crearJugador("Alejandro Guerra", 82, 1.9, 20, 2, 11);
        copa.crearJugador("Adalberto Peñaranda", 78, 1.83, 19, 2, 11);
        copa.crearJugador("Luis Manuel Seijas", 75, 1.8, 22, 2, 11);
        copa.crearJugador("Salomón Rondón", 75, 1.86, 26, 0, 11);//DELANTEROS
        copa.crearJugador("Christian Santos", 73, 1.84, 28, 0, 11);
        copa.crearJugador("Josef Martínez", 68, 1.7, 23, 0, 11);
        copa.crearJugador("Yonathan Del Valle", 70, 1.77, 26, 0, 11);
    }
    public static void cargarJugadoresGrupoD(){
        Copa copa = Copa.getInstance();
        //ARGENTINA
        copa.crearJugador("Sergio Romero", 83, 1.93, 29, 3, 12);//PORTEROS
        copa.crearJugador("Nahuel Guzmán", 86, 1.91, 30, 3, 12);
        copa.crearJugador("Mariano Andújar", 88, 1.94, 32, 3, 12);
        copa.crearJugador("Ramiro Mori", 74, 1.85, 25, 1, 12);//DEFENSAS
        copa.crearJugador("Marcos Rojo", 80, 1.87, 27, 1, 12);
        copa.crearJugador("Nicolás Otamendi", 74, .178, 28, 1, 12);
        copa.crearJugador("Facundo Roncaglia", 76, 1.79, 29, 1, 12);
        copa.crearJugador("Gabriel Mercado", 85, 1.82, 29, 1, 12);
        copa.crearJugador("Jonatan Maidana", 86, 1.85, 30, 1, 12);
        copa.crearJugador("Victor Cuesta", 84, 1.87, 27, 1, 12);
        copa.crearJugador("Javier Masherano", 77, 1.74, 32, 2, 12);//MEDIOCAMPISTAS
        copa.crearJugador("Augusto Fernández", 70, 1.73, 30, 2, 12);
        copa.crearJugador("Matías Kranevitter", 75, 1.79, 23, 2, 12);
        copa.crearJugador("Éver Banega", 71, 1.73, 27, 2, 12);
        copa.crearJugador("Lucas Biglia", 73, 1.75, 30, 2, 12);
        copa.crearJugador("Erik Lamela", 70, 1.83, 24, 2, 12);
        copa.crearJugador("Javier Pastore", 75, 1.87, 26, 2, 12);
        copa.crearJugador("Lionel Messi", 67, 1.69, 28, 0, 12);//DELANTEROS
        copa.crearJugador("Gonzalo Higuaín", 75, 1.83, 28, 0, 12);
        copa.crearJugador("Sergio Agüero",69, 1.7, 28,0, 12);
        copa.crearJugador("Ángel Di María", 64, 1.78, 28, 0, 12);
        copa.crearJugador("Nicolás Gaitan", 67, 1.73, 28, 0, 12);
        copa.crearJugador("Ezequiel Lavezzi", 75, 1.73, 31, 0, 12);


        //CHILE
        copa.crearJugador("Claudio Bravo", 70, 1.85, 33, 3, 13);//PORTEROS
        copa.crearJugador("Johnny Herrera", 85, 1.83, 35, 3, 13);
        copa.crearJugador("Christopher Toselli", 75, 1.8, 27, 3, 13);
        copa.crearJugador("Mauricio Isla", 72, 1.78, 27, 1, 13);//DEFENSAS
        copa.crearJugador("José Fuenzalida", 67, 1.7, 31, 1, 13);
        copa.crearJugador("Gonzalo Jara", 79, 1.78, 30, 1, 13);
        copa.crearJugador("Enzo Roco", 84, 1.88, 23, 1, 13);
        copa.crearJugador("Gary Medel", 74, 1.7, 28, 1, 13);
        copa.crearJugador("Eugenio Mena", 68, 1.75, 27, 1, 13);
        copa.crearJugador("Jean Beausejour", 80, 1.78, 32, 1, 13);
        copa.crearJugador("Marcelo Díaz", 65, 1.68, 29, 2, 13);//MEDIOCAMPISTAS
        copa.crearJugador("Francisco Silva", 80, 1.78, 30, 2, 13);
        copa.crearJugador("Erick Pulgar", 85, 1.88, 22, 2, 13);
        copa.crearJugador("Arturo Vidal", 74, 1.78, 29, 2, 13);
        copa.crearJugador("Matías Fernández", 73, 1.77, 30, 2, 13);
        copa.crearJugador("Charles Aránguiz", 71, 1.7, 27, 2, 13);
        copa.crearJugador("Pedro Hernández", 81, 1.87, 29, 2, 13);
        copa.crearJugador("Edson Puch", 70, 1.7, 30, 2, 13);
        copa.crearJugador("Fabián Orellana", 70, 1.68, 30, 0, 13);//DELANTEROS
        copa.crearJugador("Aléxis Sánchez", 74, 1.69, 27, 0, 13);
        copa.crearJugador("Mauricio Pinilla", 78, 1.85, 32, 0, 13);
        copa.crearJugador("Nicolás Castillo", 76, 1.77, 23, 0, 13);
        copa.crearJugador("Eduardo Vargas", 70, 1.75, 26, 0, 13);


        //PANAMA
        copa.crearJugador("Jaime Penedo", 72, 1.83, 34, 3, 14);//PORTEROS
        copa.crearJugador("José Calderón", 75, 1.87, 30, 3, 14);
        copa.crearJugador("Alex Rodríguez", 80, 1.97, 26, 3, 14);
        copa.crearJugador("Luis Henríquez", 78, 1.74, 34, 3, 14);
        copa.crearJugador("Roderck Miller", 83, 1.89, 24, 1, 14);//DEFENSAS
        copa.crearJugador("Fidel Escobar", 74, 1.81, 21, 1, 14);
        copa.crearJugador("Harold Cummings", 85, 1.88, 24, 1, 14);
        copa.crearJugador("Felipe Baloy", 89, 1.86, 35, 1, 14);
        copa.crearJugador("Érick Davis", 78, 1.79, 25, 1, 14);
        copa.crearJugador("Adolfo Machado", 72, 1.82, 24, 1, 14);
        copa.crearJugador("Gabriel Gómez", 80, 1.83, 32, 2, 14);//MEDIOCAMPISTAS
        copa.crearJugador("Aníbal Godoy", 74, 1.83, 26, 2, 14);
        copa.crearJugador("Valentín Pimentel", 80, 1.85, 25, 2, 14);
        copa.crearJugador("Amílcar Henríquez", 72, 1.78, 32, 2, 14);
        copa.crearJugador("Alberto Quintero", 60, 1.65, 28, 2, 14);
        copa.crearJugador("Armando Cooper", 68, 1.73, 28, 2, 14);
        copa.crearJugador("Ricardo Buitrago", 78, 1.85, 35, 0, 14);//DELANTEROS
        copa.crearJugador("Luis Tejada", 76, 1.84, 34, 0, 14);
        copa.crearJugador("Blas Pérez", 78, 1.85, 35, 0, 14);
        copa.crearJugador("Roberto Nurse", 79, 1.84, 32, 0, 14);
        copa.crearJugador("Gabriel Torres", 72, 1.8, 27, 0, 14);
        copa.crearJugador("Abdiel Arroyo", 75, 1.87, 22, 0, 14);
        copa.crearJugador("Ismael Díaz", 72, 1.81, 19, 0, 14);


        //BOLIVIA
        copa.crearJugador("Carlos Lampe", 88, 1.94, 29, 3, 15);//PORTEROS
        copa.crearJugador("Romel Quiñónez", 82, 1.82, 34, 3, 15);
        copa.crearJugador("Guillermo Viscarra", 69, 1.88, 23, 3, 15);
        copa.crearJugador("Ronald Eguino", 79, 1.86, 28, 1, 15);//DEFENSAS
        copa.crearJugador("Nelson Cabrera", 80, 1.92, 33, 1, 15);
        copa.crearJugador("Erwin Saavedra", 66, 1.73, 20, 1, 15);
        copa.crearJugador("Diego Bejarano", 70,  1.74, 24, 1, 15);
        copa.crearJugador("Edward Zenteno", 76, 1.82, 31, 1, 15);
        copa.crearJugador("Marvin Bejarano", 70, 1.72, 28, 1, 15);
        copa.crearJugador("Luis Guitérrez", 86, 1.8, 31, 1, 15);
        copa.crearJugador("Walter Veizaga", 72, 1.79, 27, 2, 15);//MEDIOCAMPISTAS
        copa.crearJugador("Raúl Castro", 71, 1.81, 24, 2, 15);
        copa.crearJugador("Fernando Saucedo", 69, 1.73, 26, 2, 15);
        copa.crearJugador("Cristian Machado", 76, 1.79, 25, 2, 15);
        copa.crearJugador("Pedro Azogue", 76, 1.76, 22, 2, 15);
        copa.crearJugador("Alejandro Meléan", 80, 1.83, 28, 2, 15);
        copa.crearJugador("Samuel Galindo", 78, 1.9, 24, 2, 15);
        copa.crearJugador("Jhasmani Campos", 72, 1.75, 27, 2, 15);
        copa.crearJugador("Martin Smedberg-Dalence", 80, 1.87, 32, 2, 15);
        copa.crearJugador("Rodrigo Ramallo", 70, 1.78, 25, 0, 15);//DELANTEROS
        copa.crearJugador("Juan Carlos Arce", 71, 1.73, 31, 0, 15);
        copa.crearJugador("Bruno Miranda", 68, 1.8, 18, 0, 15);
        copa.crearJugador("Yasmani Duk", 79, 1.87, 28, 0, 15); 
    }

    public static Copa leerArchivo(Copa copaAux){
        File miFile = new File("Objetos");
        try  {                
            ObjectInputStream entrada=new ObjectInputStream(new FileInputStream(miFile));
            copaAux=(Copa)entrada.readObject();
            entrada.close();                                           

            //se puede fundir en una catch Exception
        }catch (IOException ex) {
            System.out.println(ex);
         }catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return copaAux;
   }
    public static void guardarArchivo(Copa copaAux){
        File miFile = new File("Objetos");
        try  {
            ObjectOutputStream salida=new ObjectOutputStream(new FileOutputStream(miFile));
            salida.writeObject(copaAux);
            salida.close();                                             
           
        //se puede fundir en una catch Exception
        }catch (IOException ex) {
            System.out.println(ex);
         }        
   }
}
