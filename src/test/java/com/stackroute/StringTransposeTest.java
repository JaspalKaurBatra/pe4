/*Write a program to transpose the given string.

        Input String : a quick brown fox jumps over the lazy dog

        Output String: a  kciuq  nworb  xof  spmuj  revo  eht  yzal  god*/


package com.stackroute;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class StringTransposeTest
{

    @Before
    public void setUp(){
        StringTranspose object = new StringTranspose();
    }

    @After
    public void tearDown() throws Exception {
       str = null;
    }

    @Test
    public void TestCase1()
    {
        String passed = "a quick brown fox jumps over the lazy dog";
        String expected = "a  kciuq  nworb  xof  spmuj  revo  eht  yzal  god";
        assertEquals(expected,object.setStringVar(passed));
    }

    @Test
    public void TestCase2()
    {
        String passed = "Hey! Can you reverse this string?";
        String expected = "!yeH naC uoy esrever siht ?gnirts";
        assertEquals(expected,object.setStringVar(passed));
    }

    @Test
    public void TestCase3()
    {
        String passed = "Hey,you";
        String expected = "uoy,yeH";
        assertEquals(expected,object.setStringVar(passed));
    }
}
