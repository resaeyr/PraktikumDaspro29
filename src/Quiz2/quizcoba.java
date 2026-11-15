package Quiz2;

import java.util.Scanner;

public class quizcoba {
public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);

        int jmlUnit, jmlSeles;
        int totalUnit, totalSeles, jmlTercapai, jmlTdktercapai, tertinggi, terendah;
        String namaSeles;
        boolean tambahSeles = true;
        int totalSemua = 0;
        
        System.out.print("Nama seles: ");
        namaSeles = zahwa.nextLine();

        for (int i = 1; i <= 4; i++) {
            totalUnit = 0;

            System.out.println("\nProduk ke-" + i);

            for (int j = 1; j <= 7; j++) {

                System.out.print("Penjualan hari ke-" + j + ": ");
                jmlUnit = zahwa.nextInt();

                totalUnit += jmlUnit;
            }

            System.out.println("Total unit = " + totalUnit);

            totalSemua += totalUnit;
        }

        System.out.println("\nTotal seluruh penjualan = " + totalSemua);
        System.out.print("tambah seles (y/t): ");
        tambahSeles = zahwa.next().equalsIgnoreCase("y");

        if (tambahSeles) {
            System.out.print("Nama seles: ");
            namaSeles = zahwa.nextLine();
        } 
    }
}

//input nama seles
//input penjualan minggu ke-1
//input penjualan minggu ke-2
//input penjualan minggu ke-3
//input penjualan minggu ke-4
//jika penjualan >= 20, tampilkan "Target tercapai"
//tambah seles (y/t): y
//output jumlah seles, jumlah penjualan, jumlah target tercapai, jumlah target tidak tercapai, total penjualan
