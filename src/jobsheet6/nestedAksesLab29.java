package jobsheet6;

import java.util.Scanner;

public class nestedAksesLab29 {
    public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);

        boolean mahasiswaAktif;
        boolean sedangDisanksi;
        boolean punyaIzinDosen;
        boolean asistenLab;

        System.out.print("Apakah anda mahasiswa aktif? (true/false): ");
        mahasiswaAktif = zahwa.nextBoolean();
        System.out.print("Apakah anda sedang terkan sanksi? (true/false): ");
        sedangDisanksi = zahwa.nextBoolean();
        System.out.print("Memiliki izin dosen? (true/false): ");
        punyaIzinDosen = zahwa.nextBoolean();
        System.out.print("Apakah anda asisten lab? (true/false): ");
        asistenLab = zahwa.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses laboratorium diberikan");
            } else {
                System.out.println("Akses ditolak: membutuhkan izin dosen atau status asisten lab");
            }
        } else {
            System.out.println("Akses ditolak: status mahasiswa tidak memenuhi syarat");
        }
    }
}
