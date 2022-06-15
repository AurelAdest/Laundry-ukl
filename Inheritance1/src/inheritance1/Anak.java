/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance1;

/**
 *
 * @author aurel
 */
public class Anak extends Ibu {
    String nama= "Aurel";
    int umur= 16;
    //deklarasi method cetak
    void cetak(){
        System.out.println("Memiliki sifat " + super.Sifat);//memanggil variabel di subclass
        System.out.println("Memiliki nama "+nama);
        System.out.println("Berumur "+umur+" tahun");
        System.out.println("Tinggi Badan"+super.tinggi+" cm");
        super.hobi(); //keyword super untuk memanggil sub class ibu
    }    

   
    }

