package Coba;

import java.util.Scanner;

public class jambelajarfor {
    public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);

        int jam, totalMinggu;
        int totalSemua = 0;

        for (int i = 1; i <= 3; i++) {
            totalMinggu = 0;

            System.out.println("\nMinggu ke-" + i);

            for (int j = 1; j <= 7; j++) {
                System.out.print("Jam belajar hari ke-" + j + ": ");
                jam = zahwa.nextInt();

                totalMinggu += jam;
            }

            System.out.println("Total belajar minggu ke-" + i + " = " + totalMinggu);

            totalSemua += totalMinggu;
        }

        System.out.println("\nTotal jam belajar = " + totalSemua);
    }
}

    
// output jam belajar hari ke-1 sampai ke-7
// total belajar per minggu
// total jam belajar selama 3 minggu
