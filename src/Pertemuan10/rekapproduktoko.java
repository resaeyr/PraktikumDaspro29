package Pertemuan10;

import java.util.Scanner;

public class rekapproduktoko {
    public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);

        int jmlTerjual, jmlProduk = 3;
        int jmlHari = 4;
        int totalPerProduk = 0;
        int totalPenjualan = 0;

        for (int i = 0; i < jmlProduk; i++) {

            for (int j = 0; j < jmlHari; j++) {
                System.out.print("Masukkan jumlah produk ke-" + (i + 1 ) + " yang terjual pada hari ke-" + (j + 1) + ": ");
                jmlTerjual = zahwa.nextInt();
                totalPerProduk = totalPerProduk + jmlTerjual;
            }

            System.out.println("Total penjualan produk ke-" + (i + 1) + ": " + totalPerProduk);
            totalPenjualan = totalPenjualan + totalPerProduk;
        }

        System.out.println("Total seluruh penjualan: " + totalPenjualan);
    }
}

