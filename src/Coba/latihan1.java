package Coba;

import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int jmlBuku, jmlBulpoin, hargaSatuBuku = 25000, hargaSatuBulpoin = 5000;
        double totalHargaBuku, totalHargaBulpoin, totalHarga;

        System.out.print ("Masukkan jumlah buku: ");
        jmlBuku = input.nextInt();
        System.out.print ("Masukkan jumlah bulpoin: ");
        jmlBulpoin = input.nextInt();

        totalHargaBuku = jmlBuku * hargaSatuBuku;
        totalHargaBulpoin = jmlBulpoin * hargaSatuBulpoin;
        totalHarga = totalHargaBuku + totalHargaBulpoin;

        System.out.println ("Total yang harus anda bayar Rp. " + totalHarga);


    }

}
