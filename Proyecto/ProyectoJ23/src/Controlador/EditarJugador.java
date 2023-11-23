/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import BaseDeDatos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Jugador;
/**
 *
 * @author Duoc
 */
public class EditarJugador {
    
    
//    Update query conexion por cada dato de columna per jugador
    
    public Jugador editarJugador(Jugador jugador) throws Exception
    {
            Conexion con = new Conexion();
            //Connection cnx = con.obtenerConexion();
            Connection cnx = con.obtenerConexionOracle();
            String query = "UPDATE jugador SET nombre = ?, apellido = ?, sexo = ?, edad = ?  WHERE id = ?" ;

        try {
            
            
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, jugador.getNombre());
            stmt.setString(2, jugador.getApellido());
            stmt.setString(3,jugador.getSexo());
            stmt.setInt(4,jugador.getEdad());
            stmt.setInt(5,jugador.getId());
            

            stmt.executeUpdate();
            stmt.close();
            cnx.close();


        } catch (SQLException e) {
            System.out.println("Error SQL al consultar un jugador por id" + e.getMessage());

        }

        return jugador;
    }
}
