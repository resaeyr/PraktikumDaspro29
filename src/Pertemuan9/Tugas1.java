// • Harga tiket = 40000 + (P mod 6) × 2000 → gantikan Rp50.000 pada soal 
// = 40000 + 5 x 2000 = 50000
// • Syarat diskon pertama = lebih dari (3 + (P mod 3)) tiket, dengan diskon (8 + (P mod 5))% → gantikan "lebih dari 4 tiket, diskon 10%"
// = ( 3 + 2 ) = > 5 tiket, diskon ( 8 + 4 ) = 12%
// • Syarat diskon kedua = lebih dari (8 + (P mod 4)) tiket, dengan diskon (15 + (P mod 4))% → gantikan "lebih dari 10 tiket, diskon 15%" 
// = ( 8 + 1 ) = > 9 tiket, diskon ( 15 + 1 ) = 16%
// Absen 29


package Pertemuan9;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);

        int totalHarga, hargaTiket = 50000;
        int jmlTiket, totalTiket = 0;
        int totalPenjualan = 0;
        double dptDiskon, diskonTiket;

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli (0 untuk selesai): ");
            jmlTiket = zahwa.nextInt();

            if (jmlTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan ulang.");
                continue;
            }

            if (jmlTiket == 0) {
                break;
            }

            if (jmlTiket > 9) {
                diskonTiket = 0.16;
            } else if (jmlTiket > 5) {
                diskonTiket = 0.12;
            } else {
                diskonTiket = 0;
            }

            totalHarga = jmlTiket * hargaTiket;
            dptDiskon = totalHarga * diskonTiket;
            totalHarga = totalHarga - (int) dptDiskon;

            totalTiket += jmlTiket;
            totalPenjualan += totalHarga;

            System.out.println("Jumlah tiket: " + jmlTiket);
            System.out.println("Diskon: " + (diskonTiket * 100) + "%");
            System.out.println("Total harga: Rp" + totalHarga);
            System.out.println();

        } while (true);

        System.out.println("Total tiket terjual selama satu hari: " + totalTiket);
        System.out.println("Total penjualan selama satu hari: Rp" + totalPenjualan);

        zahwa.close();
    }
}
