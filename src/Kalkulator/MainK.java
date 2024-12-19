/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kalkulator;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class MainK {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Kalkulator kalkulator = new Kalkulator();
            
            while (true) {
                System.out.println("\nSelamat datang di Kalkulator Sederhana");
                System.out.println("Pilih operasi:");
                System.out.println("1. Tambah");
                System.out.println("2. Kurang");
                System.out.println("3. Kali");
                System.out.println("4. Bagi");
                System.out.println("5. Sin");
                System.out.println("6. Cos");
                System.out.println("7. Tan");
                System.out.println("8. Keluar");
                System.out.print("Masukkan pilihan Anda (1-8): ");
                
                int pilihan = scanner.nextInt();
                
                if (pilihan == 8) {
                    System.out.println("Terima kasih telah menggunakan kalkulator ini. Sampai jumpa!");
                    break;
                }
                
                double hasil = 0;
                
                try {
                    if (pilihan >= 1 && pilihan <= 4) {
                        System.out.print("Masukkan angka pertama: ");
                        double angka1 = scanner.nextDouble();
                        
                        System.out.print("Masukkan angka kedua: ");
                        double angka2 = scanner.nextDouble();
                        
                        switch (pilihan) {
                            case 1:
                                hasil = kalkulator.Tambah(angka1, angka2);
                                break;
                            case 2:
                                hasil = kalkulator.Kurang(angka1, angka2);
                                break;
                            case 3:
                                hasil = kalkulator.Kali(angka1, angka2);
                                break;
                            case 4:
                                hasil = kalkulator.Bagi(angka1, angka2);
                                break;
                        }
                    } else if (pilihan >= 5 && pilihan <= 7) {
                        System.out.print("Masukkan sudut (dalam derajat): ");
                        double sudut = scanner.nextDouble();
                        
                        switch (pilihan) {
                            case 5:
                                hasil = kalkulator.Sin(sudut);
                                break;
                            case 6:
                                hasil = kalkulator.Cos(sudut);
                                break;
                            case 7:
                                hasil = kalkulator.Tan(sudut);
                                break;
                        }
                    } else {
                        System.out.println("Pilihan tidak valid.");
                        continue;
                    }
                    
                    System.out.println("Hasil: " + hasil);
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }
    }
}
