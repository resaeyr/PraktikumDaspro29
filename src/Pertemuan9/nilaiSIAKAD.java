// Jumlah mahasiswa (batas perulangan FOR) = 8 + (P mod 5) → gantikan angka 10 pada soal. 8 + (29 mod 5) = 8 + 4 = 12
// Batas kelulusan pada Pertanyaan no. 4 (modifikasi kode) = 55 + (P mod 11) → gantikan angka 60 pada soal Percobaan. 55 ( 29 mod 11 ) = 55 + 9 = 64  
// absen = 29

package Pertemuan9;

import java.util.Scanner;

public class nilaiSIAKAD {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        double nilai, total = 0, nilaiTinggi = 0, nilaiRendah = 100;

        for (int i = 1; i <= 12; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = scanner.nextDouble();
            total += nilai;
            if (nilai > nilaiTinggi) {
                nilaiTinggi = nilai;
            }
            if (nilai < nilaiRendah) {
                nilaiRendah = nilai;
            }
        }

        System.out.println("Nilai tertinggi: " + nilaiTinggi);
        System.out.println("Nilai terendah: " + nilaiRendah);
        scanner.close();
    }
}