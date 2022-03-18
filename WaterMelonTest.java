package com.company;

import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;

public class WaterMelonTest {
    @Test
    public void test_case1() {
        String data = "101\n";  // range must be smaller than or equal 100
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(WaterMelon.Wm(), "out of range");// checking the upper range of n
    }
    @Test
    public void test_case2() {
        String data = "0\n";  // range must be bigger than or equal 1
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(WaterMelon.Wm(), "out of range");// checking the lower range of n
    }
    @Test
    public void test_case3() {
        String data = "2\n";  // check for number 2 (can't be divided)
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(WaterMelon.Wm(), "NO");
    }
    @Test
    public void test_case4() {
        String data = "5\n";  // odd number in range(can't be divided)
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(WaterMelon.Wm(), "NO");
    }
    @Test
    public void test_case5() {
        String data = "6\n";  // even number in range(can be divided)
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(WaterMelon.Wm(), "YES");
    }
    @Test
    public void test_case6() {
        String data = "98\n";  // even number in range(can be divided)
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(WaterMelon.Wm(), "YES");
    }
}