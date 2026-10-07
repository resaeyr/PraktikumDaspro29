package Pertemuan3;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);

        int jml_lembar, total_biaya, total_bayar;
        int biaya_per_lembar = 500;
        int biaya_jilid = 5000;

        System.out.print("Masukkan jumlah lembar: ");
        jml_lembar = zahwa.nextInt();
        total_biaya = jml_lembar * biaya_per_lembar;
        total_bayar = total_biaya + biaya_jilid;

        System.out.println("Total biaya: " + total_bayar);

        }
    }
