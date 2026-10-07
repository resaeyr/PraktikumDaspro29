package jobsheet6;

import java.util.Scanner;

public class nestedUjianSkripsi29 {
    public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);

        String pesan;

        System.out.print("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak): ");
        String bebasKompen = zahwa.nextLine().trim();
        System.out.print("Masukkan jumlah log bimbingan Pembingan 1: ");
        int bimbinganP1 = zahwa.nextInt();
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 2: ");
        int bimbinganP2 = zahwa.nextInt();

        if (bebasKompen.equalsIgnoreCase ("Ya")) {
            if (bimbinganP1 >= 10 && bimbinganP2 >= 5) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            } else if (bimbinganP1 < 10 && bimbinganP2 < 5) {
                pesan = "Gagal! Log bimbingan P1 kurang dari 10 kali dan P2 kurang dari 5 kali";
            } else if (bimbinganP1 < 10) {
                pesan = "Gagal! Log bimbingan P1 belum mencapai 10 kali";
            } else {
                pesan = "Gagal! Log bimbingan P2 belum mencapai 5 kali";
            } 
        } else {
            pesan = "Gagal! Mahasiswa emiliki tanggungan kompen";
        }
        System.out.println(pesan);
    } 

}