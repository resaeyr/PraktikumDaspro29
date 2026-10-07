package Pertemuan2;

import java.util.Scanner;

public class Bank29 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int jml_tabungan_awal, lama_menabung;
        double prosentease_bunga = 0.02, bunga, jml_tabungan_akhir;

        System.out.println ("masukkan jumlah tabungan awal anda");
        jml_tabungan_awal = input.nextInt();
        System.out.println ("masukkan lama menabung anda");
        lama_menabung = input.nextInt();

        bunga= lama_menabung*prosentease_bunga*jml_tabungan_awal;
        jml_tabungan_akhir = bunga+jml_tabungan_awal;

        System.out.println("Bunga adalah " +bunga);
        System.out.println("Jumlah tabungan akhir adalah " +jml_tabungan_akhir);
    }
    
}

