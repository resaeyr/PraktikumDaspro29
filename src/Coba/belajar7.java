package Coba;

import java.util.Scanner;

public class belajar7 {
    public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);

        String nama;
        boolean mahasiswaAktif;
        int nilaiTes;
        int nilaiWawancara;
        int matkulBelumLulus;

        System.out.print("Nama calon asisten: ");
        nama = zahwa.nextLine();

        System.out.print("Mahasiswa aktif? (true/false): ");
        mahasiswaAktif = zahwa.nextBoolean();

        System.out.print("Jumlah matkul belum lulus: ");
        matkulBelumLulus = zahwa.nextInt();

        System.out.print("Nilai tes pemrograman: ");
        nilaiTes = zahwa.nextInt();

        if (nilaiTes < 0 || nilaiTes > 100 ||
            matkulBelumLulus < 0) {

            System.out.println("Input tidak valid");

        } else if (!mahasiswaAktif || matkulBelumLulus > 0) {

            System.out.println("Pendaftaran ditolak");
            System.out.println("Syarat akademik tidak terpenuhi");

        } else if (nilaiTes >= 80) {

            System.out.print("Nilai wawancara: ");
            nilaiWawancara = zahwa.nextInt();

            if (nilaiWawancara < 0 || nilaiWawancara > 100) {
                System.out.println("Nilai wawancara tidak valid");
            } else if (nilaiWawancara >= 75) {
                System.out.println("Nama: " + nama);
                System.out.println("Diterima sebagai asisten");
            } else {
                System.out.println("Tidak diterima");
            }

        } else if (nilaiTes >= 65) {

            System.out.print("Nilai wawancara: ");
            nilaiWawancara = zahwa.nextInt();

            if (nilaiWawancara < 0 || nilaiWawancara > 100) {
                System.out.println("Nilai wawancara tidak valid");
            } else if (nilaiWawancara >= 85) {
                System.out.println("Nama: " + nama);
                System.out.println("Masuk daftar pertimbangan");
            } else {
                System.out.println("Tidak diterima");
            }

        } else {
            System.out.println("Tidak diterima");
            System.out.println("Nilai tes terlalu rendah");
        }

        zahwa.close();
    }
}

