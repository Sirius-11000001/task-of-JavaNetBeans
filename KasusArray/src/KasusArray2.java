/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Abel saferyan
 */
public class KasusArray2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\n\n    DATA PELANGGAN PT. SENTOSA JAYA ");
        System.out.println("    JL. Sagu No.27A Kebagusan Jakarta Selatan ");
        System.out.println("========================================================");
        System.out.println("No \t Kode Pelanggan \t Nama Pelanggan \t\t Alamat");
        System.out.println("========================================================");
        for (i=1;i<=jd;i++)
        {
            System.out.println("Data ke- "+i);
            System.out.println("Kode pelanggan   : "+kp[i]);
            System.out.println("Nama pelanggan   : "+nm[i]);
            System.out.println("Alamat pelanggan : "+almt[i]);
            System.out.println("=====================================================");
            System.out.println(i+"\t\t"+kp[i]+"\t\t\t\t"+nm[i]+"\t\t\t\t\t"+almt[i]);
            
        }
        System.out.println("======================================================");
        System.out.println("Mau input data lagi : "),tanya = input.next();
    }while(tanya.equals("Y") ||tanya.equals("y"));
    }
    
}
