package Pertemuan10;

import java.util.Scanner;

public class Star29 {
        public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = zahwa.nextInt();

        for (int i = 1; i<= n; i++) {
            System.out.print("*");
        }
        System.out.println();
        zahwa.close();
        }
}
