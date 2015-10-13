package com.isolomonik.myapplication1;

import junit.framework.TestCase;

/**
 * Created by ira on 14.10.15.
 */
public class TestFactorial extends TestCase {

    public void testFActorial() throws Exception {
        assertEquals(1, MainActivity.factorial(1));
    }
}
