package Pertemuan2;

public class StudiKasus1 {
    public static void main(String[] args) {

        int gaji_pokok = 5000000;
        int jumlah_anak = 4;
        int tunjangan = jumlah_anak * 100000;
        double prosentase_dana = 0.1;
        double dana_pensiun = gaji_pokok * prosentase_dana;
        double gaji_bersih = gaji_pokok + tunjangan - dana_pensiun;

        System.out.println("Gaji Bersih: " + gaji_bersih);
    }

}

