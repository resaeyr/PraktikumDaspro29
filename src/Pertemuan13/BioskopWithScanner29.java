package Pertemuan13;

import java.util.Scanner;

public class BioskopWithScanner29 {
    public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);

        int baris, kolom, menu;
        String nama, pilihan;
        String[][] penonton = new String [4][2];

        while (true) {
            System.out.println();
            System.out.println("===== Menu =====");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = zahwa.nextInt();

            zahwa.nextLine();

            System.out.println();

            if (menu == 1) {
                System.out.println("===== Input Data =====");
                
                System.out.print("Masukkan nama: ");
                nama = zahwa.nextLine();

                System.out.print("Masukkan baris: ");
                baris = zahwa.nextInt();
                
                System.out.print("Masukkan kolom: ");
                kolom = zahwa.nextInt();
                
                zahwa.nextLine();

                if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                    penonton[baris - 1][kolom - 1] = nama;
                } else {
                    System.out.println("Nomor baris atau kolom tidak tersedia");
                }

                System.out.println();

            } else if (menu == 2) {

                System.out.println("===== Daftar Penonton =====");

                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print("[Kosong]\t");
                        } else {
                            System.out.print(penonton[i][j] + "\t");
                        }
                    }
                    System.out.println();
                }
            } else {
                break;
            }
        }
    }    
}