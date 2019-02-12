/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Pizza;
import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nutcha
 */
public class PizzaManagerTest {
    
    public PizzaManagerTest() {
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
     * Test of addPizza method, of class PizzaManager.
     */
    @Test
    public void testAddPizza() throws Exception {
        System.out.println("addPizza");
        Pizza p = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        PizzaManager instance = (PizzaManager)container.getContext().lookup("java:global/classes/PizzaManager");
        instance.addPizza(p);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllPizzas method, of class PizzaManager.
     */
    @Test
    public void testGetAllPizzas() throws Exception {
        System.out.println("getAllPizzas");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        PizzaManager instance = (PizzaManager)container.getContext().lookup("java:global/classes/PizzaManager");
        List<Pizza> expResult = null;
        List<Pizza> result = instance.getAllPizzas();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
