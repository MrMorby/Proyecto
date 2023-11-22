/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import BaseDeDatos.Conexion;
import modelo.Jugador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author taurusbasilisk < at twitch.tv/taurusbsilisk >
 */
public class RegistroJugador {
    
    public boolean agregar(Jugador jugador) throws Exception
    {
        try {
            Conexion con = new Conexion();
            //Connection cnx = con.obtenerConexion();
            Connection cnx = con.obtenerConexionOracle();
            
            String query = "insert into jugador(Nombre,Apellido,Sexo,Edad) values(?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, jugador.getNombre());
            stmt.setString(2, jugador.getApellido());
            stmt.setString(3,jugador.getSexo());
            stmt.setInt(4,jugador.getEdad());
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
            
        } catch (SQLException e) {
            System.out.println("Error SQL al insertar jugador " + e.getMessage());
            return false;
        }
    }
    
    
    
}
