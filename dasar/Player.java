/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dasar;

/**
 *
 * @author kazuma
 */
public class Player {
    
    //Atribut
    String nama;
    int speed;
    int HP;
    
    //Method Run
    void run(){
        System.out.println(nama +" sedang berlari...");
        System.out.println("Speed : " + speed);
        System.out.println("HP :" + HP);
    }
    
    //Method isDead untuk cek nilai HP
    boolean isDead(){
        if(HP <= 0) return true;
        return false;
    }
    
    
}
