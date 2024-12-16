/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Barang;

/**
 *
 * @author Abel saferyan
 */
public class Barang1 {

    public String kd, nm;
    public int jml;
    public double hrg, ttl, ub, uk;

    public void setKd(String val){
            kd = val;
    }

    public String getKd(){
            return kd;
    }

    public void setSeleksiKd(){
        if (kd.equalsIgnoreCase("B001")){
            nm = "Pensil";
            hrg = 3000;
        } else if (kd.equalsIgnoreCase("B002")){
            nm = "Buku";
            hrg = 5000;
        } else if (kd.equalsIgnoreCase("B003")){
            nm = "Penggaris";
            hrg = 1000;
        } else if (kd.equalsIgnoreCase("B004")){
            nm = "Penghapus";
            hrg = 500;
        } else {
            nm = "";
            hrg = 0;
        }
    }

    public void setNm(String val) {
        nm = val;
    }

    public String getNm() {
        return nm;
    }

    public void setHrg(Double val) {
        hrg = val;
    }

    public double getHrg() {
        return hrg;
    }

    public void setJml(int val) {
        jml = val;
    }

    public int getJml() {
        return jml;
    }

    public double getTot() {
        ttl = hrg * jml;
        return (ttl);
    }

    public void setUb(double val) {
        ub = val;
    }

    public double getUb() {
        return ub;
    }

    public double getUk() {
        return (ub - ttl);
    }
}
