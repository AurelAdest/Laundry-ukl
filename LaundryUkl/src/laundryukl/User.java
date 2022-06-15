/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundryukl;

/**
 *
 * @author aurel
 */
public interface User { 
  //diimplementasikan ke class client
    public void setNama (String nama);
    public void setAlamat (String alamat);
    public void setTelepon (String telepon);
    public String getNama (int id);
    public String getAlamat (int id);
    public String getTelepon (int id);
}//agar bisa mengakses data pada class lain
//class tsb tidak akan mewarisi data" dari parent class
