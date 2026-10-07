package Pertemuan7;

import java.util.Scanner;

public class StudiKasus1_29 {
    public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup,uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.print("Masukkan jumlah cup yang dibeli: ");
        jumlahCup = zahwa.nextInt();
        System.out.print("Masukkan uang yang dibayarkan: ");
        uangBayar = zahwa.nextInt();

        totalHarga = hargaPerCup * jumlahCup;
        diskon = 0;

        if (totalHarga >= 100000) {
            diskon = (int) (totalHarga * 10 / 100);
            totalBayar = totalHarga - diskon;
        } else {
            totalBayar = totalHarga - diskon;
        }

        System.out.println("Total harga: Rp " + totalHarga);
        System.out.println("Diskon: Rp " + diskon);
        System.out.println("Total bayar: Rp " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian: " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp" + kurang);
        }
    }
    
}