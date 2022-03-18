package com.company;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;

public class Young_PhysicistTest {
    @Test
    public void test_case1() {
        String data = "101\n";  // range must be smaller than or equal 100
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(Young_Physicist.result(), "out of range");// checking the upper range of n
    }
    @Test
    public void test_case2() {
        String data = "0\n"; // range must be bigger than or equal 0
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(Young_Physicist.result(), "out of range");// checking the upper range of n
    }
    @Test
    public void test_case3() {
        String data = "3\n"+
                "4 1 7 \n"+
                "-2 4 -1 \n"+
                "1 -5 -3 \n";  // first test from website ( case where there is no equilibrium)
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(Young_Physicist.result(), "NO");// checking there is no equilibrium
    }
    @Test
    public void test_case4() {
        String data = "3\n"+
                "3 -1 7 \n"+
                "-5 2 -4 \n"+
                "2 -1 -3 \n";  // second test from website ( case where there is  equilibrium)
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(Young_Physicist.result(), "YES");// checking that there is  equilibrium
    }
    @Test
    public void test_case5() {
        String data = "3\n"+
                "300 -1 7 \n"+
                "-5 2 -400 \n"+
                "2 -100 -3 \n";  // testing variable range (wrong input)
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(Young_Physicist.result(), "out of range");// checking that input is out of range
    }

}