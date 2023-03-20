package cuboidcalculator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GF75
 */
public class Balok {
    private double tinggi, panjang, lebar;

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    
    public Balok(double p, double l, double t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public double hitungLuas() {
        double luas = panjang*lebar;
        return luas;
    }
    
     public double hitungKeliling() {
        double luas = 2*(panjang+lebar);
        return luas;
    }
    
    public double hitungVolume() {
        double volume = panjang*lebar*tinggi;
        return volume;
    }

    public double hitungLuasPer() {
        double luasper = 2*((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi));
        return luasper;
    }
}
