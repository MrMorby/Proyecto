/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import BaseDeDatos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Jugador;

/**
 *
 * @author taurusbasilisk < at twitch.tv/taurusbsilisk >
 */
public class EliminarJugador {
    
    public boolean eliminarJugador(int id) throws Exception
    {
        
        try {
            Conexion con = new Conexion();
            //Connection cnx = con.obtenerConexion();
            Connection cnx = con.obtenerConexionOracle();
            String query = "DELETE FROM jugador WHERE id= ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, id);
            
        if (JOptionPane.showConfirmDialog(null, "¿Estás seguro que deseas eliminar este jugador?", "Modificar jugador", 0) == 0) {
                //Se pega el query
                stmt.executeUpdate();

                //Cierra conx
                stmt.close();
                cnx.close();

                //Mensaje de Ã©xito
                JOptionPane.showMessageDialog(null, "Se ha eliminado el jugador con Éxito.", "Modificar jugador", 1);

                //Retorna booleano exitoso porfavortelopidoestoyllorandoretornabien
                return true;

            } else {
                //Se cierran las conexiones
                stmt.close();
                cnx.close();

                //
                JOptionPane.showMessageDialog(null, "Se ha cancelado la operación", "Elimnar jugador", 1);

                //Retorna booleano exitoso
                return false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(RegistroJugador.class.getName()).log(Level.SEVERE, null, ex);
            //Mensaje de alerta de error
            JOptionPane.showMessageDialog(null, "Error al eliminar jugador: " + ex, "Eliminar jugador", 1);
            //Mensaje de error en consola
            System.out.println("Error al modificar jugador: " + ex);
            return false;
        }
    }
}
