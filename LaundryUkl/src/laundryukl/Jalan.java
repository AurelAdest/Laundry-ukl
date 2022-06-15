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
public class Jalan {
    
    public static void main (String [] args){//method main
        
        
    Client c = new Client (); //untuk mmenambah/membuat object baru
    Petugas p = new Petugas (); 
    JenisLaundry j = new JenisLaundry (); 
    Transaksi t = new Transaksi ();
    Laporan l = new Laporan ();
    
    l.laporan(p);//method
    l.laporan(j);
    l.laporan(c);
            
    l.laporan(t, j);//proses transaksi
    t.prosesTransaksi(c, t, j);
    l.laporan(t, j);
    l.laporan(j);
    l.laporan(c);
}
}

