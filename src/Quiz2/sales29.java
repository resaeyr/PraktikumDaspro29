package Quiz2;

import java.util.Scanner;

public class sales29 {
    public static void main(String[] args) {
         Scanner zahwa = new Scanner(System.in);

         int jmlUnit, jmlSeles, jmlTercapai, jmlTdktercapai, tertinggi, terendah, totalSeles = 0, totalUnit = 0;
         String namaSeles;

         for (int i = 1; i <=4; i++) {
            jmlSeles = 0;

            System.out.print("Nama seles: ");
            namaSeles = zahwa.nextLine();

            for (int j = 1; j <= 4; j++) {
                System.out.print("Penjualan minggu ke-" + j + ": ");
                jmlUnit = zahwa.nextInt();

                if (jmlUnit >= 20) {
                    System.out.print("Target tercapai");
                }
            
            totalUnit += jmlUnit;
            
            }
            System.out.print("tambah seles (y/t): ");
         }
    }
   
    
}
