/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDeDatos;

import java.nio.file.Paths; // IMPORTACION DE ORACLE
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties; // IMPORTACION DE ORACLE

/**
 *
 * @author administrador
 */
public class Conexion {

    // DE ACA COMIENZA LA CONEXION A ORACLE
    private static final String WALLET_PATH = "C:\\Users\\Duoc\\Desktop\\Proyecto-main\\Proyecto-main\\Wallet_Basededatos";
    private static final String WALLET_PASSWORD = "Basededatos1.";
    private static final String JDBC_URL = "jdbc:oracle:thin:@basededatosproyectojava_high"; // - REEMPLAZA 'testdb_high' EN EL ARCHIVO TNSNAMES.ORA
//                                                                                                    APARECE AL INICIO [NOMBRE DE LA DB]_HIGH";
//                                                                                                TAMBIEN ESTA CUANDO UNO INICIA LA BASE DE DATOS DEBAJO DE LA DESCARGA DE LA WALLET          

    public Connection obtenerConexionOracle() throws Exception {
        // Configuración del wallet
        String trustStorePath = Paths.get(WALLET_PATH, "truststore.jks").toString();
        String keyStorePath = Paths.get(WALLET_PATH, "keystore.jks").toString();

        System.setProperty("oracle.net.tns_admin", WALLET_PATH);
        System.setProperty("javax.net.ssl.trustStore", trustStorePath);
        System.setProperty("javax.net.ssl.trustStorePassword", WALLET_PASSWORD);
        System.setProperty("javax.net.ssl.keyStore", keyStorePath);
        System.setProperty("javax.net.ssl.keyStorePassword", WALLET_PASSWORD);

        Properties properties = new Properties();
        properties.put("user", "ADMIN");
        properties.put("password", WALLET_PASSWORD);

        return DriverManager.getConnection(JDBC_URL, properties);
    }
    // ------- * --------
    
    
    //CON ESTO ES CONEXION A MYSQL
    
//    public Connection obtenerConexion() {
//        Connection connection = null;
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/"nombrebasesql", "usuario", "contraseña");
//            System.out.println("Conexión exitosa");
//        } catch (SQLException e) {
//            System.out.println("Error de conexión" + e.getMessage());
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//        return connection;
//    }
    
    
    // SCRIPT DE BD LIBRERIA EN ORACLE (TABLE LIBRO)
//    
//    CREATE TABLE "ADMIN"."LIBRO" 
//   ("IDLIBRO" NUMBER GENERATED ALWAYS AS IDENTITY INCREMENT BY 1 START WITH 1
//   NOT NULL ENABLE, 
//	"TITULO" VARCHAR2(20 BYTE) COLLATE "USING_NLS_COMP", 
//	"AUTOR" VARCHAR2(20 BYTE) COLLATE "USING_NLS_COMP", 
//	"PUBLICACION" DATE, 
//	"PRECIO" NUMBER(*,0), 
//	"DISPONIBLE" NUMBER(1,0), 
//	 CONSTRAINT "LIBRO_PK" PRIMARY KEY ("IDLIBRO")
//  USING INDEX PCTFREE 10 INITRANS 20 MAXTRANS 255 
//  TABLESPACE "DATA"  ENABLE
//   )  DEFAULT COLLATION "USING_NLS_COMP" SEGMENT CREATION DEFERRED 
//  PCTFREE 10 PCTUSED 40 INITRANS 10 MAXTRANS 255 
// COLUMN STORE COMPRESS FOR QUERY HIGH ROW LEVEL LOCKING LOGGING
//  TABLESPACE "DATA" ;
    
    
}
