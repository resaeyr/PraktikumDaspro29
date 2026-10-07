package Pertemuan3;

import java.util.Scanner;

public class GajiKaryawan29 {
    public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);

        int gajiPokok;
        double bonus, totGaji;
        double tunjTransp=600000;
        double tunjMkn=400000;

        System.out.print("Masukkan gaji pokok: ");
        gajiPokok=zahwa.nextInt();
        bonus= 0.05*gajiPokok;

        totGaji=gajiPokok+tunjTransp+tunjMkn+bonus - (0.1*gajiPokok);
        
        System.out.println("Bonus Bulanan anda adalah Rp. "+bonus);
        System.out.println("Total gaji yang harus dibayarkan adalah Rp. " +totGaji);

    }
    
}

