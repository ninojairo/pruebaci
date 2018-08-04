/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.pruebaci;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jaironino
 */
public class pruebaciTest {
    
    public pruebaciTest() {
    }

    /**
     * Test of sum method, of class pruebaci.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        int n1 = 1;
        int n2 = 2;
        pruebaci instance = new pruebaci();
        int expResult = 3;
        int result = instance.sum(n1, n2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class pruebaci.
     */
    /*@Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        pruebaci.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
