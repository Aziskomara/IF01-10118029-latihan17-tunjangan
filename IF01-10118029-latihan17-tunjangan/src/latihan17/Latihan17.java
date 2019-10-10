/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan17;

import java.util.Scanner;

/**
 *
 * @author acer
 * NAMA      : Azis komara
 * KELAS     : IF-1
 * NIM       : 10118029
 * Deskripsi Program   : Program ini berisi program tunjangan
 */
public class Latihan17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //inputan
        Scanner input = new Scanner(System.in);
        System.out.println("-----------Program Tunjangan----------------");
        System.out.print("masukan gajih pokok anda perbulan :Rp. ");
        int gajipokok = input.nextInt();
        System.out.print("Status adnda ? (menikah/belum) : ");
        String status = input.next();
             
        //logoka
        double tunjangan;
        double totalgaji;
        
        if(status.equals("menikah")){
            tunjangan = gajipokok * 35/100;
            totalgaji = gajipokok + tunjangan;
        }else{
            tunjangan = 0;
            totalgaji = gajipokok + tunjangan;
        }
        
        //output
        System.out.println("-----------Hasil perhitungan gaji anda-------- ");
        System.out.println("Gaji pokok anda :Rp. " + gajipokok);
        System.out.println("tunjangan anda  :Rp. " + tunjangan);
        System.out.println("total gaji anda :Rp. " + totalgaji);
        System.out.println("Developed by : Azis komara");
    }
    
}
