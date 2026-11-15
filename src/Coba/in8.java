package Coba;

import java.util.Scanner;
public class in8 {


    public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);

        int jumlah, totalMakanan;
        int totalSemua = 0;

        for (int i = 1; i <= 3; i++) {
            totalMakanan = 0;

            System.out.println("\nMakanan ke-" + i);

            for (int j = 1; j <= 5; j++) {
                System.out.print("Penjualan hari ke-" + j + ": ");
                jumlah = zahwa.nextInt();

                totalMakanan += jumlah;
            }

            System.out.println("Total penjualan makanan = " + totalMakanan);

            totalSemua += totalMakanan;
        }

        System.out.println("Total seluruh penjualan = " + totalSemua);
    }
}

    

