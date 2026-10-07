package Coba;

import java.util.Scanner;

public class Tugas1P2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int gaji_pokok, tunjangan, jumlah_anak;
        double prosentase_dana = 0.1, dana_pensiun, gaji_bersih;

        System.out.print("Masukkan gaji pokok: ");
        gaji_pokok = input.nextInt();
        System.out.print("Masukkan jumlah anak: ");
        jumlah_anak = input.nextInt();

        dana_pensiun = gaji_pokok * prosentase_dana;
        tunjangan = jumlah_anak * 100000; 
        gaji_bersih = gaji_pokok + tunjangan - dana_pensiun;

        System.out.println("Gaji Bersih: " + gaji_bersih);
    }
}