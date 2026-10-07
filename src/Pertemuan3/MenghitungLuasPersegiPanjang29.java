package Pertemuan3;

import java.util.Scanner;

public class MenghitungLuasPersegiPanjang29 {
    public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);

        int panjang;
        int lebar;
        int luas;

        panjang = zahwa.nextInt();
        lebar = zahwa.nextInt();

        luas = panjang * lebar;
        System.out.println("Luas persegi panjang adalah " + luas);
    }
}
