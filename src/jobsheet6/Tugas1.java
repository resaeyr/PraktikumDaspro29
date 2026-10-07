package jobsheet6;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);

        String jenisBuku;
        int jumlahBuku;
        double diskon;

        System.out.print("Jenis buku: ");
        jenisBuku = zahwa.nextLine();

        System.out.print("Jumlah buku yang dibeli: ");
        jumlahBuku = zahwa.nextInt();

        if (jenisBuku.equalsIgnoreCase("Kamus")) {
            if (jumlahBuku > 3) {
                diskon = 14;
            } else {
                diskon = 12;
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            if (jumlahBuku > 4) {
                diskon = 8;
            } else {
                diskon = 7;
            }
        } else {
            if (jumlahBuku > 4) {
                diskon = 4;
            } else {
                diskon = 0;
            }
        }

        System.out.println("Diskon : " +diskon +"%");

    }
}
