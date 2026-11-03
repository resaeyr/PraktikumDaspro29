package Pertemuan10;

import java.util.Scanner;

public class Tugas229 {
    public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);

        int n;
        int jumlah = 0;

        System.out.print("Masukkan nilai n = ");
        n = zahwa.nextInt();

        while (n < 3) {
            System.out.println("Nilai n minimal 3!");
            System.out.print("Masukkan nilai n = ");
            n = zahwa.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int hasil = i * j;

                System.out.printf("%4d", hasil);
                jumlah += hasil;
            }
            System.out.println();
        }

        System.out.println("Jumlah seluruh angka: " + jumlah);

        zahwa.close();
    }
}
