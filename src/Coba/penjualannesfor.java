package Coba;

import java.util.Scanner;

public class penjualannesfor {
public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);

        int jual, totalProduk;
        int totalSemua = 0;

        for (int i = 1; i <= 3; i++) {
            totalProduk = 0;

            System.out.println("\nProduk ke-" + i);

            for (int j = 1; j <= 4; j++) {
                System.out.print("Penjualan hari ke-" + j + ": ");
                jual = zahwa.nextInt();

                totalProduk += jual;
            }

            System.out.println("Total produk = " + totalProduk);

            totalSemua += totalProduk;
        }

        System.out.println("\nTotal seluruh penjualan = " + totalSemua);
    }
}

