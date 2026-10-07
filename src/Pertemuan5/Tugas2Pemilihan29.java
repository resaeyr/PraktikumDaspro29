package Pertemuan5;

import java.util.Scanner;

public class Tugas2Pemilihan29 {
    public static void main (String[] args) {
        Scanner zahwa = new Scanner(System.in);

        int jumlahSks;

        System.out.print("Masukkan Jumlah KRS Anda: ");
        jumlahSks = zahwa.nextInt();

        if (jumlahSks <= 24) {
            System.out.println("KRS valid");
        }
        else {
            System.out.println("Melebihi batas");
        }

    }
}
