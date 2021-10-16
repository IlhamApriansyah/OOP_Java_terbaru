/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Constructor;

/**
 *
 * @author kazuma
 */
public class Parameter {
    public String nama;
    public int health;
    public int mana;
    
    //Parameter
    public Parameter (String nama, int health, int mana){
    this.nama = nama;
    this.health = health;
    this.mana = mana;
    }
}
    
    //Method Parameter
    class DemoParameter{
        public static void main(String[] args){
            Parameter player = new Parameter("Kazuma",100,50);
            
            System.out.println("Status");
            System.out.println("Nama : " + player.nama);
            System.out.println("Darah : "+ player.health);
            System.out.println("Mana : " +player.mana);
    }
}
