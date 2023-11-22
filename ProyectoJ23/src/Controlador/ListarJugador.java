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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Jugador;

/**
 *
 * @author taurusbasilisk < at twitch.tv/taurusbsilisk >
 */
public class ListarJugador {
    
     public Jugador buscarPorId(int id) throws Exception
    {
        Jugador jugador = new Jugador();
        try {
            Conexion con = new Conexion();
            //Connection cnx = con.obtenerConexion();
            Connection cnx = con.obtenerConexionOracle();
            String query = "Select * from jugador where id = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                jugador.setId(rs.getInt("id"));
                jugador.setNombre(rs.getString("nombre"));
                jugador.setApellido(rs.getString("apellido"));
                jugador.setSexo(rs.getString("sexo"));
                jugador.setEdad(rs.getInt("edad"));
                
            }
            // Cierre conexion
            rs.close();
            stmt.close();
            cnx.close();
           
            
        } catch (SQLException e) {
            System.out.println("Error SQL al consultar un jugador por id" + e.getMessage());
         
        }
        
        return jugador;
    }
     
          public ArrayList<Jugador> buscarTodos() throws Exception
    {
        ArrayList<Jugador> lista = new ArrayList<>();
        try {
            Conexion con = new Conexion();
            //Connection cnx = con.obtenerConexion();
            Connection cnx = con.obtenerConexionOracle();
            
            String query = "Select * from jugador ORDER by nombre";
            PreparedStatement stmt = cnx.prepareStatement(query);
                        
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                Jugador jugador = new Jugador();
                jugador.setId(rs.getInt("idjugador"));
                jugador.setNombre(rs.getString("Nombre"));
                jugador.setApellido(rs.getString("Apellido"));
                jugador.setSexo(rs.getString("sexo"));
                jugador.setEdad(rs.getInt("edad"));
                lista.add(jugador);
            }
            
            
            rs.close();
            stmt.close();
            cnx.close();
           
            
        } catch (SQLException e) {
            System.out.println("Error SQL al consultar por jugadores " + e.getMessage());
         
        }
        return lista;
    }
     
    
}
