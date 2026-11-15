package Coba;

import java.util.Scanner;

public class ini8 {

    public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);

        int hari = 1;
        int jumlahHari, jual, total;

        System.out.print("Masukkan jumlah hari: ");
        jumlahHari = zahwa.nextInt();

        while (hari <= jumlahHari) {
            total = 0;

            System.out.println("\nHari ke-" + hari);

            for (int i = 1; i <= 3; i++) {
                System.out.print("Penjualan produk ke-" + i + ": ");
                jual = zahwa.nextInt();

                total += jual;
            }

            System.out.println("Total penjualan hari ini = " + total);

            hari++;
        }
    }
}

// output penjualan produk ke-1 sampai ke-3
// total penjualan per hari

