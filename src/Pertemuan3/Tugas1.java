package Pertemuan3;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {

        Scanner zahwa = new Scanner(System.in);

        int lama_cicilan;
        double harga_laptop, uang_muka, cicilan_bulanan, cicilan_pokok, bunga_bulanan, sisa_harga;

        System.out.print("Masukkan harga laptop: ");
        harga_laptop = zahwa.nextDouble();
        System.out.print("Masukkan uang muka: ");
        uang_muka = zahwa.nextDouble();
        System.out.print("Masukkan lama cicilan (bulan): ");
        lama_cicilan = zahwa.nextInt();

        sisa_harga = harga_laptop - uang_muka;
        cicilan_pokok = sisa_harga / lama_cicilan;
        bunga_bulanan = 0.02 * sisa_harga;
        cicilan_bulanan = cicilan_pokok + bunga_bulanan;

        System.out.println("Sisa harga: " + sisa_harga);
        System.out.println("Cicilan pokok: " + cicilan_pokok);
        System.out.println("Bunga bulanan: " + bunga_bulanan);
        System.out.println("Cicilan bulanan: " + cicilan_bulanan);

    }
}
