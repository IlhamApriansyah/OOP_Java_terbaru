/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfolisme;

/**
 *
 * @author kazuma
 */
public class Persegi extends BangunanDatar {
    
    public int sisi;
    
    public Persegi(int sisi){
        this.sisi = sisi;
    }
 
    @Override
    public float luas(){
    return this.sisi * this.sisi;
    }
    
    public float keliling(){
        return this.sisi * 4;
    }
    
}
 