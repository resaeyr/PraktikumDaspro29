package Pertemuan10;

import java.util.Scanner;

public class Tugas129 {
    public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);

        int n;
        int totalAngka = 0;

        System.out.print("Masukkan nilai n = ");
        n = zahwa.nextInt();

        while (n < 1) {
            System.out.println("Nilai n minimal 1!");
            System.out.print("Masukkan nilai n = ");
            n = zahwa.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                totalAngka++;
            }
            System.out.println();
        }

        System.out.println("Total angka tercetak: " + totalAngka);

        zahwa.close();
    }
}
