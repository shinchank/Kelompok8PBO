/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import java.util.ArrayList;

/**
 *
 * @author Kelompok 8 Tubes PBO
 */
public class TempatMakan {
    private String nama;
    private String alamat;
    private String noTelp;
    private int nMakanan;
    private ArrayList<Makanan> makanan = new ArrayList<>();
    
    public TempatMakan(){
        
    }
    
    /**
     * Constructor Tempat makan yang berisi parameter berikut:
     * @param nama
     * @param alamat
     * @param noTelp 
     */

    public TempatMakan(String nama, String alamat, String noTelp) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
    }
    
    /**
     * 
     * @return Nama
     */

    public String getNama() {
        return nama;
    }
    
    /**
     * 
     * @return Alamat
     */

    public String getAlamat() {
        return alamat;
    }
    
    /**
     * 
     * @return Nomor Telepon
     */

    public String getNoTelp() {
        return noTelp;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    /**
     * 
     * @param alamat 
     */

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    /**
     * 
     * @param noTelp 
     */

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }
    
    /**
     * Method ini berfungsi untuk menambahkan makanan.
     * @param m 
     */
    
    public void addMakanan(Makanan m){
        makanan.add(m);
    }
    
    /**
     * Method ini berfungsi untuk mengedit makanan, yang sudah pernah terdata sebelumnya di aplikasi patungan.
     * @param m
     * @param mx 
     */
    
    public void editMakanan(Makanan m, Makanan mx){
        int idx = makanan.lastIndexOf(mx);
        makanan.set(idx, m);
    }
    
    /**
     * Method ini berfungsi untuk mencari makanan yang ada pada satu tempat makan.
     * Dengan cara menginputkan nama.
     * @param nama
     * @return 
     */
    
    public Makanan cariMakanan(String nama){
        Makanan result = null;
        for (Makanan makanan1 : makanan) {
            if(makanan1.getNama().toLowerCase().equals(nama.toLowerCase())){
                result = makanan1;
            }
        }
        return result;
    }
    
    /**
     * Method ini berfungsi untuk menampilkan daftar makanan yang ada pada satu tempat makan.
     * @return 
     */
    
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
    
    /**
     * Method ini berfungsi untuk mengembalikan/menampilkan kembali
     * Nama, alamat dan nomor telepon
     * @return 
     */
    
    public String toString(){
        return "Nama    : "+nama
                +"\nAlamat    : "+alamat
                +"\nNo Telpon : "+noTelp;
    }
    
    /**
     * Method ini berfungsi untuk menambahkan harga dan pajak makanan, saat mengedit harga makanan.
     * @param idx
     * @return 
     */
    
    public double getHargaMakanan(int idx){
        double harga = makanan.get(idx).getHarga();
        double pajak = makanan.get(idx).getPajak();
        double result =  harga + ((pajak/100)*harga);
        return result;
    }
    
    /**
     * Method ini berfungsi untuk menyimpan/merekam makanan apa saja yang di makan dengan jumlahnya.
     * @return 
     */
    
    public int getNMakanan(){
        this.nMakanan = makanan.size();
        return this.nMakanan;
    }
}
