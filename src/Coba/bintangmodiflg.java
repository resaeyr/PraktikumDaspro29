package Coba;

public class bintangmodiflg {
    public static void main(String[] args) {

        int i, j;
        for (i = 1; i <= 10; i++) {
            for (j = 0; j < (10 - i); j++) {
                System.out.print(" ");
            }
            for (j = 0; j < i; j++) {
                System.out.print("*");
        }
        System.out.println();
    }
}
}

