/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author albar
 */
public class OperacionesTest {

    private Operaciones operaciones = new Operaciones();

    public OperacionesTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }


    /**
     * Test of rango method, of class Operaciones. 
     */
    @Test
    public void testRango() {
        System.out.println("rango");
        int a = 1;
        int b = 5;
        int[] result = operaciones.rango(a, b);

        int[] expResult = {1, 2, 3, 4, 5};

        assertArrayEquals(expResult, result);
    }

    @Test
    public void testRango2() {
        System.out.println("rango2");
        int a = 5;
        int b = 1;
        int[] result = operaciones.rango(a, b);

        int[] expResult = {1, 2, 3, 4, 5};

        assertArrayEquals(expResult, result);
    }

    /**
     * Test of sumRango method, of class Operaciones. 
     */
    @Test
    public void testSumRango() {
        System.out.println("sumRango");
        int a = 1;
        int b = 5;
        int result = operaciones.sumRango(a, b);

        int expResult = 15;

        assertEquals(expResult, result);
    }
    @Test
    public void testSumRango2() {
        System.out.println("sumRango");
        int a = 5;
        int b = 1;
        int result = operaciones.sumRango(a, b);

        int expResult = 15;

        assertEquals(expResult, result);
    }

    /**
     * Test of isPar method, of class Operaciones. 
     */
    @Test
    public void testIsPar() {
        System.out.println("isPar");
        int a = 2;
        boolean result = operaciones.isPar(a);

        boolean expResult = true;

        assertEquals(expResult, result);
    }

    @Test
    public void testIsParFalse() {
        System.out.println("ParFalse");
        int a = 5;
        boolean result = operaciones.isPar(a);

        boolean expResult = false;

        assertEquals(expResult, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsParException() {
        System.out.println("ParException");
        int a = 0;
        boolean result = operaciones.isPar(a);
    }
        @Test(expected = IllegalArgumentException.class)
    public void testIsParExceptionNeg() {
        System.out.println("ParException");
        int a = -2;
        boolean result = operaciones.isPar(a);
    }

    /**
     * Test of extraerPositivos method, of class Operaciones. 
     */
    @Test
    public void testExtraerPositivos() {
        System.out.println("extraerPositivos");
        int[] nums = {1, -2, 3, -4, 5};
        int[] result = operaciones.extraerPositivos(nums);

        int[] expResult = {1, 3, 5};
        assertArrayEquals(expResult, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExtraerPositivosException() {
        System.out.println("PositivosException");
        int[] nums = null;
        int[] result = operaciones.extraerPositivos(nums);
    }

    @Test
    public void testExtraerPositivosVacio() {
        System.out.println("PositivosVacio");
        int[] nums = {};
        int[] result = operaciones.extraerPositivos(nums);

        int[] expResult = {};
        assertArrayEquals(expResult, result);
    }

}
