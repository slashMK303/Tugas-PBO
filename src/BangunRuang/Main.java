package BangunRuang;


import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        boolean pilihUlang = true;

        while (pilihUlang) {
            System.out.println("Pilih bangun datar yang ingin dihitung:");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segi Tiga");
            System.out.println("4. Lingkaran");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan (1-5): ");
            int pilihan = scanner.nextInt();

            BangunDatar bangunDatar = null;

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan panjang sisi persegi: ");
                    double sisi = scanner.nextDouble();
                    bangunDatar = new Persegi(sisi);
                    break;
                case 2:
                    System.out.print("Masukkan panjang persegi panjang: ");
                    double panjang = scanner.nextDouble();
                    System.out.print("Masukkan lebar persegi panjang: ");
                    double lebar = scanner.nextDouble();
                    bangunDatar = new PersegiPanjang(panjang, lebar);
                    break;
                case 3:
                    System.out.print("Masukkan alas segitiga: ");
                    double alas = scanner.nextDouble();
                    System.out.print("Masukkan tinggi segitiga: ");
                    double tinggi = scanner.nextDouble();
                    System.out.print("Masukkan panjang sisi 1: ");
                    double sisiMiring = scanner.nextDouble();
                    bangunDatar = new SegiTiga(alas, tinggi, sisiMiring);
                    break;
                case 4:
                    System.out.print("Masukkan jejari lingkaran: ");
                    double jejari = scanner.nextDouble();
                    System.out.print("Masukkan diameter lingkaran: ");
                    double diameter = scanner.nextDouble();
                    bangunDatar = new Lingkaran(jejari, diameter);
                    break;
                case 5:
                    pilihUlang = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    continue;
            }

            if (bangunDatar != null) {
                System.out.printf("Luas: %.2f\n", bangunDatar.hitungLuas());
                System.out.printf("Keliling: %.2f\n", bangunDatar.hitungKeliling());
            }
        }
    }
}
