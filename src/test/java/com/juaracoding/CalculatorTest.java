package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();

//        calculator.add(10,5);
        //atau bisa dimasukkan ke variable
//        int actual = calculator.add(10,5);
        // dan menjadi
//        Assert.assertEquals(actual,15);

        //expected = 15 dan actual setelah eksekusi
        Assert.assertEquals(calculator.add(10,5),15);
    }

    @Test
    public void testSubtract(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.subtract(10,5),5);
    }
}
