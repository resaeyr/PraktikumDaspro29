// Kategori nilai huruf (A/B+/B/C+/C/D/E) mengikuti skala penilaian resmi kampus sehingga TIDAK diubah. 
// Pada Pertanyaan no. 3, ganti angka "19" pada soal dengan 15 + (P mod 10) → lalu jawab ulang pertanyaannya memakai angka Anda sendiri 
// = 15 + ( 29 mod 10 ) = 15 + 9 = 24
// Absen = 29

package Pertemuan9;

import java.util.Scanner;

public class SiakadWhile29 {
    public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);
        int jml, i = 0;
        double nilai;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jml = zahwa.nextInt();

        while (i < jml) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai = zahwa.nextDouble();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
                continue;
            }
            if (nilai > 80 && nilai <= 100) {
                System.out.println("Nilai mahasiswa ke- " + (i + 1) + " adalah A");
                System.out.println("Bagus, pertahankan nilainya");
            } else if (nilai > 73 && nilai <= 80) {
                System.out.println("Nilai mahasiswa ke- " + (i + 1) + " adalah B+");
            } else if (nilai > 65 && nilai <= 73) {
                System.out.println("Nilai mahasiswa ke- " + (i + 1) + " adalah B");
            } else if (nilai > 60 && nilai <= 65) {
                System.out.println("Nilai mahasiswa ke- " + (i + 1) + " adalah C+");
            } else if (nilai > 50 && nilai <= 60) {
                System.out.println("Nilai mahasiswa ke- " + (i + 1) + " adalah C");
            } else if (nilai > 39 && nilai <= 50) {
                System.out.println("Nilai mahasiswa ke- " + (i + 1) + " adalah D");
            } else {
                System.out.println("Nilai mahasiswa ke- " + (i + 1) + " adalah E");
            }

            i++;
            
        }

    }
}
