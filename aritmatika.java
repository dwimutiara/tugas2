/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author 21102091 kadek dwi mutiara utami
 */
public class aritmatika {
    //property
    public double hasil;
    private double kurang;
    
    //method tambah
    public void tambah (double bill, double bil2){
        this.hasil = bill+ bil2;
    }    
    //method kurang
    public void kurang(double bill, double bil2){
        this.hasil = bill -bil2;
    }
    //method kali
    public void kali(double bill, double bil2){
        this.hasil = bill * bil2;
    }
    //method bagi
    public void bagi(double bill, double bil2){
        this.hasil = bill / bil2;
    }
    //get hasil
    public double gethasil(){
        return this.hasil;
    }
}

