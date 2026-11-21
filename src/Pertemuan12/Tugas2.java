package Pertemuan12;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);

        String[] menuUtama = {"Nasi Goreng", "Mie Goreng", "Roti Bakar","Kentang Goreng", "Teh Tarik", "Cappucino","Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 2000};

        boolean ditemukan = false;
        int jmlPesan, totalBiaya = 0;
        String key;

        // pencarian menu
        System.out.println("===== PENCARIAN MENU =====");
        System.out.print("Cari menu: ");
        key = zahwa.nextLine();

        for (int i = 0; i < menuUtama.length; i++) {
            if (key.equalsIgnoreCase(menuUtama[i])) {
                ditemukan = true;

                System.out.println();
                System.out.println("Menu ditemukan!");
                System.out.println("Menu: " + menuUtama[i]);
                System.out.println("Harga: Rp" + harga[i]);

                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Menu tersebut tidak tersedia.");
        }

        // pemesanan
        System.out.println();
        System.out.println("===== PEMESANAN MENU =====");

        System.out.print("Jumlah item yang ingin dipesan: ");
        jmlPesan = zahwa.nextInt();
        zahwa.nextLine();

        String[] pesanan = new String[jmlPesan];

        for (int j = 0; j < jmlPesan; j++) {
            ditemukan = false;

            System.out.println();
            System.out.print("Masukkan menu ke-" + (j + 1) + ": ");
            key = zahwa.nextLine();

            // pake linear search
            for (int i = 0; i < menuUtama.length; i++) {
                if (key.equalsIgnoreCase(menuUtama[i])) {
                    ditemukan = true;

                    // simpen ke array pemesanan
                    pesanan[j] = menuUtama[i];

                    totalBiaya += harga[i];

                    System.out.println("Harga: Rp" + harga[i]);

                    break;
                }
            }

            if (!ditemukan) {
                System.out.println("Menu tidak tersedia, silakan input ulang.");
                j--;
            }
        }

        System.out.println();
        System.out.println("===== DAFTAR PESANAN ANDA =====");

        for (int j = 0; j < pesanan.length; j++) {
            for (int i = 0; i < menuUtama.length; i++){
                if (pesanan[j].equalsIgnoreCase(menuUtama[i])) {
                    System.out.printf("%d. %-20s Rp%d%n", (j + 1), pesanan[j], harga[i]);
                }
            }
            
        }

        System.out.println("--------------------------------");
        System.out.println("Total Biaya: Rp" + totalBiaya);
        System.out.println("================================");

        zahwa.close();
    }
}

// input menu, program nyari nama dlm array menu 
// klo ditemukan, output harga. klo ga ditemukan output"menu tidak tersedia"
// input jumlah item
// simpan nama pesanan dlm array 1 dimensi terspisah dr array menu utama
// hitung dan output total biaya
// output daftar pesanan beserta total biaya.