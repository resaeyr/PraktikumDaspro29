package Coba;

public class kuadrat {
    public static void main(String[] args) {

        int i, j;
        int jumlahKuadrat;

        for (i = 1; i <= 5; i++) {
            jumlahKuadrat = 0;

            for (j = 1; j <= i; j++) {
                jumlahKuadrat = jumlahKuadrat + (j * j);
            }

            System.out.print("n = " + i);
            System.out.print(" -> jumlah kuadrat = ");

            for (j = 1; j <= i; j++) {
                System.out.print((j * j));

                if (j < i) {
                    System.out.print(" + ");
                }
            }

            System.out.print(" = " + jumlahKuadrat);
        }
    }
}
