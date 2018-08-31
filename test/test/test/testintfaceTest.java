/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author panasonic
 */
public class testintfaceTest {
    
    public testintfaceTest() {
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
     * Test of setId method, of class testintface.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int temp = 0;
        testintface instance = new testintface();
        instance.setId(temp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setname method, of class testintface.
     */
    @Test
    public void testSetname() {
        System.out.println("setname");
        String temp = "";
        testintface instance = new testintface();
        instance.setname(temp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getID method, of class testintface.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        testintface instance = new testintface();
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getname method, of class testintface.
     */
    @Test
    public void testGetname() {
        System.out.println("getname");
        testintface instance = new testintface();
        String expResult = "";
        String result = instance.getname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
