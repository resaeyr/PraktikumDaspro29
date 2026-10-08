package Pertemuan7;

import java.util.Scanner;

public class StudiKasus2_29 {
    public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);

        String nama;
        String jenisKegiatan;
        int jmlDokumen;
        int peringkat;
        int statusPkm;

        System.out.print("Nama mahasiswa: ");
        nama = zahwa.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        jenisKegiatan = zahwa.nextLine();

        // jenis kegiatan BELMAWA, BAKORMA, MANDIRI
        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") ||
            jenisKegiatan.equalsIgnoreCase("BAKORMA") ||
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {

            System.out.print("Jumlah dokumen yang dikumpulkan: ");
            jmlDokumen = zahwa.nextInt();

            if (jmlDokumen < 4) {
                System.out.println("Status : Dokumen tidak lengkap (kurang "
                        + (4 - jmlDokumen) + " dokumen).");
                System.out.println("Dana penghargaan tidak diberikan.");
            } else {

                System.out.print("Peringkat: ");
                peringkat = zahwa.nextInt();

                if (peringkat >= 1 && peringkat <= 3) {
                    System.out.println("Status : Dokumen lengkap.");
                    System.out.println("Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Dokumen lengkap, tetapi bukan Juara 1, 2, atau 3.");
                    System.out.println("Dana penghargaan tidak diberikan.");
                }
            }

        // buat PKM
        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {

            System.out.print("Jumlah dokumen yang dikumpulkan: ");
            jmlDokumen = zahwa.nextInt();

            if (jmlDokumen < 4) {
                System.out.println("Status : Dokumen tidak lengkap (kurang "
                        + (4 - jmlDokumen) + " dokumen).");
                System.out.println("Dana penghargaan tidak diberikan.");
            } else {

                System.out.print("Status PKM (1 untuk lolos, 0 untuk tidak lolos): ");
                statusPkm = zahwa.nextInt();

                if (statusPkm == 1) {
                    System.out.println("Status : Dokumen lengkap dan lolos PKM.");
                    System.out.println("Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Dokumen lengkap, tetapi tidak lolos PKM.");
                    System.out.println("Dana penghargaan tidak diberikan.");
                }
            }

        // LAINNYA
        } else if (jenisKegiatan.equalsIgnoreCase("LAINNYA")) {

            System.out.println("Jenis kegiatan tidak termasuk kriteria.");
            System.out.println("Dana penghargaan tidak diberikan.");

        } else {

            System.out.println("Jenis kegiatan tidak valid.");
            System.out.println("Dana penghargaan tidak diberikan.");
        }
    }
}