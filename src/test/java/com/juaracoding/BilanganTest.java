package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BilanganTest {
    //test bilangan genap
    @Test
    public void testBilanganGenap(){
        Bilangan bilangan = new Bilangan();
        Assert.assertEquals(bilangan.cekGenapGanjil(4),"genap");
    }
    //test bilangan ganjil
    @Test
    public void testBilanganGanjil(){
        Bilangan bilangan = new Bilangan();
        Assert.assertEquals(bilangan.cekGenapGanjil(5),"ganjil");
    }
}
