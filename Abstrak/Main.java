/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstrak;

/**
 *
 * @author kazuma
 */
public class Main {
    public static void main(String []args){
        
        
        //Objek dari class Segitiga
        Bentuk segitiga = new Segitiga(5, 10);
        
        //Objek dari class lingkaran
        Bentuk lingkaran = new Lingkaran(50);
        
        System.out.println("Luas Lingkaran      :   " +lingkaran.getArea());
        System.out.println("Luas Segitiga       :   " +segitiga.getArea());
    }
}
