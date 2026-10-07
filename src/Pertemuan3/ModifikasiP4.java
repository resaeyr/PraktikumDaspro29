package Pertemuan3;

import java.util.Scanner;

public class ModifikasiP4 {
    public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);

        int gajiPokok, totGaji;
        double bonus;
        double tunjTransp = 600000;
        double tunjMkn = 400000;

        System.out.print("Masukkan gaji pokok: ");
        gajiPokok = zahwa.nextInt();
        bonus = 0.05 * gajiPokok;
        
        totGaji = (int) (gajiPokok + tunjTransp + tunjMkn + bonus - (0.1 * gajiPokok));
        
        System.out.println("Bonus Bulanan anda adalah Rp. " + bonus);
        System.out.println("Total gaji yang harus dibayarkan adalah Rp. " + totGaji);

    }
}

