package Pertemuan10;

import java.util.Scanner;

public class NilaiKelompok29 {
    public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);
        System.out.print("Masukkan jumlah kelompok : ");
        int jumlahKelompok = zahwa.nextInt();
        System.out.print("Masukkan jumlah penilai : ");
        int jumlahPenilai = zahwa.nextInt();
      
        if (jumlahKelompok <= 0 || jumlahPenilai <= 0) {
            System.out.println("Jumlah kelompok dan penilai harus > 0.");
        } else {
            int nomorKelompok = 1;      //penghitung outer loop
            double rataTertinggi = -1;  // -1 agar kelompok pertama pasti tercatat
            int kelompokTerbaik = 0;

            while (nomorKelompok <= jumlahKelompok) {
                System.out.println("Kelompok " + nomorKelompok);
                double totalNilai = 0;

                for (int j = 1; j <= jumlahPenilai; j++) {
                    int nilai;
                    do {
                        System.out.print("Masukkan nilai penilai " + j + " : ");
                        nilai = zahwa.nextInt();
                        if (nilai < 0 || nilai > 100) {
                            System.out.println("Nilai harus 0-100. Ulangi input.");
                        }
                    } while (nilai < 0 || nilai > 100); {
                    totalNilai += nilai;
                    }

                    }
                    double rataRata = totalNilai / jumlahPenilai;
                    System.out.println("Kelompok " + nomorKelompok + ": nilai rata-rata = " + rataRata);
                    if (rataRata > rataTertinggi) {
                        rataTertinggi += rataRata;
                        kelompokTerbaik += nomorKelompok;
                }
                    nomorKelompok++;
            }

            System.out.println("================================");
            System.out.println("Kelompok terbaik       : " + kelompokTerbaik);
            System.out.println("Rata-rata tertinggi   : " + rataTertinggi);
        }
        zahwa.close();
    }
}
