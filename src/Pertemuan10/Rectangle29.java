package Pertemuan10;

import java.util.Scanner;

public class Rectangle29 {
    public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        int baris = zahwa.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = zahwa.nextInt();

        for (int i = 1; i <= baris; i++) {          // outer loop: baris
           for (int j = 1; j <= kolom; j++) {       // inner loop: baris
                System.out.print("*");
           }
           System.out.println();                    // pindah baris
        }
        zahwa.close();
    }
}
