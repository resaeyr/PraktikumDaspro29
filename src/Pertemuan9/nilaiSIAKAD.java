package Pertemuan9;

import java.util.Scanner;

public class nilaiSIAKAD {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        double nilai, total = 0, nilaiTinggi = 0, nilaiRendah = 100;

        for (int i = 1; i <= 12; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = scanner.nextDouble();
            total += nilai;
            if (nilai > nilaiTinggi) {
                nilaiTinggi = nilai;
            }
            if (nilai < nilaiRendah) {
                nilaiRendah = nilai;
            }
        }

        System.out.println("Nilai tertinggi: " + nilaiTinggi);
        System.out.println("Nilai terendah: " + nilaiRendah);
        scanner.close();
    }
}