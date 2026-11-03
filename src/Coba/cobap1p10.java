package Coba;

import java.util.Scanner;

public class cobap1p10 {
    public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = zahwa.nextInt();

        for (int i = 1; i <= n; i += 2) {
            System.out.print(i +" ");
        }
        System.out.println();
        zahwa.close();
    }
}
