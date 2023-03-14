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
public class balok extends persegipanjang implements menghitungruang{
    private double tinggi;
    
    public balok(double panjang, double lebar, double tinggi){
        super(panjang, lebar);
        this.tinggi = tinggi;
        
    }
    public void settinggi(double tinggi){
        this.tinggi = tinggi;
        
    }
    public double gettinggi(){
        return tinggi;
    }

    @Override
    public double hitungvolume() {
        return super.getlebar()*super.getpanjang()*tinggi;
    }

    @Override
    public double hitungluaspermukaan() {
        return 2*((super.getpanjang()*super.getlebar())+(super.getlebar()*tinggi)+(super.getpanjang()*tinggi));
    }
}
