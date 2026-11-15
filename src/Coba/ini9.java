package Coba;
import java.util.Scanner;
public class ini9 {

    public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);

        int stok;

        for (int i = 1; i <= 3; i++) {

            do {
                System.out.print("Masukkan stok barang ke-" + i + ": ");
                stok = zahwa.nextInt();
            } while (stok < 0);

            System.out.println("Stok diterima = " + stok);
        }
    }
}


