package Pertemuan5;

import java.util.Scanner;

public class TugasParkir29 {
    public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);

        int lamaParkir, tarif;

        System.out.print("Lama anda parkir: ");
        lamaParkir = zahwa.nextInt();

        tarif = 2000 + (lamaParkir - 2)*1000;

        if (lamaParkir <= 2){
            System.out.println("Tarif anda 2000");
        }
        else {
            System.out.println("Tarif anda " +tarif);
        }
    }
    
}
