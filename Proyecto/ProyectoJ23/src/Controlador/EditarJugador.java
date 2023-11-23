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
    
    public Jugador editarJugador(int id) throws Exception
    {
        Jugador jugador = new Jugador();
        try {
            Conexion con = new Conexion();
            //Connection cnx = con.obtenerConexion();
            Connection cnx = con.obtenerConexionOracle();
            String query = "UPDATE jugador SET nombre = ?, apellido = ?, sexo = ?, edad = ?  WHERE id = ?" ;
        //Se carga la plantilla de sentencia
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
}
