package Coba;

import java.util.Scanner;

public class belajar2 {
    public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);

        double berat;
        String layanan;
        int biayaDasar = 0;
        int biayaTambahan = 0;
        int biayaTotal;

        System.out.print("Masukkan berat paket (kg): ");
        berat = zahwa.nextDouble();
        zahwa.nextLine();

        if (berat <= 2) {
            biayaDasar = 10000;
        } else if (berat <= 5) {
            biayaDasar = 20000;
        } else if (berat <= 10) {
            biayaDasar = 35000;
        } else {
            System.out.println("Paket ditolak, terlalu berat.");
        }

        if (berat <= 10) {
            System.out.print("Pilih layanan (Eks/Reg): ");
            layanan = zahwa.nextLine();

            if (layanan.equalsIgnoreCase("Eks")) {
                biayaTambahan = 15000;
            } else {
                biayaTambahan = 0;
            }

            biayaTotal = biayaDasar + biayaTambahan;

            System.out.println("Biaya total: Rp " + biayaTotal);
        }
    }
}
