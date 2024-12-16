/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latkasus1;

import java.util.Scanner;

/**
 *
 * @author Abel saferyan
 */
public class LatKasus1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

            // Input Petugas
            System.out.print("Nama Petugas: ");
            String namaPetugas = scanner.nextLine();

            // Input Tanggal
            System.out.print("Tanggal: ");
            String tanggal = scanner.nextLine();

            // Input Jumlah Data
            System.out.print("Jumlah Data yang dimasukkan: ");
            int jumlahData = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // Array to store data
            String[][] data = new String[jumlahData][5]; // 5 columns: Kode, Nama, Harga, Jumlah, Total

            // Input data
            for (int i = 0; i < jumlahData; i++) {
                System.out.println("Masukkan data ke-" + (i + 1) + ":");
                System.out.print("Kode Barang: ");
                String kodeBarang = scanner.nextLine();
                data[i][0] = kodeBarang;

                // Determine Nama Barang and Harga Barang based on Kode Barang
                String namaBarang = "";
                int hargaBarang = 0;
                switch (kodeBarang) {
                    case "P001":
                        namaBarang = "Printer";
                        hargaBarang = 700000;
                        break;
                    case "V001":
                        namaBarang = "VGA Card";
                        hargaBarang = 75000;
                        break;
                    case "M001":
                        namaBarang = "Motherboard";
                        hargaBarang = 950000;
                        break;
                    default:
                        namaBarang = "Unknown";
                        hargaBarang = 0;
                }
                data[i][1] = namaBarang;
                data[i][2] = String.valueOf(hargaBarang);

                System.out.print("Jumlah Barang: ");
                int jumlahBarang = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                data[i][3] = String.valueOf(jumlahBarang);

                // Calculate Total Harga
                int totalHarga = hargaBarang * jumlahBarang;
                data[i][4] = String.valueOf(totalHarga);
            }

            // Output
            System.out.println("+ + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + +");
            System.out.println("Nama Petugas : " + namaPetugas + " Tanggal : " + tanggal);
            System.out.println("Jumlah Data yang di masukan : " + jumlahData);
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            System.out.println("Data Ke Kode Barang Nama Barang Harga Barang Jumlah Barang Total Harga");
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

            // Print data
            for (int i = 0; i < jumlahData; i++) {
                System.out.printf("%-7s %-11s Rp. %-7s %-12s Rp. %-7s\n",
                        data[i][0], data[i][1], data[i][2], data[i][3], data[i][4]);
            }

            // Calculate and print total pendapatan
            int totalPendapatan = 0;
            for (int i = 0; i < jumlahData; i++) {
                totalPendapatan += Integer.parseInt(data[i][4]);
            }
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            System.out.println("Total Pendapatan Pada tanggal " + tanggal + " adalah sebesar Rp. " + totalPendapatan);
            System.out.println("Ketentuan soal :");
            System.out.println(" Gunakan Array untuk memasukkan data sesuai dengan jumlah data yang dimasukkan");
            System.out.println(" Untuk nama barang dan harga barang dihasilkan dari masukan kode barang, dengan ketentuan :");
            System.out.println("  Kode Barang  Nama Barang     Harga Barang");
            System.out.println("  P001         Printer         Rp. 700000");
            System.out.println("  V001         VGA Card        Rp. 75000");
            System.out.println("  M001         Motherboard     Rp. 950000");
            System.out.println(" Total didapatkan dari harga barang dikalikan dengan jumlah barang");
            System.out.println(" Total pendapatan merupakan hasil dari penjumlahan total harga data yang dimasukkan");
            System.out.println("+ + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + +");
        }
    }   
