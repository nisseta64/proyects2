/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplodao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author avilagines
 */
public class BDJDBC implements PersonaDao {
    
     private final List<Persona> personas;
    
    Connection con;

    public BDJDBC() {
        personas = new ArrayList<>();
         try {
               this.con = DriverManager.getConnection("jdbc:derby://localhost:1527/curso", "app", "app");
         } catch (SQLException ex) {
             Logger.getLogger(BDJDBC.class.getName()).log(Level.SEVERE, null, ex);
         }

    }
 
    @Override
    public Persona nueva(Persona p) {
         try {
             Statement stmt = con.createStatement();
             long id = p.getId();
             String nombre = p.getNombre();
             String orden="insert into personas values(%d, '%s')";
             String formateada= String.format(orden,id,nombre);
             stmt.executeUpdate(formateada);
             /*
             Objects.requireNonNull(p);
             assert Objects.isNull(p.getId());
             p.setId(System.nanoTime());
             personas.add(p);
             */
             
         } catch (SQLException ex) {
             Logger.getLogger(BDJDBC.class.getName()).log(Level.SEVERE, null, ex);
         }
         return p;
    }

    @Override
    public List<Persona> todos() {
        
         try {
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("select id, nombre from personas");
             
             while(rs.next()){
                 
                 long id = rs.getInt("id");
                 String nombre = rs.getString("nombre");
                 
                 System.out.println(id+":"+nombre);
                 
                 Persona p = new Persona(nombre);
                 p.setId(id);
                 
                 personas.add(p);
                 
             }
             
             
         } catch (SQLException ex) {
             Logger.getLogger(BDJDBC.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         return Collections.unmodifiableList(personas);
    }
}
  
    
    
    
    
    

