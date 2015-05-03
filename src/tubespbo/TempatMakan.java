/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import java.util.ArrayList;

/**
 *
 * @author shinchank
 */
public class TempatMakan {
    private String nama;
    private String alamat;
    private String noTelp;
    private int nMakanan;
    private ArrayList<Makanan> makanan = new ArrayList<>();
    
    public TempatMakan(){
        
    }

    public TempatMakan(String nama, String alamat, String noTelp) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }
    
    public void addMakanan(Makanan m){
        makanan.add(m);
    }
    
    public void editMakanan(Makanan m, Makanan mx){
        int idx = makanan.lastIndexOf(mx);
        makanan.set(idx, m);
    }
    
    public Makanan cariMakanan(String nama){
        Makanan result = null;
        for (Makanan makanan1 : makanan) {
            if(makanan1.getNama().toLowerCase().equals(nama.toLowerCase())){
                result = makanan1;
            }
        }
        return result;
    }
    
    public String[] getListMakanan(){
        String[] result = new String[makanan.size()];
        int i = 1;
        int j = 0;
        for (Makanan makanan1 : makanan) {
            result[j] = i+". "+makanan1.toString();
            j++;
            i++;
        }
        return result;
    }
    
    public String toString(){
        return "Nama    : "+nama
                +"\nAlamat    : "+alamat
                +"\nNo Telpon : "+noTelp;
    }
    
    public double getHargaMakanan(int idx){
        double harga = makanan.get(idx).getHarga();
        double pajak = makanan.get(idx).getPajak();
        double result =  harga + ((pajak/100)*harga);
        return result;
    }
    
    public int getNMakanan(){
        this.nMakanan = makanan.size();
        return this.nMakanan;
    }
}
