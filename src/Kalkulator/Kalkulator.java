/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kalkulator;

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
            throw new ArithmeticException("Pembagi tidak boleh nol.");
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

    double tambah(double angka1, double angka2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
