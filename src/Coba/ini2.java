package Coba;

import java.util.Scanner;

public class ini2 {

    public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);

        int harga, total = 0;

        System.out.print("Masukkan harga barang (0 untuk selesai): ");
        harga = zahwa.nextInt();

        while (harga != 0) {
            total += harga;

            System.out.print("Masukkan harga barang (0 untuk selesai): ");
            harga = zahwa.nextInt();
        }

        System.out.println("Total belanja = " + total);
    }
}


