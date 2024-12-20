/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

/**
 *
 * @author hp
 */

public class Kalkulator {
    
    double a, b;

    public double Tambah(double a, double b) {
        return a + b;
    }

    public double Kurang(double a, double b) {
        return a - b;
    }

    public double Kali(double a, double b) {
        return a * b;
    }

    public double Bagi(double a, double b) {
        if (b == 0) {
            System.out.println("Pembagian tidak boleh angka 0");
        }
        return a / b;
    }

    public double Sin(double a) {
        return Math.sin(Math.toRadians(a));
    }

    public double Cos(double a) {
        return Math.cos(Math.toRadians(a));
    }

    public double Tan(double a) {
        return Math.tan(Math.toRadians(a));
    } 
}
