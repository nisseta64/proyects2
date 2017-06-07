/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejerciciousuario.usuario;


/**
 *
 * @author avilagines
 */
public class Usuario {
    private String User;
    private String password;
    private String email;

    public Usuario(String User, String password, String email) {
        
        this.User = User;
        this.password = password;
        this.email = email;
    }

    public Usuario(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
