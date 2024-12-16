/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasAkhir;

/**
 *
 * @author Abel saferyan
 */
public class Buah {
    public String menu1, menu2, menu3, keju, oreo, ceres, cara;
    public int jml1, jml2, jml3;
    public double hrg_k = 0, hrg_o = 0, hrg_c = 0,tukn, hrg1, hrg2, hrg3, ttl1, ttl2, ttl3, ttl4, ub, uk, biaya = 0, total = 0;
    
    public void setMenu1(String val){
        menu1 = val;
    }
    public String getMenu1(){
        return menu1;
    }
    public double getHrg1(){
        return hrg1;
    }
    public void setSeleksiMe1(){
        if(menu1.equalsIgnoreCase("Jus Mangga")){
            hrg1 = 5000;
        }else if(menu1.equalsIgnoreCase("Jus Apel")){
            hrg1 = 5000;
        }else if(menu1.equalsIgnoreCase("Jus Alpukat")){
            hrg1 = 5000;
        }else if(menu1.equalsIgnoreCase("Jus Jambu")){
            hrg1 = 5000;
        }else if(menu1.equalsIgnoreCase("Jus Pisang")){
            hrg1 = 5000;
        }else if(menu1.equalsIgnoreCase("Sup Buah")){
            hrg1 = 10000;
        }else if(menu1.equalsIgnoreCase("Sup Buah Spesial")){
            hrg1 = 15000;
        }else{
            hrg1 = 0;
        }
        
    }
    public void setMenu2(String val){
        menu2 = val;
    }
    public String getMenu2(){
        return menu2;
    }
    public double getHrg2(){
        return hrg2;
    }
    public void setSeleksiMe2(){
        if(menu2.equalsIgnoreCase("Jus Mangga")){
            hrg2 = 5000;
        }else if(menu2.equalsIgnoreCase("Jus Apel")){
            hrg2 = 5000;
        }else if(menu2.equalsIgnoreCase("Jus Alpukat")){
            hrg2 = 5000;
        }else if(menu2.equalsIgnoreCase("Jus Jambu")){
            hrg2 = 5000;
        }else if(menu2.equalsIgnoreCase("Jus Pisang")){
            hrg2 = 5000;
        }else if(menu2.equalsIgnoreCase("Sup Buah")){
            hrg2 = 10000;
        }else if(menu2.equalsIgnoreCase("Sup Buah Spesial")){
            hrg2 = 15000;
        }else{
            hrg2 = 0;
        }
    }
    public void setMenu3(String val){
        menu3 = val;
    }
    public String getMenu3(){
        return menu3;
    }
    public double getHrg3(){
        return hrg3;
    }
    public void setSeleksiMe3(){
        if(menu3.equalsIgnoreCase("Jus Mangga")){
            hrg3 = 5000;
        }else if(menu3.equalsIgnoreCase("Jus Apel")){
            hrg3 = 5000;
        }else if(menu3.equalsIgnoreCase("Jus Alpukat")){
            hrg3 = 5000;
        }else if(menu3.equalsIgnoreCase("Jus Jambu")){
            hrg3 = 5000;
        }else if(menu3.equalsIgnoreCase("Jus Pisang")){
            hrg3 = 5000;
        }else if(menu3.equalsIgnoreCase("Sup Buah")){
            hrg3 = 10000;
        }else if(menu3.equalsIgnoreCase("Sup Buah Spesial")){
            hrg3 = 15000;
        }else{
            hrg3 = 0;
        }
    }
    
    public void setKeju(String val){
        keju = val;
    }
    public double getKeju(){
        if(keju.equalsIgnoreCase("Keju")){
            hrg_k = 3000;
        }else{
            hrg_k = 0;
        }
        return hrg_k;
    }
    public void setOreo(String val){
        oreo = val;
    }
    public double getOreo(){
        if(oreo.equalsIgnoreCase("Oreo")){
            hrg_o = 3000;
        }else{
            hrg_o = 0;
        }
        return hrg_o;
    }
    public void setCeres(String val){
        ceres = val;
    }
    public double getCeres(){
        if(ceres.equalsIgnoreCase("Ceres")){
            hrg_c = 3000;
        }else{
            hrg_c = 0;
        }
        return hrg_c;
    }
    public void setCara(String val){
        cara = val;
    }
    public String getCara(){
        return cara;
    }
    public double getBiaya(){
        return biaya;
    }

    public void setSeleksiCara(){
        if(cara.equalsIgnoreCase("BCA")){
            biaya = 3500;
        }else if(cara.equalsIgnoreCase("Lainnya")){
            biaya = 6500;
        }else{
            biaya = 0;
        }
    }
    public void setJml1(int val){
        jml1 = val;
    }
    public int getJml1(){
        return jml1;
    }
    public double getTot1(){
        ttl1 = hrg1*jml1;
        return(ttl1);
    }
    public void setJml2(int val){
        jml2 = val;
    }
    public int getJml2(){
        return jml2;
    }
    public double getTot2(){
        ttl2 = hrg2*jml2;
        return(ttl2);
    }
    public void setJml3(int val){
        jml3 = val;
    }
    public int getJml3(){
        return jml3;
    }
    public double getTot3(){
        ttl3 = hrg3*jml3;
        return(ttl3);
    }
    public double getTot4(){;
        ttl4 = ttl1+ttl2+ttl3+biaya+hrg_k+hrg_o+hrg_c;
        return(ttl4);
    }
    public void setUb(double val){
        ub = val;
    }
    public double getUb(){
        return ub;
    }
    public double getUk(){
        return (ub-ttl4);
    }
}
