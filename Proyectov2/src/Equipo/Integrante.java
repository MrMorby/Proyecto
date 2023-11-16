package Equipo;

/**
 *
 * @author Diego Acevedo 14-11-2023
 */
public class Integrante {
    
    private String Nombre;
    private String sexo;
    private int edad;
    private int idint;

    public Integrante() {
    }

    public Integrante(String Nombre, String sexo, int edad, int id) {
        this.Nombre = Nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.idint = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getNumero() {
        return edad;
    }

    public void setNumero(int numero) {
        this.edad = numero;
    }

    public int getId() {
        return idint;
    }

    public void setId(int id) {
        this.idint = id;
    }

    @Override
    public String toString() {
        return "Integrante {" + "Nombre=" + Nombre + ", \n Sexo=" + sexo + ", Edad=" + edad + ", ID=" + idint + '}';
    }
    
    
}
