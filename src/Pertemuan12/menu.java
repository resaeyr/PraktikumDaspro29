package Pertemuan12;

import java.util.Scanner;

import Quiz2.sales29;

public class menu {
    public static void main(String[] args) {
        Scanner zahwa = new Scanner (System.in);

        String [] menuUtama = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int [] harga = {15000, 13000, 10000, 12000, 8000, 18000, 2000};

        boolean ditemukan = false;
        int jmlPesan, totalBiaya;
        String key;

        // cari menu
        System.out.println();
        System.out.print("Cari menu: ");
        key = zahwa.nextLine();

        for (int i = 0; i < menuUtama.length; i++) {
            if (key.equalsIgnoreCase(menuUtama [i])) {
                ditemukan = true;
                
                System.out.println();
                System.out.println("Menu yang dipilih: " + menuUtama[i]);
                System.out.println("Harga: " + harga[i]);
            
                System.out.println();
                System.out.print("Jumlah pesanan: ");
                jmlPesan = zahwa.nextInt();
            
                totalBiaya = jmlPesan * harga[i];

                System.out.println();
                System.out.println("----- Daftar Pesanan Anda -----");
                System.out.println("Menu: " + key);
                System.out.println("Harga: " + harga[i]);
                System.out.println("Jumlah Item: " + jmlPesan);
                System.out.println("Total Biaya: " + totalBiaya);

            } 
                   
        }
        if (!ditemukan) {
                System.out.println("Menu tersebut tidak tersedia.");
            }


    }
}


// input menu, program nyari nama dlm array menu (pake linear search)
// klo ditemukan, output harga. klo ga ditemukan output"menu tidak tersedia"
// input jumlah item
// simpan nama pesanan dlm array 1 dimensi terspisah dr array menu utama
// hitung dan output total biaya
// output daftar pesanan beserta total biaya.