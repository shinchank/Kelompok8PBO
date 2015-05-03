/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

/**
 *
 * @author shinchank
 */
public class Orang {
    private String id;
    private String nama;
    private String noTelp;
    private String alamat;
    private String linkFB;
    private double biayaSendiri = 0;
    private double biayaPatungan;

    public Orang(String id, String nama, String noTelp, String alamat, String linkFB) {
        this.id = id;
        this.nama = nama;
        this.noTelp = noTelp;
        this.alamat = alamat;
        this.linkFB = linkFB;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setLinkFB(String linkFB) {
        this.linkFB = linkFB;
    }

    public void setBiayaSendiri(double biayaSendiri) {
        this.biayaSendiri += biayaSendiri;
    }

    public void setBiayaPatungan(double biayaPatungan) {
        this.biayaPatungan = biayaPatungan;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getLinkFB() {
        return linkFB;
    }

    public double getBiayaSendiri() {
        return biayaSendiri;
    }

    public double getBiayaPatungan() {
        return biayaPatungan;
    }
    
    public String toString(){
        return "\n ID : "+id
                +"\n Nama :"+nama
                +"\n Nomor HP : "+noTelp
                +"\n Alamat : "+alamat
                +"\n Link FB : "+linkFB;
    }
}
