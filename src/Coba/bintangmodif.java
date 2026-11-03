package Coba;

public class bintangmodif {
    public static void main(String[] args) {

        int i, j;
        for (i = 10; i > 0; i--) {
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
