/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfolisme;

/**
 *
 * @author kazuma
 */
public class Main {
    public static void main(String [] args){
        
        BangunanDatar Datar = new BangunanDatar();
        Persegi P = new Persegi(4);
        Segitiga S = new Segitiga(6, 15);
        Lingkaran L = new Lingkaran(50);
        
        
        System.out.println("         Persegi       ");
        System.out.println("Luas Persegi =" +P.luas() );
        System.out.println("        Lingkaran       ");
        System.out.println("Luas Lingkaran =" +L.luas());
        
    }
}
