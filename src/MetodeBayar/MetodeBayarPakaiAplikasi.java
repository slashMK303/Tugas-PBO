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
public interface MetodeBayarPakaiAplikasi extends MetodePembayaran{
    public double BayarGoPay(int id_user, double saldo, double BelanjaanTotal);
    public double BayarShopee(int id_user, double saldo, double BelanjaanTotal);
}
