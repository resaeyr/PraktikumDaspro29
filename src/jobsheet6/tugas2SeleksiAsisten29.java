package jobsheet6;

import java.util.Scanner;

public class tugas2SeleksiAsisten29 {
    public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);

        boolean statusAktif;
        boolean sanksiAkademik;
        int nilaiDasarPemrograman;
        boolean sertifikatKompetensi;
        int nilaiWawancara;

        System.out.print("Apakah mahasiswa berstatus aktif? (true/false): ");
        statusAktif = zahwa.nextBoolean();
        System.out.print("Apakah sedang mendapatkan sanksi akademik? (true/false): ");
        sanksiAkademik = zahwa.nextBoolean();

        if (statusAktif == true && sanksiAkademik == false) {

            System.out.println("Syarat 1: LULUS");
            System.out.println("Mahasiswa berstatus aktif dan tidak sedang mendapatkan sanksi.");

            System.out.print("Masukkan nilai Dasar Pemrograman: ");
            nilaiDasarPemrograman = zahwa.nextInt();

            System.out.print("Apakah memiliki sertifikat kompetensi pemrograman? (true/false): ");
            sertifikatKompetensi = zahwa.nextBoolean();

            if (nilaiDasarPemrograman >= 76 || sertifikatKompetensi == true) {

                System.out.println("Hasil: LULUS");
                System.out.println("Memenuhi syarat nilai Dasar Pemrograman atau memiliki sertifikat kompetensi.");

                System.out.print("Masukkan nilai wawancara: ");
                nilaiWawancara = zahwa.nextInt();

                if (nilaiWawancara >= 71) {

                    System.out.println("Hasil: LULUS");
                    System.out.println("Nilai wawancara memenuhi.");
                    System.out.println("SELAMAT, MAHASISWA DITERIMA SEBAGAI ASISTEN.");

                } else {

                    System.out.println("Hasil: GAGAL");
                    System.out.println("Nilai wawancara kurang dari 71.");
                    System.out.println("MAHASISWA TIDAK DITERIMA SEBAGAI ASISTEN.");
                }

            } else {

                System.out.println("Hasil: GAGAL");
                System.out.println("Nilai Dasar Pemrograman kurang dari 76 dan tidak memiliki sertifikat kompetensi.");
                System.out.println("MAHASISWA TIDAK DAPAT MENGIKUTI WAWANCARA.");
            }

        } else {

            System.out.println("Hasil: GAGAL");

            if (statusAktif == false) {
                System.out.println("Mahasiswa tidak berstatus aktif.");
            }

            if (sanksiAkademik == true) {
                System.out.println(" Mahasiswa sedang mendapatkan sanksi akademik.");
            }

            System.out.println("MAHASISWA TIDAK DAPAT MENGIKUTI SELEKSI.");
        }

    }
}