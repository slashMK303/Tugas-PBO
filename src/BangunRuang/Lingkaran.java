package BangunRuang;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Lingkaran extends BangunDatar {
    double jejari;
    double diameter;
    
    public Lingkaran(double jejari, double diameter) {
        this.jejari = jejari;
        this.diameter = diameter;
    }
    
    @Override
    public double hitungLuas() {
        luas = 2 * Math.PI * jejari;
        return luas;
    }
    
    @Override
    public double hitungKeliling() {
        keliling = Math.PI * diameter;
        return keliling;
    }
}
