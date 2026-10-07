package Coba;

public class latihan3 {
    public static void main(String[] args) {

        int lamaCicilan = 12;
        double cicilanPokok, cicilanPerBulan, hargaLaptop = 8000000, uangMuka = 2000000, sisaBayar, biayaAdmin = 50000, totalBayar;

        sisaBayar = hargaLaptop - uangMuka;
        cicilanPokok = sisaBayar / lamaCicilan;
        cicilanPerBulan = cicilanPokok + biayaAdmin;

        System.out.println("sisa bayar Rp. " + sisaBayar);
        System.out.println("Cicilan per bulan Rp. " + cicilanPerBulan);

    }
}
