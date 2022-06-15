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
public class Petugas implements User{ //bentuk pewarisan karena ada implements
private ArrayList<String> namaPetugas = new ArrayList<String>(); //encapsulasi
private ArrayList<String> alamat = new ArrayList<String>(); 
private ArrayList<String> telepon = new ArrayList<String>(); 
private ArrayList<String> jabatan = new ArrayList<String>();

public Petugas (){ //keywoard this buat pemanggil methods kelas itu sendiri , pembuatan kelas untuk menyatakan objek
    this.namaPetugas.add("Rifa");
    this.alamat.add("Blitar");
    this.telepon.add("081252191827");
    this.jabatan.add("Pemilik toko");
    
    this.namaPetugas.add("Grisel");
    this.alamat.add("Ngunut");
    this.telepon.add("081249699404");
    this.jabatan.add("Petugas cuci");
    
    this.namaPetugas.add("Zalfa");
    this.alamat.add("Malang");
    this.telepon.add("085604441400");
    this.jabatan.add("Petugas setrika");
    
    this.namaPetugas.add("Aurel");
    this.alamat.add("Kediri");
    this.telepon.add("085708830732");
    this.jabatan.add("Petugas packing");
}
public void setJabatan(String jabatan){ //method
    this.jabatan.add(jabatan);
}
public String getJabatan(int id){
    return this.jabatan.get(id);
}
public int getJmlPetugas(){
    return this.namaPetugas.size();
}

    @Override //mengimplementasi kembali subclass
    public void setNama(String namaKaryawan) {//mutator method=mengubah/menilai data
        this.namaPetugas.add(namaKaryawan);
    }

    @Override
    public void setAlamat(String alamat) {
        this.namaPetugas.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.namaPetugas.add(telepon);
    }

    @Override
    public String getNama(int idKaryawan) {//acecosor method
        return this.namaPetugas.get(idKaryawan);
    }

    @Override
    public String getTelepon(int idKaryawan) {
        return this.telepon.get(idKaryawan);
    }

    @Override
    public String getAlamat(int idKaryawan) {
        return this.alamat.get(idKaryawan);
    }//inhe
    
}

