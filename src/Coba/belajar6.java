package Coba;

import java.util.Scanner;

public class belajar6 {
    public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);

        String nama;
        boolean bergaransi;
        int jenisKerusakan;
        int jenisServis;
        int biayaPemeriksaan = 0;
        int biayaEkspres = 0;
        int diskon = 0;
        int total;

        System.out.print("Nama pelanggan: ");
        nama = zahwa.nextLine();

        System.out.println("=== JENIS KERUSAKAN ===");
        System.out.println("1. Perangkat lunak");
        System.out.println("2. Perangkat keras");
        System.out.println("3. Baterai");

        System.out.print("Pilih jenis kerusakan: ");
        jenisKerusakan = zahwa.nextInt();

        System.out.print("Laptop masih bergaransi? (true/false): ");
        bergaransi = zahwa.nextBoolean();

        System.out.println("=== JENIS SERVIS ===");
        System.out.println("1. Reguler");
        System.out.println("2. Ekspres");

        System.out.print("Pilih servis: ");
        jenisServis = zahwa.nextInt();

        switch (jenisKerusakan) {
            case 1:
                biayaPemeriksaan = 100000;
                break;
            case 2:
                biayaPemeriksaan = 200000;
                break;
            case 3:
                biayaPemeriksaan = 150000;
                break;
            default:
                System.out.println("Jenis kerusakan tidak valid");
                zahwa.close();
                return;
        }

        if (jenisServis != 1 && jenisServis != 2) {
            System.out.println("Pilihan servis tidak valid");
            zahwa.close();
            return;
        }

        if (bergaransi) {
            biayaPemeriksaan = 0;
        } else {
            if (jenisServis == 2) {
                biayaEkspres = 75000;
            }

            if (biayaPemeriksaan >= 200000 &&
                jenisServis == 1) {
                diskon = 25000;
            }
        }

        total = biayaPemeriksaan + biayaEkspres - diskon;

        System.out.println("\n=== RINCIAN SERVIS ===");
        System.out.println("Nama: " + nama);
        System.out.println("Biaya pemeriksaan: Rp" + biayaPemeriksaan);
        System.out.println("Biaya ekspres: Rp" + biayaEkspres);
        System.out.println("Diskon: Rp" + diskon);
        System.out.println("Total biaya: Rp" + total);

        zahwa.close();
    }
}
