/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dasar;

/**
 *
 * @author kazuma
 */
public class Tembakan {
    public static void main(String []args){
        
        //Method
        Senjata nembak = new Senjata();
        
        //Atribut
        
        nembak.NS="AK47";
        nembak.berat=100;
        nembak.warna="Hitam";
        
        //Method Utama
        nembak.run();
        System.out.println("--------------------");
        nembak.tembak();
        System.out.println("--------------------");
        
        if(nembak.reload()){
            System.out.println("Reload");
        System.out.println("--------------------");
        }
    }
}
