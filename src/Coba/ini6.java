package Coba;

import java.util.Scanner;

public class ini6 {
    public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);

        int nilai;
        int lulus = 0;
        int tidakLulus = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = zahwa.nextInt();

            if (nilai >= 65) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }

        System.out.println("Jumlah lulus = " + lulus);
        System.out.println("Jumlah tidak lulus = " + tidakLulus);
    }
}


// jumlah lulus dan tidak lulus dari 10 mahasiswa