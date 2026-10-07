package Pertemuan2;

public class StudiKasus2 {
    public static void main(String[] args) {

        int lebar_tanah = 30;
        int panjang_tanah = 100;
        int diameter_kolam = 5;
        int panjang_taman = 2;
        double luas_tanah, luas_kolam, luas_taman, sisa_tanah;

        luas_tanah = lebar_tanah * panjang_tanah;
        luas_kolam = Math.PI * diameter_kolam * diameter_kolam / 4.0;
        luas_taman = panjang_taman * panjang_taman;
        sisa_tanah = luas_tanah - luas_kolam - luas_taman;

        System.out.println("--- Hasil Perhitungan ---");
        System.out.println("Luas tanah: " + luas_tanah);
        System.out.println("Luas kolam: " + luas_kolam);
        System.out.println("Luas taman: " + luas_taman);
        System.out.println("Sisa tanah: " + sisa_tanah);
 
    }
    
}
