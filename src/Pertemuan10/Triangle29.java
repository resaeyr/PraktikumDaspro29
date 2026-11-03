package Pertemuan10;

import java.util.Scanner;

public class Triangle29 {
    public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);
        System.out.print("Masukkan nilai n =  ");
        int n = zahwa.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 0;
            while ( j < 1 ) {
                System.out.println("*");
                j++;
            }
            System.out.println();
            i++;
        }
        zahwa.close();
    }
    
}
