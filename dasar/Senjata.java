/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dasar;

/**
 *
 * @author kazuma
 */
public class Senjata {
    
    //Atribut
    int JP;
    String jenis;
    String NS;
    int berat;
    String warna;
    
    //Method run
    void run(){
        System.out.println("Spesifikasi");
        System.out.println(NS);
        System.out.println(berat +" kg");
        System.out.println(warna);
    }
    
    //Method tindakan
    void tembak(){
        System.out.println("sudah menembak " +JP + " kali");
    }
    
    boolean reload(){
       if(JP <= 0) return true;
       return false;
    }
}
