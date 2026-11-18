package Pertemuan12;

import java.util.Arrays;

public class ArrayBilangan29 {
    public static void main(String[] args) {
        int [] bil = new int[4];

        bil[0] = 29;
        bil[1] = 32;
        bil[2] = -2;
        bil[3] = 34;

        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i]);
        }

        for (int nilai : bil) {
            System.out.println(nilai);
        }

        System.out.println(Arrays.toString(bil));
    }
}
