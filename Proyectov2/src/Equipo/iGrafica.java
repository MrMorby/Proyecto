/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Equipo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author taurusbasilisk < at twitch.tv/taurusbsilisk >
 */
public class iGrafica {
    
    public static void main(String[] args) {
    ArrayList<Integrante> listaIntegrantes = new ArrayList<>();
    while (true) {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre (o 'fin' para salir):");

        // Salir del bucle si se ingresa "fin"
        if (nombre.equalsIgnoreCase("fin")) {
            break;
        }

        // Pedir la edad
        String edadStr = JOptionPane.showInputDialog("Ingrese su edad:");
        int edad = Integer.parseInt(edadStr);
                
        String sexoStr = JOptionPane.showInputDialog("Ingrese su sexo:");
        String sexo = Integer.parseString(sexoStr);
        
        String idStr = JOptionPane.showInputDialog("Ingrese su id:");
        int id = Integer.parseInt(idStr);

        // Crear un objeto Persona y agregarlo a la lista
        Integrante nuevoIntegrante = new Integrante(nombre, sexoStr, edad, id);
        listaIntegrantes.add(nuevoIntegrante);
    }

    // Mostrar la lista de personas
    StringBuilder mensaje = new StringBuilder("Lista de personas:\n");
    for (Integrante integrante : listaIntegrantes) {
        mensaje.append(integrante).append("\n");
    }

    JOptionPane.showMessageDialog(null, mensaje.toString());
    
    
    }
}

