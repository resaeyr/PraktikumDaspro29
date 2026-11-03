package Pertemuan10;

import java.util.Scanner;

public class Triangle29 {
    public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);
        System.out.print("Masukkan nilai n =  ");
        int n = zahwa.nextInt();

        int i = n;
        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
        zahwa.close();
    }
    
}
