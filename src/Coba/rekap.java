package Coba;

import java.util.Scanner;

public class rekap {
    public static void main(String[] args) {

        Scanner zahwa = new Scanner(System.in);

        int jumlahProduk, jumlahHari;
        int i, j;
        int jumlahTerjual;
        int totalPerProduk = 0;
        int totalSeluruhProduk = 0;
        int rataRata;

        System.out.print("Masukkan jumlah produk: ");
        jumlahProduk = zahwa.nextInt();

        System.out.print("Masukkan jumlah hari: ");
        jumlahHari = zahwa.nextInt();

        while (jumlahProduk < 1 || jumlahHari < 1) {
            System.out.println("Jumlah produk dan hari minimal 1!");

            System.out.print("Masukkan jumlah produk: ");
            jumlahProduk = zahwa.nextInt();

            System.out.print("Masukkan jumlah hari: ");
            jumlahHari = zahwa.nextInt();
        }

        i = 1;

        // outer loop pake while
        while (i <= jumlahProduk) {

            totalPerProduk = 0;

            System.out.println("\nProduk ke-" + i);

            // inner loop pake for
            for (j = 1; j <= jumlahHari; j++) {

                do {
                    System.out.print("Jumlah terjual hari ke-" + j + ": ");
                    jumlahTerjual = zahwa.nextInt();

                    if (jumlahTerjual < 0) {
                        System.out.println("Input tidak boleh negatif!");
                    }

                } while (jumlahTerjual < 0);

                totalPerProduk = totalPerProduk + jumlahTerjual;
            }

            rataRata = totalPerProduk / jumlahHari;

            System.out.println("Total penjualan produk ke-" + i + " = " + totalPerProduk);
            System.out.println("Rata-rata harian = " + rataRata);

            totalSeluruhProduk = totalSeluruhProduk + totalPerProduk;

            i++;
        }

        System.out.println("\nTotal seluruh produk = " + totalSeluruhProduk);

        zahwa.close();
    }
}


