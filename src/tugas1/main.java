package tugas1;

import java.io.IOException;
import java.util.Scanner;

public class main{

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        
        int choose;
        char back;
        String y,Y;
        
        do{
            System.out.flush(); 
            System.out.println("Menu:");
            System.out.println("-----------------------------------------------");
            System.out.println("1. Menghitung Persegi Panjang dan Balok");
            System.out.println("2. Menghitung Lingkaran dan Tabung");
            System.out.println("3. Exit");
            System.out.print("Pilih: ");
            choose = input.nextInt();
            
            switch (choose){
                case 1:
                    System.out.println();
                    System.out.print("Input panjang\t\t: ");
                    double panjang = input.nextDouble();
                    System.out.print("Input lebar\t\t: ");
                    double lebar = input.nextDouble();
                    System.out.print("Input tinggi\t\t: ");
                    double tinggi = input.nextDouble();
                    
                    persegipanjang persegi = new persegipanjang(panjang, lebar);
                    System.out.println("luas persegi panjang \t: " + persegi.hitungluas());
                    System.out.println("Keliling persegi panjang \t: " + persegi.hitungkeliling());
                    
                    balok balok = new balok(panjang, lebar, tinggi);
                    System.out.println("volume balok \t\t\t: " + balok.hitungvolume());
                    System.out.println("Luas permukaan balok \t\t: " + balok.hitungluaspermukaan());
                    break;
                case 2:
                    System.out.println();
                    System.out.print("Input jari-jari\t: ");
                    double jarijari = input.nextDouble();
                    System.out.print("Input tinggi\t\t: ");
                    double tinggiTabung = input.nextDouble();
                    
                    lingkaran lingkar = new lingkaran(jarijari);
                    System.out.println("Luas Lingkaran\t\t: " + lingkar.hitungluas());
                    System.out.println("Keliling Lingkaran\t: " + lingkar.hitungkeliling());
                    
                    tabung tabung = new tabung(jarijari, tinggiTabung);
                    System.out.println("Volume Tabung\t\t: " + tabung.hitungvolume());
                    System.out.println("Luas Permukaan Tabung\t: " + tabung.hitungluaspermukaan());
                    break;
                case 3:
                    System.out.println("Terimakasih");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu yang Anda Inputkan Salah");
                    break;
            }
            System.out.print("Apakah Anda ingin Balik Ke Menu Utama? y/n ");
            back = input.next().charAt(0);
            System.out.println();
        }while (back == 'Y' || back == 'y');
    
}
}