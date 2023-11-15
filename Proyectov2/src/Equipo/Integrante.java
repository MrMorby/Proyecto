package Equipo;

/**
 *
 * @author Diego Acevedo 14-11-2023
 */
public class Integrante {
    
    private String Nombre;
    private String sexo;
    private int numero;
    private int id;

    public Integrante() {
    }

    public Integrante(String Nombre, String sexo, int numero, int id) {
        this.Nombre = Nombre;
        this.sexo = sexo;
        this.numero = numero;
        this.id = id;
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
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Integrante{" + "Nombre=" + Nombre + ", sexo=" + sexo + ", numero=" + numero + ", id=" + id + '}';
    }
    
    
}
