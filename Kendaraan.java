
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
 import java.util.Scanner;
public class Kendaraan {
    public static void main(String[] args) {
        int penumpang;
        Scanner kendaraan = new Scanner(System.in);
        
        System.out.println("Masuukan jumlah penumpang : ");
        penumpang = kendaraan.nextInt();
        
        switch(penumpang){
            case 1 :
                System.out.println("naik sepeda");
                break;
                
            case 2 :
                System.out.println("naik sepeda motor");
                break;
            case 4 :
                System.out.println("mobil bangg");
                break;
            case 5 :
                System.out.println("Truk rombongan bu lurahh");
                break;
            default:
                System.out.println("penumpang tidak valid");
        
    }
    }
}
