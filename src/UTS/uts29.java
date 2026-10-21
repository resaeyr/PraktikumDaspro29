// tiket kode 1 : 40.000, tiket kode 2 : 75.000, tiket kode 3 : 30.000, T1 : 12, T2 : 24

package UTS;

import java.util.Scanner;

public class uts29 {
    public static void main (String[] args) {
        Scanner zahwa = new Scanner (System.in);

        int kode, hargaTiket, biayaDasar, layanan, jmlTiket;
        boolean statusKartu;
        double diskon, totalBayar, jmldiskon;

        System.out.print("Layanan: ");
        layanan = zahwa.nextInt();
        System.out.print("Jumlah tiket: ");
        jmlTiket = zahwa.nextInt();


        if (jmlTiket >1 && jmlTiket <= 40){
            if (jmlTiket <= 12) {
            } else if (jmlTiket >12 && jmlTiket <=24) {
                jmldiskon = 0.1;
                } else if (jmlTiket >24) {
                jmldiskon = 0.2;
            }
        } else
            System.out.print("Input tidak valid");
            
        
        switch (layanan) {
            case 1:
                biayaDasar = 40000;
                break;
            case 2: 
                biayaDasar = 75000;
                break;
            case 3:
                biayaDasar = 30000;
                break;
            default:
                break;
        }




    }

}
