package com.example.myapplication;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;


public class ExampleUnitTest {
    private static MyMath mm;
    @BeforeClass
    public static void  init(){
        mm=new MyMath();
    }
    @Test
    public void addition_isCorrect() {

        System.out.println("hello world!");
    }
    @Test
    public void testAdd(){
        int rs1=mm.add(1,2);
        int rs2=mm.add(1,-1);
        assertEquals(4,rs1);
        assertEquals(0,rs2);
    }
}