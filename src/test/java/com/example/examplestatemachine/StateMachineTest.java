package com.example.examplestatemachine;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class StateMachineTest {
    StateContext sc;
    
    @Before
    public void setUp() {
        sc = new StateContext();
    }
    
    /*
     * Test Sequence: A
     */
    @Test
    public void test_1() {
    	System.out.println("Test Sequence: A");
        sc.actionA();
        assertTrue(sc.isAccept());
    	System.out.println("--------------------------");
    }
    
    /*
     * Test Sequence: B
     */
    @Test
    public void test_2() {
    	System.out.println("Test Sequence: B");
        sc.actionB();
        assertTrue(sc.isAccept());
    	System.out.println("--------------------------");
    }
    
    /*
     * Test Sequence: ABABA
     */
    @Test
    public void test_3() {
    	System.out.println("Test Sequence: ABABA");
        sc.actionA();
        assertTrue(sc.isAccept());
        sc.actionB();
        assertFalse(sc.isAccept());
        sc.actionA();
        assertTrue(sc.isAccept());
        sc.actionB();
        assertFalse(sc.isAccept());
        sc.actionA();
        assertTrue(sc.isAccept());
    	System.out.println("--------------------------");
    }
    
    /*
     * Test Sequence: BAB
     */
    @Test
    public void test_4() {
    	System.out.println("Test Sequence: BAB");
        sc.actionB();
        sc.actionA();
        sc.actionB();
        assertTrue(sc.isAccept());
    	System.out.println("--------------------------");
    }
    
    /*
     * Test Sequence: AAB
     */
    @Test
    public void test_5() {
    	System.out.println("Test Sequence: AAB");
        sc.actionA();
        sc.actionA();
        sc.actionB();
        assertFalse(sc.isAccept());
    	System.out.println("--------------------------");
    }
    
    /*
     * Test Sequence: BAA
     */
    @Test
    public void test_6() {
    	System.out.println("Test Sequence: BAA");
        sc.actionB();
        sc.actionA();
        sc.actionA();
        assertFalse(sc.isAccept());
    	System.out.println("--------------------------");
    }
}
