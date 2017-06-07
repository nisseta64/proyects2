/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.probajdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author avilagines
 */
public class Conexion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException{
        
        
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/curso", "app", "app");
            System.out.println("conexion Done");
            
            
            
            
                             
            Statement stmt = con.createStatement();
             
            String s= "insert into personas values (?,?)";
            PreparedStatement ps = con.prepareStatement(s);
            ps.setInt(1,29);
            ps.setString(2,"lololo");
            ps.executeUpdate();
             
             
             
//             stmt.execute("insert into personas values (1, 'Niss')");
//             stmt.execute("insert into personas values (2, 'Niss1')");
//             stmt.execute("insert into personas values (3, 'Niss2')");
//             stmt.execute("insert into personas values (4, 'Niss3')");
//             
//             stmt.execute("update personas set nombre='otro2' where id=2");
             
             //stmt.execute("delete into personas values (1, 'Niss')");
            
             
             ResultSet rs = stmt.executeQuery("select id, nombre from personas");
             
             while(rs.next()){
             int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                System.out.println(id+":"+nombre);
             }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        
        
        
    }
    
}
