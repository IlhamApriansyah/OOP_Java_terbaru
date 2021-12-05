/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstrak;

/**
 *
 * @author kazuma
 */
public class Segitiga extends Bentuk{
    
    private float dasar;
    private float tinggi;
    
    public Segitiga(int dasar, int tinggi){
        this.dasar = dasar;
        this.tinggi = tinggi;
    }
    
    @Override
    float getArea(){
        return 0.5f * dasar * tinggi;
    }
}
