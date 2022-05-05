/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package programming;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class SingletonTest {
    
    public SingletonTest() {
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
     * Test of getInst method, of class Singleton.
     */
    @Test
    public void testGetInst() {
        System.out.println("getInst");
        Singleton instance = null;
        Singleton result = instance.getInst();
        assertTrue(result instanceof Singleton);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of increment method, of class Singleton.
     */
    @Test
    public void testIncrement() {
        System.out.println("increment");
        Singleton instance = null;
        instance = instance.getInst();
        instance.increment();
        instance.increment();
        int counter = instance.displayCount();
        assertTrue(counter == 2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of displayCount method, of class Singleton.
     */
    @Test
    public void testDisplayCount() {
        System.out.println("displayCount");
        Singleton instance = null;
        instance = instance.getInst();
        assertTrue(instance.displayCount() == 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
