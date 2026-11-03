package Coba;

public class alphabetsamakaki {
    public static void main(String[] args) {
        int tinggi = 5;
        char huruf = 'a';

        for (int i = 1; i <= tinggi; i++) {
            // Spasi
            for (int j = 1; j <= tinggi - i; j++) {
                System.out.print(" ");
            }
            // Alfabet berurutan
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print(huruf);
                huruf++;
            }

            System.out.println();
        
        }
    }
}