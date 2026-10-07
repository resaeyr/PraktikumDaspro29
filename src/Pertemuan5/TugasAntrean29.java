package Pertemuan5;

import java.util.Scanner;

public class TugasAntrean29 {
    public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);

        int kodeLayanan;
        String layanan, loket;

        System.out.println("--- Mesin Antrean Digital Kampus ---");
        System.out.println("1. Legalisir Ijazah");
        System.out.println("2. Surat Keterangan Aktif Kuliah");
        System.out.println("3. Pembayaran UKT");
        System.out.println("4. Pengajuan Cuti Akademik");
        System.out.print("Masukkan kode layanan: ");
        kodeLayanan = zahwa.nextInt();

        switch (kodeLayanan) {
            case 1:
                layanan = "Legalisir Ijazah";
                loket = "Loket A";
                break;
            case 2:
                layanan = "Surat Keterangan Aktif Kuliah";
                loket = "Loket B";
                break;
            case 3:
                layanan = "Pembayaran UKT";
                loket = "Loket C";
                break;
            case 4:
                layanan = "Pengajuan Cuti Akademik";
                loket = "Loket D";
                break;
            default:
                layanan = "Kode Layanan Tidak Tersedia";
                loket = "-";
                break;
        }
        System.out.println("Jenis Layanan : " + layanan);
        System.out.println("Loket Tujuan  : " + loket);
    }
}
