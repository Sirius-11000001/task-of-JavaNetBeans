/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifelseclassjava;

/**
 *
 * @author Abel saferyan
 */
public class ifElseClassAksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    IfElseClass ifclass=new IfElseClass();
    
    ifclass.setInputData();
    ifclass.getKeterangan();
        System.out.println("Bukti Ujian Akhir");
        System.out.println("=================================");
        System.out.println("Nama Siswa               : "+ifclass.nama);
        System.out.println("Nilai Akhir yang didapat : "+ifclass.NAkhir);
        System.out.println("Keterangan               : "+ifclass.getKeterangan());
    }
    
}
