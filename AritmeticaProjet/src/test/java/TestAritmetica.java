/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.aritmeticaproject.aritmetica.Aritmetica;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 *
 * @author avilagines
 */
public class TestAritmetica {
    
    private Aritmetica a;
    
  
    @Before
    public void inicial() {
        a = new Aritmetica();
    }
     @Test(expected = IllegalArgumentException.class)
    public void ListaVacia() {
        System.out.println("Lista sin valores");
        List<Double> numeritos = new ArrayList<>();
        a.media(numeritos);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void ListaNula() {
        System.out.println("Media con lista nula");
        List<Double> numeritos = null;
        a.media(numeritos);
    }
       @Test(expected = RuntimeException.class)
           
    public void Negativos() {
        System.out.println("Valores negativos");
        List<Double> numeritos = Arrays.asList(1.0, -1.0);
        a.media(numeritos);
    }
    
    @Test
    public void testMediaValoresOk() {
        System.out.println("Media con valores correctos");
        List<Double> numeros = Arrays.asList(2.0, 2.0, 2.0);
        Double expResult = 2.0;
        Double result = a.media(numeros);
        assertEquals(expResult, result);
    }
    


    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
