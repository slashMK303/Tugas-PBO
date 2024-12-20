package bangunDatar;

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
    
    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }
    
    @Override
    public double hitungLuas() {
        luas = Math.PI * jejari * jejari;
        return luas;
    }
    
    @Override
    public double hitungKeliling() {
        keliling = 2 * Math.PI * jejari;
        return keliling;
    }
}
