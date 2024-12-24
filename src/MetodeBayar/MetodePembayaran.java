package metodeBayar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public interface MetodePembayaran {
    public double BayarCash(double cash, double belanja);
    public double BayarQris(double saldo, String kode, double totalBelanja);
    public double BayareWallet(double saldo, int pin, int rekening, double totalBelanja);
    public double BayarKreditCard(double saldo, int pin, int rekening, double totalBelanja);
    public double BayarDebitCard(double saldo, int pin, int rekening, double totalBelanja);
}
