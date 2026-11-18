package Pertemuan12;

import java.util.Scanner;

public class ArrayNilai29 {
    public static void main(String[] args) {

        int[] nilaiAkhir =new int[10];
        Scanner input = new Scanner(System.in);

        int jumlahlulus = 0;
        int jumlahtdklulus = 0;

        for (int i = 0; i < nilaiAkhir.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = input.nextInt();
        }
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if(nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i + 1) + ": " +nilaiAkhir[i] + " (LULUS)");
                jumlahlulus++;
            } else {
                System.out.println("Mahasiswa ke-" + (i + 1) + ": " +nilaiAkhir[i] + " (TIDAK LULUS)");
                jumlahtdklulus++;
            }

        }
        System.out.println("Jumlah mahasiswa lulus: " + jumlahlulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + jumlahtdklulus);

    }
    
}
