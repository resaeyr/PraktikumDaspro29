// • hargaKopi = 10000 + (P mod 5) × 1000 → gantikan Rp12.000 pada soal 
// = 10000 + 4 x 1000 = 14000 
// • hargaTeh = 5000 + (P mod 4) × 1000 → gantikan Rp7.000 pada soal 
// = 5000 + 1 x 1000 = 6000
// • hargaRoti = 15000 + (P mod 6) × 1000 → gantikan Rp20.000 pada soal 
// = 15000 + 5 x 1000 = 20000
// Absen 29

package Pertemuan9;

import java.util.Scanner;

public class KafeDoWhile29 {
    public static void main (String[] args) {
        Scanner zahwa = new Scanner(System.in);
        int kopi, teh, roti;
        String namaPelanggan;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000, totalHarga;

        do {
            System.out.print(" Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = zahwa.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print(" Masukkan jumlah kopi: ");
            kopi = zahwa.nextInt();
            System.out.print(" Masukkan jumlah teh: ");
            teh = zahwa.nextInt();
            System.out.print(" Masukkan jumlah roti: ");
            roti = zahwa.nextInt();
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayarkan: " + totalHarga);
            zahwa.nextLine();
        } while (true);

        System.out.println("Semua transaksi selesai.");

    }
}
