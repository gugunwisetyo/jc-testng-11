package com.juaracoding;

public class Salary {
    public double hitungGaji(double gaji){
        double pajak = 0.0;
        if (gaji >= 7000){
            return pajak = 0.10 * gaji;
        } else {
            return pajak = 0.05 * gaji;
        }
    }
}
