/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overriding;

/**
 *
 * @author kazuma
 */
public class Kunti extends Zombie {
    
    
    String nama;
    int HP;
    int Attack;
    
    @Override
    void status(){
        System.out.println("Nama :" + nama);
        System.out.println("HP :" + HP);
    }
    
    void EA(){
        System.out.println(Attack);
    }
}
