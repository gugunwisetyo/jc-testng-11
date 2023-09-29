package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SalaryTest {
    //ketika gaji >= 7000
    @Test
    public void testGajiLebih(){
        Salary salary = new Salary();
        Assert.assertEquals(salary.hitungGaji(7000),700);
    }
    //ketika gaji < 7000
    @Test
    public void testGajiKurang(){
        Salary salary = new Salary();
        Assert.assertEquals(salary.hitungGaji(6000),300);
    }
}
