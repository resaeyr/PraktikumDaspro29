package Pertemuan2;

import java.util.Scanner;

public class StudiKasusMod {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int lebar_tanah, panjang_tanah, diameter_kolam, panjang_taman;
        double luas_tanah, luas_kolam, luas_taman, sisa_tanah;

        System.out.print("Masukkan lebar tanah: ");
        lebar_tanah = input.nextInt();
        System.out.print("Masukkan panjang tanah: ");
        panjang_tanah = input.nextInt();
        System.out.print("Masukkan diameter kolam: ");
        diameter_kolam = input.nextInt();
        System.out.print("Masukkan panjang taman: ");
        panjang_taman = input.nextInt();

        luas_tanah = lebar_tanah * panjang_tanah;
        luas_kolam = Math.PI * diameter_kolam * diameter_kolam / 4;
        luas_taman = panjang_taman * panjang_taman;
        sisa_tanah = luas_tanah - luas_kolam - luas_taman;

        System.out.println("\n--- Hasil Perhitungan ---");
        System.out.println("Luas tanah: " + luas_tanah);
        System.out.println("Luas kolam: " + luas_kolam);
        System.out.println("Luas taman: " + luas_taman);
        System.out.println("Sisa tanah: " + sisa_tanah);
    }
}
