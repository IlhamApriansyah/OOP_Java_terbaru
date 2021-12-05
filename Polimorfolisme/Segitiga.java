/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfolisme;

/**
 *
 * @author kazuma
 */
public class Segitiga extends BangunanDatar{
    
    public float alas;
    public float tinggi;
    
    public Segitiga(float alas, float tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    public float luas(){
        return (float) (0.5 * alas * tinggi);
    }

}
