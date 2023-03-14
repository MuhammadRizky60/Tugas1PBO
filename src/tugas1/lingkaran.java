/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

public class lingkaran implements menghitungbidang{
    private double jarijari;
    
    public lingkaran(double jarijari){
        this.jarijari = jarijari;
        
    }
    public void setjarijari(double jarijari){
        this.jarijari = jarijari;
        
    }
    public double getjarijari(){
        return jarijari;
    }
    
    @Override
    public double hitungkeliling() {
        return 2*Math.PI*jarijari;
    }

    @Override
    public double hitungluas() {
        return Math.PI*jarijari*jarijari;
    }
    
}
