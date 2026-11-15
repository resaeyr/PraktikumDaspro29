package Coba;


import java.util.Scanner;
public class ini3 {

    public static void main(String[] args) {
        Scanner zahwa = new Scanner(System.in);

        int jumlah;

        do {
            System.out.print("Masukkan jumlah barang: ");
            jumlah = zahwa.nextInt();
        } while (jumlah <= 0);

        System.out.println("Jumlah barang diterima: " + jumlah);
    }
}

    

