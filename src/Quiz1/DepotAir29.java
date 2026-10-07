package Quiz1;

import java.util.Scanner;

public class DepotAir29 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int kapasitasGalon = 19, hargaGalon = 19500, jamDepot = 8, sisaAir, pendapatan, galonTerjual, lamaMengisi, hasilGalon;
        double rataRata;

        System.out.print("Jumlah Galon yang Terjual: ");
        galonTerjual = input.nextInt();
        System.out.print("Lama Mengisi Galon: ");
        lamaMengisi = input.nextInt();
        System.out.print("hasil lama mengisi: ");
        hasilGalon = input.nextInt();


        hasilGalon = hasilGalon*jamDepot;
        pendapatan = hargaGalon*galonTerjual;
        rataRata = lamaMengisi*hasilGalon;

        System.out.println("Jumlah Galon yang dihasilkan adalah: " +galonTerjual);
        System.out.println("Pendapatan: " +pendapatan);
        System.out.println("Rata rata per jam adalah: " +rataRata);



       

    }
    
}
// jmlGalon = 10
// pendaptan = 195000 
// rataRata = 80.0