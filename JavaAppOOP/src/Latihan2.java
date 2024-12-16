
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Abel saferyan
 */
public class Latihan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
public class Latihan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama pembeli = ");
        String namaPembeli = scanner.nextLine();

        System.out.print("Masukkan Kode [B001|C001|T001] = ");
        String kodeKue = scanner.nextLine();

        System.out.print("Masukkan jumlah beli = ");
        int jumlahBeli = scanner.nextInt();

        LatIfClass kue = new Latihan1();
        kue.setNamaKue(kodeKue);
        int totalBayar = kue.hitungTotal(jumlahBeli);

        System.out.println("\nPENJUALAN KUE PADA TOKO KUE 'LEZAT'");
        System.out.println("JL. Sagu No.27A Kebagusan , Jakarta Selatan");
        System.out.println("-------------------------------------------------------");
        System.out.println("PEMBELI : " + namaPembeli);
        System.out.println("KODE KUE : " + kodeKue);
        System.out.println("NAMA KUE : " + kue.getNamaKue());
        System.out.println("HARGA : RP. " + kue.getHargaKue());
        System.out.println("JUMLAH BELI : " + jumlahBeli);
        System.out.println("-----------------------------------------------------");
        System.out.println("TOTAL : RP. " + totalBayar);
        System.out.println("-----------------------------------------------------");
    }
}