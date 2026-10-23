// Tarif parkir mobil = 2500 + (P mod 6) × 250 per jam → gantikan Rp3.000 pada soal
// = 2500 + 5 x 250  = 3750
// Tarif parkir motor = 1500 + (P mod 6) × 250 per jam (gunakan nilai (P mod 6) yang SAMA dengan tarif mobil) → gantikan Rp2.000 pada soal 
// =1500 + 5 x 250 = 2750
// Absen 29

package Pertemuan9;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);

        int jenis, durasi, total = 0;

        do {
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.println("0. Untuk keluar");
            System.out.print("Masukkan jenis kendaraan: ");
            jenis = zahwa.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = zahwa.nextInt();

                if (jenis == 1) {
                    total = total + durasi * 3570;
                } else {
                    total = total + durasi * 2750;
                } 
            } else if (jenis != 0) {
                System.out.print("Jenis kendaraan tidak valid");
            }
        } while (jenis != 0 );

        System.out.println("Total bayar: Rp. " +total);
    }
}
