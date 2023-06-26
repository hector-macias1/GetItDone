/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.agile;

import java.nio.file.Path;
import java.util.Vector;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hecta
 */
public class ProjectTest {
    
    public ProjectTest() {
    }

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }
   

    /**
     * Test of load method, of class Project.
     */
    @org.junit.Test
    public void testLoad() throws Exception {
        System.out.println("load");
        Path path = null;
        Project instance = new Project();
        instance.load(path);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of write method, of class Project.
     */
    @org.junit.Test
    public void testWrite() throws Exception {
        System.out.println("write");
        Path path = null;
        Project instance = new Project();
        instance.write(path);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitle method, of class Project.
     */
    @org.junit.Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Project instance = new Project();
        String expResult = "";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitle method, of class Project.
     */
    @org.junit.Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "";
        Project instance = new Project();
        instance.setTitle(title);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getID method, of class Project.
     */
    @org.junit.Test
    public void testGetID() {
        System.out.println("getID");
        Project instance = new Project();
        String expResult = "";
        String result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setID method, of class Project.
     */
    @org.junit.Test
    public void testSetID() {
        System.out.println("setID");
        String ID = "";
        Project instance = new Project();
        instance.setID(ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Project.
     */
    @org.junit.Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Project instance = new Project();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Project.
     */
    @org.junit.Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Project instance = new Project();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomer method, of class Project.
     */
    @org.junit.Test
    public void testGetCustomer() {
        System.out.println("getCustomer");
        Project instance = new Project();
        Customer expResult = null;
        Customer result = instance.getCustomer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomer method, of class Project.
     */
    @org.junit.Test
    public void testSetCustomer() {
        System.out.println("setCustomer");
        Customer customer = null;
        Project instance = new Project();
        instance.setCustomer(customer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTeam method, of class Project.
     */
    @org.junit.Test
    public void testGetTeam() {
        System.out.println("getTeam");
        Project instance = new Project();
        Team expResult = null;
        Team result = instance.getTeam();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTeam method, of class Project.
     */
    @org.junit.Test
    public void testSetTeam() {
        System.out.println("setTeam");
        Team team = null;
        Project instance = new Project();
        instance.setTeam(team);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTasks method, of class Project.
     */
    @org.junit.Test
    public void testGetTasks() {
        System.out.println("getTasks");
        Project instance = new Project();
        Vector<Task> expResult = null;
        Vector<Task> result = instance.getTasks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTasks method, of class Project.
     */
    @org.junit.Test
    public void testSetTasks() {
        System.out.println("setTasks");
        Vector<Task> tasks = null;
        Project instance = new Project();
        instance.setTasks(tasks);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPath method, of class Project.
     */
    @org.junit.Test
    public void testGetPath() {
        System.out.println("getPath");
        Project instance = new Project();
        Path expResult = null;
        Path result = instance.getPath();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPath method, of class Project.
     */
    @org.junit.Test
    public void testSetPath() {
        System.out.println("setPath");
        Path path = null;
        Project instance = new Project();
        instance.setPath(path);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Project.
     */
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        Project instance = new Project();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
