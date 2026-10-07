package Pertemuan5;

import java.util.Scanner;

public class Tugas1Pemilihan29 {

    public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);

        String pesan;

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = zahwa.nextBoolean();

        pesan = (uktLunas) ? "Pembayaran UKT terverifikasi" : "Lakukan pembayaran terlebih dahulu";

        System.out.print("" +pesan);

    }
}
