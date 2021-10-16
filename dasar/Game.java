/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dasar;

/**
 *
 * @author kazuma
 */
public class Game {
    public static void main(String [] args){
        
        //Objek Player
        Player samurai = new Player();
        
        //Atribut Player
        samurai.nama = "Kazuma";
        samurai.speed= 60;
        samurai.HP= 100;
        
        //Method Utama
        samurai.run();
       
        if(samurai.isDead()){
            System.out.println("Permainan Berakhir!");
        } else {
        
        }
    }
}
