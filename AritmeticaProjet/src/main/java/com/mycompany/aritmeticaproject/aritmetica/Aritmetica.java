/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aritmeticaproject.aritmetica;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author avilagines
 */
public class Aritmetica {

    public Double media(List<Double>numeritos) {
        if (numeritos == null) {
            throw new IllegalArgumentException("Lista nula");
        }
        if (numeritos.isEmpty()) {
            throw new IllegalArgumentException("Lista vacía");
        }        
        if (numeritos.stream().filter(x -> x < 0).count() != 0) {
            throw new RuntimeException("La lista tiene valores negativos");
        }
        return numeritos.stream().reduce(0.0, (a,b) -> a + b) /  numeritos.size();
        

    }
   
}
