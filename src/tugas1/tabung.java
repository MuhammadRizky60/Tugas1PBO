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
public class tabung extends lingkaran implements menghitungruang{
    private double tinggitab;
    
    public tabung(double jarijari, double tinggitab){
        super(jarijari);
        this.tinggitab = tinggitab;
        
    }
    public void settinggitab(double tinggitab){
        this.tinggitab = tinggitab;
        
    }
    public double gettinggitab(){
        return tinggitab;
    }

    @Override
    public double hitungvolume() {
        return Math.PI*super.getjarijari()*super.getjarijari()*tinggitab;
    }

    @Override
    public double hitungluaspermukaan() {
        return 2*Math.PI*super.getjarijari()*(super.getjarijari()+tinggitab);
    }
}
