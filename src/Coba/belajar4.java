
package Coba;

import java.util.Scanner;

public class belajar4 {
    public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);

        boolean anggota;
        int kode, jumlah, harga = 0, total;
        String makanan = "";
        double diskon = 0;

        System.out.print("Punya kartu anggota? (true/false): ");
        anggota = zahwa.nextBoolean();

        System.out.print("Pilih makanan (1/2/3): ");
        kode = zahwa.nextInt();

        System.out.print("Jumlah porsi: ");
        jumlah = zahwa.nextInt();

        if (anggota == true) {
            if (jumlah >= 3) {
                diskon = 0.10;
            }
        }

        switch (kode) {
            case 1:
                makanan = "Nasi goreng";
                harga = 15000;
                break;

            case 2:
                makanan = "Ayam geprek";
                harga = 18000;
                break;

            case 3:
                makanan = "Mie ayam";
                harga = 12000;
                break;

            default:
                System.out.println("Kode makanan tidak valid.");
                return;
        }

        total = (int) (harga * jumlah * (1 - diskon));

        System.out.println("Makanan: " + makanan);
        System.out.println("Diskon: " + (diskon * 100) + "%");
        System.out.println("Total bayar: Rp " + total);

        zahwa.close();
    }
}
