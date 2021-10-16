/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overriding;

/**
 *
 * @author kazuma
 */
public class main {
    public static void main(String []args){
        
        main player = new main();
        
        Kunti kunti = new Kunti();
        kunti.nama="Shin";
        kunti.HP=100;
        kunti.Attack=100;
        
        System.out.println("---------- Kunti --------");
        kunti.status();
        kunti.EA();
        
        Zombie zombie = new Zombie();
        zombie.name="Kazuma";
        zombie.HP=150;
        zombie.Attack=50;
        
        System.out.println("---------- Zombie --------");
        zombie.status();
        zombie.EA();
        
        
    }
}
