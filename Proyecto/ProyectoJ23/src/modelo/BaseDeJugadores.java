
package modelo;

/**
 *
 * @author Diego
 */
import java.util.ArrayList;
import java.util.Collections;

public class BaseDeJugadores {
    
    
    
    //BASE DE DATOS SIMULADA
    
    
    private ArrayList<Jugadores> Jugadores;
    private ArrayList<Usuario> Usuario;
    private ArrayList<String> colecciones;
    
    public BaseDeJugadores(){
        this.Jugadores = new ArrayList<>();
        this.Usuario = new ArrayList<>();
        this.colecciones = new ArrayList<>();
        agregarDatos();
    }

    public ArrayList<Jugadores> getJugadores() {
        return Jugadores;
    }

    public void setJugadores(ArrayList<Jugadores> Jugadores) {
        this.Jugadores = Jugadores;
    }

    public ArrayList<Usuario> getUsuario() {
        return Usuario;
    }

    public void setUsuario(ArrayList<Usuario> Usuario) {
        this.Usuario = Usuario;
    }

    public ArrayList<String> getColecciones() {
        return colecciones;
    }

    public void setColecciones(ArrayList<String> colecciones) {
        this.colecciones = colecciones;
    }
    
    // customs :p
        private void agregarDatos() {

        //Datos de libros
        this.Jugadores.add(new Jugadores("Alexis", "Sanchez", "Masculino", 34, 1));
        this.Jugadores.add(new Jugadores("Arturo", "Vidal", "Masculino", 12, 2));
        this.Jugadores.add(new Jugadores("Sergio", "Ramos", "Masculino", 42, 3));

        //Datos de Bibliotecarios
        this.Usuario.add(new Usuario(1, "217529158", "Diego", "Acevedo", "MrMorby", "Diego123"));
        this.Usuario.add(new Usuario(2, "123123123", "Luis", "Malebran", "", "Luis123"));
        
        //Colecciones
        this.colecciones.add("Delantero");
        this.colecciones.add("Central");
        this.colecciones.add("Arquero");
        this.colecciones.add("Lateral");
        this.colecciones.add("Defensa");

    }

    
}
