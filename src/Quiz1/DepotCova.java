package Quiz1;

import java.util.Scanner;

public class DepotCova {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int kapasitasGalon = 19;
        int hargaGalon = 19500;
        int jmlGalon, pendapatan, lamaMengisi, rataPerJam, hasilGalon, jmlAir, sisaAir;

        System.out.print("Jumlah Galon yang Terjual: ");
        jmlGalon = input.nextInt();
        System.out.print("Lama Mengisi Galon: ");
        lamaMengisi = input.nextInt();
        System.out.print("Hasil lama mengisi: ");
        hasilGalon = input.nextInt();
        System.out.print("Jumlah Air : ");
        jmlAir = input.nextInt();

        sisaAir = jmlAir - (jmlGalon * kapasitasGalon);
        pendapatan = jmlGalon * hargaGalon;
        rataPerJam = hasilGalon / lamaMengisi;

        System.out.println("Jumlah Galon yang dihasilkan adalah: " + jmlGalon);
        System.out.println("Pendapatan: " + pendapatan);
        System.out.println("Rata rata per jam adalah: " + rataPerJam);
        System.out.println("Sisa Air : " + sisaAir);
    }
}
