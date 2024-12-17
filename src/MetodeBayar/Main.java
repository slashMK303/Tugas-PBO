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
public class Main {
    public static void main(String[] args) {
        PembayaranBelanja PB = new PembayaranBelanja();
        PB.BayarCash(10000000, 5000);
        System.out.println("Pembayaran Cash \n Kembalian : " + PB.Kembalian + "\n");
        PB.BayarDebitCard(2000, 15, 4578, 500);
        System.out.println("Pembayaran Debit Card \nSisa Saldo :" + PB.Payment + "\n");
        PB.BayarGoPay(56789, 70000, 100000);
        System.out.println("Pembayaran GoPay \n Sisa Saldo : " + PB.Payment + "\n");
        PB.BayarKreditCard(90000, 56789, 45678, 7000);
        System.out.println("Pembayaran Kredit Card \n Sisa Saldo : " + PB.Payment + "\n");
        PB.BayarQris(800000, "kode", 60000);
        System.out.println("Pembayaran Qris \n Sisa Saldo : " + PB.Payment + "\n");
        PB.BayarShopee(7567, 60000, 9000);
        System.out.println("Pembayaran Shopee \n Sisa Saldo : " + PB.Payment + "\n");
        PB.BayareWallet(500000, 546789, 5467, 9000);
        System.out.println("Pembayaran eWallet \n Sisa Saldo : " + PB.Payment + "\n");
    }
}
