/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author ASUS
 */
public class persegipanjang implements menghitungbidang {

    private double panjang;
    private double lebar;
    
    public persegipanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
        
    }
    public void setpanjang(double panjang){
        this.panjang = panjang;
        
    }
    public void setlebar(double lebar){
        this.lebar = lebar;
        
    }
    public double getpanjang(){
        return panjang;
    }
   
    public double getlebar(){
        return lebar;
    }
    
    @Override
    public double hitungkeliling() {
        return 2*panjang+2*lebar;
    }

    @Override
    public double hitungluas() {
        return panjang*lebar;
    }
    
}
