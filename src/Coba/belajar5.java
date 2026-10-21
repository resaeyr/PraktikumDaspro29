
package Coba;

import java.util.Scanner;

public class belajar5 {
    public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);

        int kode, umur, jumlah;
        int harga = 0;
        int total;
        String wahana = "";
        double diskon = 0;

        System.out.print("Masukkan umur: ");
        umur = zahwa.nextInt();

        System.out.print("Pilih wahana (1/2/3): ");
        kode = zahwa.nextInt();

        System.out.print("Jumlah tiket: ");
        jumlah = zahwa.nextInt();

        switch (kode) {
            case 1:
                wahana = "Bianglala";
                harga = 20000;
                break;

            case 2:
                wahana = "Roller coaster";
                harga = 35000;
                break;

            case 3:
                wahana = "Rumah hantu";
                harga = 25000;
                break;

            default:
                System.out.println("Kode wahana tidak tersedia.");
                return;
        }

        if (kode == 2) {
            if (umur < 12) {
                System.out.println(
                    "Ditolak: umur belum memenuhi syarat."
                );
                return;
            }
        }

        if (kode != 2) {
            if (jumlah >= 4) {
                diskon = 0.10;
            }
        }

        total = (int) (harga * jumlah * (1 - diskon));

        System.out.println("Wahana: " + wahana);
        System.out.println("Total bayar: Rp " + total);

        zahwa.close();
    }
}
