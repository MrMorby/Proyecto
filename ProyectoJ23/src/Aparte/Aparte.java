/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aparte;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Diego
 */
public class Aparte {
//    

//IMAGEN DEL PROGRAMA 
public Image getIconImage() {
   Image retValue = Toolkit.getDefaultToolkit().
         getImage(ClassLoader.getSystemResource("imagenes/pog.png"));


   return retValue;
}
public Image getIconImage2() {
   Image retValue = Toolkit.getDefaultToolkit().
         getImage(ClassLoader.getSystemResource("imagenes/fulbo"));

   return retValue;
}


}