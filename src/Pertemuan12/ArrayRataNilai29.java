
package Pertemuan12;

import java.util.Scanner;

public class ArrayRataNilai29 {
    public static void main(String[] args) {

        Scanner zahwa = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        int total = 0;
        int jumlahLulus = 0;
        double rata2;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = zahwa.nextInt();
            total += nilaiMhs[i];

            if (nilaiMhs[i] > 70) {
                jumlahLulus++;
            }
        }

        rata2 = (double) total / nilaiMhs.length;

        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata: " + rata2);
        System.out.println("Jumlah mahasiswa lulus: " + jumlahLulus);
    }
}
