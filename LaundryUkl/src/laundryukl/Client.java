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
public class Client implements User { //turunan dari user
    
    private ArrayList<String> namaClient = new ArrayList<String>(); //array list
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>(); 
    private ArrayList<Integer> saldo = new ArrayList<Integer>();

    
    public Client(){//construktor
        this.namaClient.add("Alya");//menambahkan data di arrray list
        this.alamat.add("Sawojajar");//inheritance
        this.telepon.add("08523543231");
        this.saldo.add(50000);
        
        this.namaClient.add("Amel");
        this.alamat.add("Lowokwaru ");
        this.telepon.add("08193214372");
        this.saldo.add(100000);
        
        this.namaClient.add("Aril");
        this.alamat.add("Kedungkandang ");
        this.telepon.add("08518989026");
        this.saldo.add(55000);
        
    }
    //encapsulasi
    public void setSaldo(int saldo){//mengatur saldo
        this.saldo.add(saldo);
    }
    
    public int getSaldo(int idMember){//mendapatkan memeber
        return this.saldo.get(idMember);
    }
    public void editSaldo(int idMember, int saldo){
        this.saldo.set(idMember, saldo);
    }
    public int getJmlClient(){
        return this.saldo.size();
    }
    
    //override dan isi implementasi methodnya sama
    @Override //ini tempat override
    public void setNama(String namaMember) {
        this.namaClient.add(namaMember);
    }

    @Override//mengimplementasikan class kembali
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int idMember) {
        return this.namaClient.get(idMember);
    }

    @Override
    public String getTelepon(int idMember) {
        return this.telepon.get(idMember);
    }

    @Override
    public String getAlamat(int idMember) {
        return this.alamat.get(idMember);
    }
    
}

