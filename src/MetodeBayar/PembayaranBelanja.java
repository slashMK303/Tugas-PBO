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
public class PembayaranBelanja implements MetodeBayarPakaiAplikasi {

    double Kembalian, Payment;
    int Id_user, Pin, Rekening;

    @Override
    public double BayarGoPay(int id_user, double saldo, double BelanjaanTotal) {
        Id_user = id_user;
        Payment = saldo - BelanjaanTotal;

        return Payment;
    }

    @Override
    public double BayarShopee(int id_user, double saldo, double BelanjaanTotal) {
        Id_user = id_user;
        Payment = saldo - BelanjaanTotal;

        return Payment;
    }

    @Override
    public double BayarCash(double cash, double belanja) {
        Kembalian = cash - belanja;
        
        return Kembalian;
    }

    @Override
    public double BayarQris(double saldo, String kode, double totalBelanja) {
        int potongan;
        switch (kode) {
            case "Diskon10":
                potongan = 10;
                break;
            case "Diskon25":
                potongan = 25;
                break;
            case "Diskon50":
                potongan = 50;
                break;
            default:
                potongan = 0;
                break;
        }
        Payment = saldo - totalBelanja;
        double diskon = (potongan * Payment) / 100;

        Payment = Payment - diskon;
        return Payment;
    }

    @Override
    public double BayareWallet(double saldo, int pin, int rekening, double totalBelanja) {
        Pin = pin;
        Rekening = rekening;
        Payment = saldo - totalBelanja;

        return Payment;
    }

    @Override
    public double BayarKreditCard(double saldo, int pin, int rekening, double totalBelanja) {
        Pin = pin;
        Rekening = rekening;
        Payment = saldo - totalBelanja;

        return Payment;
    }

    @Override
    public double BayarDebitCard(double saldo, int pin, int rekening, double totalBelanja) {
        Pin = pin;
        Rekening = rekening;
        Payment = saldo - totalBelanja;

        return Payment;
    }
}
