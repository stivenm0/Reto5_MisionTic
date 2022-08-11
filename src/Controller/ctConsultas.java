/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.mdConsultas;
import Vista.vista;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Estiven
 */
public class ctConsultas {
    mdConsultas md;
    
    public ctConsultas(){
        md= new mdConsultas();   
    }
    
    public DefaultTableModel Consulta_1(DefaultTableModel dtm ){
        var rs = md.Consulta_1();
        
        try{
        while(rs.next()){
                int id= rs.getInt(1);
                String nombre = rs.getString(2);
                String apellido = rs.getString(3);
                String ciudad = rs.getString(4);
                dtm.addRow(new Object[]{id, nombre, apellido, ciudad});
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return dtm;
    }
    
    
       public DefaultTableModel Consulta_2(DefaultTableModel dtm ){
        var rs = md.Consulta_2();
        
        try{
        while(rs.next()){
                int id= rs.getInt(1);
                String constructora = rs.getString(2);
                int n_habitaciones = rs.getInt(3);
                String ciudad = rs.getString(4);
                dtm.addRow(new Object[]{id, constructora, n_habitaciones, ciudad});
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return dtm;
    }
       
       public DefaultTableModel Consulta_3(DefaultTableModel dtm ){
        var rs = md.Consulta_3();
        
        try{
        while(rs.next()){
                int id= rs.getInt(1);
                String constructora = rs.getString(2);
                String banco = rs.getString(3);
                int p = rs.getInt(4);
                dtm.addRow(new Object[]{id, constructora, banco, p});
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return dtm;
    }
       
       
       
     
       
       
    
    
    
    
}
