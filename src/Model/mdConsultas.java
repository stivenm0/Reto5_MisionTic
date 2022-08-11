/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Util.Conector;
import java.sql.*;

/**
 *
 * @author Estiven
 */
public class mdConsultas {

    public ResultSet Consulta_1() {
        ResultSet rs = null;
        try {
            var cnn = Conector.conn();
            String sql = "SELECT ID_lider, nombre, Primer_Apellido, ciudad_residencia FROM lider ORDER BY ciudad_residencia ASC;";
            PreparedStatement stm = cnn.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);
            rs = stm.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }
    
    public ResultSet Consulta_2() {
        ResultSet rs = null;
        try {
            var cnn = Conector.conn();
            String sql = "SELECT ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad FROM Proyecto WHERE Clasificacion='Casa Campestre' AND (Ciudad='Barranquilla' OR Ciudad='Cartagena' OR Ciudad='Santa Marta');";
            PreparedStatement stm = cnn.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);
            rs = stm.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }
    
    public ResultSet Consulta_3() {
        ResultSet rs = null;
        try {
            var cnn = Conector.conn();
            String sql = "SELECT Compra.ID_Compra, Proyecto.Constructora, Proyecto.Banco_vinculado, Proyecto.ID_Proyecto FROM Compra, Proyecto  WHERE Compra.Proveedor='Homecenter' AND Proyecto.Ciudad='Salento' AND Proyecto.ID_Proyecto= Compra.ID_Proyecto;";
            PreparedStatement stm = cnn.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);
            rs = stm.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }

}
