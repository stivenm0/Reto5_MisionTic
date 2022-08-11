/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import java.sql.*;

/**
 *
 * @author Estiven
 */
public class Conector {
    
    public static String UBICACION_BD = "ProyectosConstruccion.db";
    
     public static Connection conn() throws SQLException {
        String url = "jdbc:sqlite:" + UBICACION_BD;
        return DriverManager.getConnection(url);
    }//realiza la coneccion a la base de datos
    
}
