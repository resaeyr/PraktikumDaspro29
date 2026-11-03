package Pertemuan10;

import java.util.Scanner;

public class Tugas329 {
    public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);

        int jumlahToko;
        int totalSeluruhToko = 0;
        int tokoTerbanyak = 1;
        int barangTerbanyak = -1;

        String rekapToko = "";

        System.out.print("Masukkan jumlah toko: ");
        jumlahToko = zahwa.nextInt();

        while (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal 1!");
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = zahwa.nextInt();
        }

        for (int i = 1; i <= jumlahToko; i++) {

            int jumlahPelanggan;
            int totalBarangToko = 0;

            System.out.print("Masukkan jumlah pelanggan toko " + i + ": ");
            jumlahPelanggan = zahwa.nextInt();

            while (jumlahPelanggan < 0) {
                System.out.println("Jumlah pelanggan tidak boleh negatif!");
                System.out.print("Masukkan jumlah pelanggan toko " + i + ": ");
                jumlahPelanggan = zahwa.nextInt();
            }

            for (int j = 1; j <= jumlahPelanggan; j++) {

                int jumlahBarang;

                System.out.print("Jumlah barang pelanggan " + j + ": ");
                jumlahBarang = zahwa.nextInt();

                while (jumlahBarang < 0) {
                    System.out.println("Jumlah barang tidak boleh negatif!");
                    System.out.print("Jumlah barang pelanggan " + j + ": ");
                    jumlahBarang = zahwa.nextInt();
                }

                totalBarangToko += jumlahBarang;
            }

            rekapToko += "Toko " + i + " - pelanggan: "
                    + jumlahPelanggan + ", total barang: "
                    + totalBarangToko + "\n";

            totalSeluruhToko += totalBarangToko;

            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = i;
            }
        }

        System.out.println();
        System.out.print(rekapToko);
        System.out.println("Total barang seluruh toko: " + totalSeluruhToko);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);

        zahwa.close();
    }
}
