package Coba;

import java.util.Scanner;

public class ini1 {
    public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);

        double nilai, total = 0, rataRata;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = zahwa.nextDouble();

            total += nilai;
        }

        rataRata = total / 5;

        System.out.println("Total nilai = " + total);
        System.out.println("Rata-rata = " + rataRata);
    }
}

    
