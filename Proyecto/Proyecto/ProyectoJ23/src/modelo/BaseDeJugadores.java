
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

        //Datos de Jugadores
        this.Jugadores.add(new Jugadores("Alexis", "Sanchez", "Masculino", 34, 1));
        this.Jugadores.add(new Jugadores("Arturo", "Vidal", "Masculino", 12, 2));
        this.Jugadores.add(new Jugadores("Sergio", "Ramos", "Masculino", 42, 3));
        this.Jugadores.add(new Jugadores("Chupete", "Suazo", "Masculino", 50, 4));
        this.Jugadores.add(new Jugadores("Alonso", "Tapia", "Masculino", 23, 5));
        this.Jugadores.add(new Jugadores("Humberto", "Rodriguez", "Masculino", 52, 6));
        this.Jugadores.add(new Jugadores("Hernán", "Saavedra", "Masculino", 25, 7));
        this.Jugadores.add(new Jugadores("Lucho", "Daurte", "Masculino", 32, 8));
        
        //Datos de Usuarios
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
