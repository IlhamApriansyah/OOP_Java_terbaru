/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author kazuma
 */
public class Main {
    public static void main(String []args){
        pocong hantu = new pocong();
        
        hantu.Attack=100;
        hantu.nama="Pocong";
        hantu.HP=0;
        
        hantu.run();
        
        if(hantu.loncat()){
            System.out.println("maka, dia pun loncat dan mengejarmu!....");
        } else {
        if(hantu.diam()){
            System.out.println("Dia pun diam ditempat.....");
        }
        }
    }   
}
