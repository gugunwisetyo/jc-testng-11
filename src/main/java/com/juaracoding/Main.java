package com.juaracoding;

public class Main {
    public static void main(String[] args) {
        //Exception
        try {
            int[] angka = {1,2,3};
            System.out.println(angka[10]);
        } catch (Exception e) {
            e.printStackTrace(); //cara 1
//            System.err.println(e); //cara 2
//            System.err.println("Elemen tersebut tidak ada pada array"); //cara 3
        }

        try {
            int pembagian = 100/0;
        } catch (Exception e) {
//            e.printStackTrace();
            System.err.println("#DIV/0!");
        }
        System.out.println("Juara Coding");
    }
}