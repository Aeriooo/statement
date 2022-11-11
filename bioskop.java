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
public class bioskop {
    public static void main(String[] args) {
        int umur;
    Scanner Bioskop = new Scanner(System.in);
    
        System.out.println("masukan umur");
        umur = Bioskop.nextInt();
        
        switch(umur){
            case 18:
                System.out.println("Boleh");
                break;
            case 19:
                System.out.println("Boleh");
                break;
            case 20:
                System.out.println("Boleh");
                break;
            default:
                System.out.println("dirumah saja");
                
    }
    }
    
}
