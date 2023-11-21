/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDeDatos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Luis Malebrán 21-11-2022
 */
public class ConexionMySQL {
    
    
    public Connection obtenerConexion()
    {
        Connection con = null;
        //trycatch+tab
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/libreria", "root", "");
            System.out.println("Conexión exitosa!");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de conexion " + e.getMessage());
        }
        return con;
    }
    
}