/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demotest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author avilagines
 */
public class NewEmptyJUnitTest {

    public NewEmptyJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("en BeforeClass");
    }

    @AfterClass
    public static void tearDownClass() {

        System.out.println("En AfterClass");
    }

    private Demo d;

    @Before
    public void setUp() {
        System.out.println("En Before");
        d = new Demo();

    }

    @After
    public void tearDown() {
        System.out.println("en After");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    @Test
    public void getNombreTest() {

        System.out.println("Holitatest");

//        comprueba que este metodo da null
        assertNull(d.getNombre());

    }

    @Test
    public void metodoIntegerTest() {

        System.out.println("EnmetodoInteger");
        Demo d = new Demo();
        assertEquals(new Integer(3), d.metodoInteger());

    }
}
