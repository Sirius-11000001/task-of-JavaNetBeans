/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Abel saferyan
 */
import java.util.Scanner;

class LatIfClass {
    private String namaKue;
    private int hargaKue;

    public void setNamaKue(String kode) {
        if (kode.equals("B001")) {
            this.namaKue = "Bolu";
            this.hargaKue = 1000;
        } else if (kode.equals("C001")) {
            this.namaKue = "Cake";
            this.hargaKue = 2000;
        } else if (kode.equals("T001")) {
            this.namaKue = "Tart";
            this.hargaKue = 1500;
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