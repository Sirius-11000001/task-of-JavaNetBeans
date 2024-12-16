/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifelseclassjava;

import java.util.Scanner;

/**
 *
 * @author Abel saferyan
 */
public class IfElseClass {
    
    public String nama,ket;
    public int NAkhir;
    Scanner input = new Scanner(System.in);
    public void setInputData(){
        System.out.println("Masukkan Nama Siswa  : ");
        nama=input.nextLine();
        System.out.println("Masukkan Nilai Akhir : ");
        NAkhir=input.nextInt();
}
public String getKeterangan(){
    if(NAkhir>60){
        ket="Lulus";
        
    }else{
        ket="Gagal";
    }
        return ;
}
}