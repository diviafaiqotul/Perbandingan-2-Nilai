/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 * NAMA  : DIVIA FAIQOTUL CAHYATI
 * PRODI : SISTEM INFORMASI
 * NIM   : 23176021
 * Deskripsi Program : Program ini digunakan untuk membandingkan dua buah nilai
 * Program ini memungkinkan pengguna untuk membandingkan dua nilai berkali-kali hingga pengguna memilih untuk menghentikan aktivitas.
 */

import java.util.Scanner;

public class perbandingan2nilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean ulangi = true;

        System.out.println("=======Program Perbandingan Nilai========");

        while (ulangi) {

            // Input nilai pertama
            System.out.print("Masukkan nilai pertama: ");
            int nilaiPertama = input.nextInt();

            // Input nilai kedua
            System.out.print("Masukkan nilai kedua: ");
            int nilaiKedua = input.nextInt();

            // Menentukan hasil perbandingan
            if (nilaiPertama > nilaiKedua) {
                System.out.println("Hasil: " + nilaiPertama + " Lebih besar dari " + nilaiKedua);
            } else if (nilaiPertama < nilaiKedua) {
                System.out.println("Hasil: " + nilaiPertama + " Lebih kecil dari " + nilaiKedua);
            } else {
                System.out.println("Hasil: " + nilaiPertama + " Sama dengan " + nilaiKedua);
            }
            System.out.println(); 
            // Menanyakan apakah ingin mengulangi aktivitas
            System.out.print("Ulangi Aktivitas? (Ya/Tidak): ");
            String jawaban = input.next();

            if (jawaban.equalsIgnoreCase("Tidak")) {
                ulangi = false;
            }
            System.out.println(); // Menambahkan jarak antar percobaan
            }
        input.close();
        System.out.println("Program selesai.");
    }
}

