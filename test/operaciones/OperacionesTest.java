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

    Operaciones operaciones = new Operaciones();

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
    /**
     * Test of rango method, of class Operaciones. El método rango recibe 2
     * parámetros de tipo int y retorna un array de tipo int. El resultado
     * esperado tras la ejecución de dicho método es un array con todos los
     * valores enteros comprendidos entre los dos parámetros (ambos incluidos)
     * en orden ascendente (de menor a mayor).
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

    /**
     * Si el primer parámetro es mayor que el segundo, debe generar igualmente
     * el rango en orden ascendente.
     */

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
     * Test of sumRango method, of class Operaciones. El método sumRango recibe
     * 2 parámetros de tipo int y retorna un entero. El resultado esperado como
     * retorno es la suma de todos los valores comprendidos entre los dos
     * parámetros (ambos incluidos). El método debe retornar el cálculo correcto
     * con indiferencia del orden en el que reciba los dos argumentos.
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
    @Ignore
    @Test
    public void testIsPar() {
        System.out.println("isPar");
        int a = 0;
        Operaciones instance = new Operaciones();
        boolean expResult = false;
        boolean result = instance.isPar(a);
        assertEquals(expResult, result);
    }

    /**
     * Test of extraerPositivos method, of class Operaciones.
     */
    @Ignore
    @Test
    public void testExtraerPositivos() {
        System.out.println("extraerPositivos");
        int[] nums = null;
        Operaciones instance = new Operaciones();
        int[] expResult = null;
        int[] result = instance.extraerPositivos(nums);
        assertArrayEquals(expResult, result);
    }

}
