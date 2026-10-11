package Coba;

import java.util.Scanner;

public class belajar1 {
    public static void main (String[] args) {
        Scanner zahwa = new Scanner(System.in);

        int jmlTunggakan, jmlPinjam;
        boolean status;
        boolean izinLab;

 
    System.out.print("Mahasiswa aktif? (true/false): ");
    status = zahwa.nextBoolean();

    System.out.print("Jumlah tunggakan: ");
    jmlTunggakan = zahwa.nextInt();

    System.out.print("Jumlah peralatan yang ingin dipinjam: ");
    jmlPinjam = zahwa.nextInt();

    // cek syarat peminjaman
    if (status == true && jmlTunggakan == 0) { 
        if (jmlPinjam <= 3) {
        System.out.println("Peminjaman disetujui.");

        // lebih dari 3. perlu izin laboran
        } else {
            System.out.print("Mendapat izin laboran? (true/false): ");
            izinLab = zahwa.nextBoolean();

            if (izinLab == true) {
                System.out.println("Peminjaman disetujui.");
            } else {
                System.out.println("Peminjaman ditolak: perlu izin laboran.");
            }
        }
    } else {
        System.out.println("Peminjaman ditolak: syarat dasar tidak terpenuhi.");
    }

    }
}
