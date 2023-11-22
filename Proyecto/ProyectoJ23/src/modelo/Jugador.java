/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Diego
 */
public class Jugador {
    
   private String nombre;
   private String apellido;
   private String sexo;
   private int edad;
   private int id;

    public Jugador() {
    }

    public Jugador(String Nombre, String Apellido, String Sexo, int edad, int id) {
        this.nombre = Nombre;
        this.apellido = Apellido;
        this.sexo = Sexo;
        this.edad = edad;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String Apellido) {
        this.apellido = Apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String Sexo) {
        this.sexo = Sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Jugadores{" + "Nombre=" + nombre + ", Apellido=" + apellido + ", Sexo=" + sexo + ", Edad=" + edad + ", ID=" + id + '}';
    }//Custom
    public void JugadorDatos(){
            System.out.println("Nombre: " + nombre + " "+ apellido +"\n"+
                               "Sexo: " + sexo + " "+ "\n"+
                               "Edad: "+ edad + " " + "\n");
    }
   
   
}
