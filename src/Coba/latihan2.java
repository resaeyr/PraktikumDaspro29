package Coba;

public class latihan2 {
    public static void main(String[] args) {

        int tugas = 80, UTS = 75, UAS = 90;
        double prosentaseTugas = 0.2, prosentaseUTS = 0.3, prosentaseUAS = 0.5, nilaiAkhir;

        nilaiAkhir = (tugas * prosentaseTugas) + (UTS * prosentaseUTS) + (UAS * prosentaseUAS);

        System.out.println("Nilai akhir anda adalah " + nilaiAkhir);
    }
}
