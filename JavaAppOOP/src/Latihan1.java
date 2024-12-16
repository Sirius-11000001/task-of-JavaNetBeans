import java.util.Scanner;

class Latihan1 {
    private String namaKue;
    private int hargaKue;

    public void setNamaKue(String kode) {
        if (kode.equals("B001")) {
            this.namaKue = "Bolu";
            this.hargaKue = 10000;
        } else if (kode.equals("C001")) {
            this.namaKue = "Cake";
            this.hargaKue = 20000;
        } else if (kode.equals("T001")) {
            this.namaKue = "Tart";
            this.hargaKue = 15000;
        }
    }

    public int getHargaKue() {
        return this.hargaKue;
    }

    public String getNamaKue() {
        return this.namaKue;
    }

    public int hitungTotal(int jumlah) {
        return this.hargaKue * jumlah;
    }
}


