package Coba;

import java.util.Scanner;

public class belajar3 {
    public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);

        boolean aktif, izinLab;
        int tunggakan, jumlah;

        System.out.print("Mahasiswa aktif? (true/false): ");
        aktif = zahwa.nextBoolean();

        System.out.print("Jumlah tunggakan: ");
        tunggakan = zahwa.nextInt();

        System.out.print("Jumlah kamera: ");
        jumlah = zahwa.nextInt();

        if (aktif && tunggakan == 0) {
            if (jumlah <= 2) {
                System.out.println("Peminjaman disetujui.");
            } else {
                System.out.print(
                    "Punya izin laboran? (true/false): "
                );
                izinLab = zahwa.nextBoolean();

                if (izinLab) {
                    System.out.println(
                        "Peminjaman disetujui."
                    );
                } else {
                    System.out.println(
                        "Ditolak: perlu izin laboran."
                    );
                }
            }
        } else {
            System.out.println(
                "Ditolak: syarat dasar tidak terpenuhi."
            );
        }

        zahwa.close();
    }
}


