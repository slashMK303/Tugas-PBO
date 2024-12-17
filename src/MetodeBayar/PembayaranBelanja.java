package MetodeBayar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class PembayaranBelanja implements MetodeBayarPakaiAplikasi{
    double Kembalian;
    double Payment;
    @Override
    public double BayarGoPay(int id_user, double saldo, double BelanjaanTotal) {
        if(saldo >= BelanjaanTotal){
            Payment = saldo - BelanjaanTotal;}
        return Payment;
    }

    @Override
    public double BayarShopee(int id_user, double saldo, double BelanjaanTotal) {
        if(saldo >= BelanjaanTotal){
            Payment = saldo - BelanjaanTotal;}
        return Payment;
    }

    @Override
    public double BayarCash(double cash, double belanja) {
        Kembalian = cash - belanja; 
        return Kembalian;
    }

    @Override
    public double BayarQris(double saldo, String kode, double totalBelanja) {
    if(saldo >= totalBelanja){
            Payment = saldo - totalBelanja;}
    if(kode == kode){
        System.out.println("Kode Benar");}
        return Payment;}

    @Override
    public double BayareWallet(double saldo, int pin, int rekening, double totalBelanja) {
    if(saldo >= totalBelanja){
            Payment = saldo - totalBelanja;}
    if(pin == pin){
            System.out.println("Pin Benar");}
    if(rekening == rekening){
            System.out.println("-");}
        else{
        System.out.println("Rekening Benar");
    }  
        return Payment;
    }

    @Override
    public double BayarKreditCard(double saldo, int pin, int rekening, double totalBelanja) {
    if(saldo >= totalBelanja){
            Payment = saldo - totalBelanja;}
    if(pin == pin){
            System.out.println("Pin Benar");}
    if(rekening == rekening){
            System.out.println("-");}
        else{
        System.out.println("Rekening Benar");
    }  
        return Payment;
    }

    @Override
    public double BayarDebitCard(double saldo, int pin, int rekening, double totalBelanja) {
    if(saldo >= totalBelanja){
            Payment = saldo - totalBelanja;}
    if(pin == pin){
            System.out.println("Pin Benar");}
    if(rekening == rekening){
            System.out.println("-");}
        else{
        System.out.println("Rekening Benar");
    }  
        return Payment;
    }
}
