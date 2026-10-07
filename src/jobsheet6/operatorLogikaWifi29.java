package jobsheet6;

import java.util.Scanner;

public class operatorLogikaWifi29 {
    public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);

        boolean mahasiswa;
        boolean dosen;
        boolean akunDiblokir;

        System.out.print("Apakah pengguna mahasiswa? (true/false): ");
        mahasiswa = zahwa.nextBoolean();
        System.out.print("Apakah pengguna dosen? (true/false): ");
        dosen = zahwa.nextBoolean();
        System.out.print("Apakah akun sedang diblokir? (true/false): ");
        akunDiblokir = zahwa.nextBoolean();

        if ((mahasiswa || dosen) && !akunDiblokir) {
            System.out.println("Akses WiFi diberikan");
        } else {
            System.out.println("Akses WiFi ditolak");
        }
    }

}
