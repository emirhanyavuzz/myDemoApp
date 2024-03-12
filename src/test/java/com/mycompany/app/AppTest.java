package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;



import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

public class AppTest {

    @Test
    public void testMethod1_SameIntegersInRange_ReturnsTrue() {
        Integer[] intArr = {1, 2, 3, 4, 5};
        ArrayList<Integer> arrListInteger = new ArrayList<>();
        arrListInteger.add(2);
        arrListInteger.add(4);
        assertTrue(App.method1(intArr, arrListInteger, 1, 3));
    }

    @Test
    public void testMethod1_DifferentIntegersInRange_ReturnsFalse() {
        Integer[] intArr = {1, 2, 3, 4, 5};
        ArrayList<Integer> arrListInteger = new ArrayList<>();
        arrListInteger.add(2);
        arrListInteger.add(6);
        assertFalse(App.method1(intArr, arrListInteger, 1, 3));
    }

    @Test
    public void testMethod1_StartIndexOutOfBounds_ReturnsFalse() {
        Integer[] intArr = {1, 2, 3, 4, 5};
        ArrayList<Integer> arrListInteger = new ArrayList<>();
        arrListInteger.add(2);
        assertFalse(App.method1(intArr, arrListInteger, -1, 3));
    }

    @Test
    public void testMethod1_EndIndexOutOfBounds_ReturnsFalse() {
        Integer[] intArr = {1, 2, 3, 4, 5};
        ArrayList<Integer> arrListInteger = new ArrayList<>();
        arrListInteger.add(2);
        assertFalse(App.method1(intArr, arrListInteger, 1, 10));
    }

    @Test
    public void testMethod1_StartIndexGreaterThanEndIndex_ReturnsFalse() {
        Integer[] intArr = {1, 2, 3, 4, 5};
        ArrayList<Integer> arrListInteger = new ArrayList<>();
        arrListInteger.add(2);
        assertFalse(App.method1(intArr, arrListInteger, 3, 1));
    }
}

