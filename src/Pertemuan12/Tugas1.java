package Pertemuan12;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        
        Scanner zahwa = new Scanner(System.in);

        int bnykNilai;

        System.out.print("Masukkan banyak nilai mahasiswa: ");
        bnykNilai = zahwa.nextInt();

        int[] nilaiMhs = new int[bnykNilai];
        int total = 0;
        double rata2;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = zahwa.nextInt();
            total += nilaiMhs[i];
        }
        rata2 = (double) total / nilaiMhs.length;
        System.out.println();
        System.out.println("Rata-rata: " + rata2);

        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];

        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) tertinggi = nilaiMhs[i];
            if (nilaiMhs[i] < terendah) terendah = nilaiMhs[i];

        }

        System.out.println();
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println();


        int[] nilaiAkhir =new int[bnykNilai];

        for (int i = 0; i < nilaiMhs.length; i++){
            String status = (nilaiMhs[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiMhs[i] + "(" + status + ")" );
        }

    } 
}


// Memasukkan banyaknya nilai mahasiswa yang akan diinput.
// Memasukkan setiap nilai mahasiswa satu per satu.
// Menghitung nilai rata-rata dari seluruh nilai yang dimasukkan.
// Menampilkan nilai tertinggi dan nilai terendah.
// Menampilkan semua nilai yang telah dimasukkan, beserta status kelulusannya (LULUS / TIDAK LULUS).