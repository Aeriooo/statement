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
public class puskesmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nilaiA = "punya kis";
        String nilaiB = "tidak punya kis, warga setempat";
        String nilaiC = "tidak punya kis, bukan warga setempat";
        
        System.out.println("CEK KESEHATAN");
        System.out.println("apakah anda mempunyai kis?");
        System.out.println("punya kis");
        System.out.println("tidak punya kis, warga setempat");
        System.out.println("tidak punya kis, bkan warga setempat");
        
        System.out.println("JAWABAN");
        
        System.out.println("Jawab Sesuai Pertanyaan");
        String kriteria = input.nextLine();
        
        if(kriteria.equals(nilaiA)){
            System.out.println("total bayar = Rp.0");
        } else if (kriteria.equals(nilaiB)){
            System.out.println("total bayar = Rp.7500");
        } else {
            System.out.println("tidak boleh berobat");
        }
    }
    
}