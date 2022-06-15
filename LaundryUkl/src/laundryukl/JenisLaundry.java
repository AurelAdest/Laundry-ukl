/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundryukl;

import java.util.ArrayList;

/**
 *
 * @author aurel
 */

public class JenisLaundry {
    private ArrayList<String> JenisLaundry = new ArrayList<String>(); //array list
    private ArrayList<Integer> durasi = new ArrayList<Integer>(); 
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    
    public JenisLaundry (){
        this.JenisLaundry.add("Baju/Kg ");
        this.harga.add(15000);
        this.durasi.add(0);
        
        
        this.JenisLaundry.add("Celana/Kg ");
        this.harga.add(12000);
        this.durasi.add(0);
        
        
        this.JenisLaundry.add("Selimut/Pcs");
        this.harga.add(5000);
        this.durasi.add(0);
        
        
        this.JenisLaundry.add("Seragam/Set");
        this.harga.add(14000);
        this.durasi.add(0);
        
      //enkapsulasi karena terdapat public yang menyembunyikan nlai   
    }
    public int getJmlJenisLaundry(){
        return this.JenisLaundry.size();
        }
    public void setJenisLaundry(String namaBarang ){ //mutator method untuk mengubah atau memberi data
        this.JenisLaundry.add(namaBarang);
        }
    public String getJenisLaundry(int idBarang){//accessor method untuk membaca data
        return this.JenisLaundry.get(idBarang);
        }
    public void setDurasi(int Durasi ){ 
        this.durasi.add(Durasi);
        }
    public int getDurasi(int idBarang){ 
        return this.durasi.get(idBarang);
        }
    public void editDurasi(int idBarang, int Durasi){ 
        this.durasi.set(idBarang, Durasi);
    }
    public void setHarga(int harga ){ 
        this.harga.add(harga);
    }
    public int getHarga(int idBarang){ 
        return this.harga.get(idBarang);
}
}

