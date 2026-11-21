package Pertemuan12;

import java.util.Scanner;

public class SearchNilai29 {
    public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);

        System.out.print("Masukkan banyak elemen: ");
        int n = zahwa.nextInt();

        int[] nilai = new int[n];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai indeks ke-" + i + ": ");
            nilai[i] = zahwa.nextInt();
        }
        System.out.print("Masukkan nilai yang dicari: ");
        int key = zahwa.nextInt();

        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
            }
        if (!ditemukan) {
                System.out.println("Pencarian gagal!");
                System.out.println("Nilai yang dicari: " + key);
                System.out.println("Nilai " + key + " tidak ditemukan dalam " + n + " elemen array.");
        }
    }
}