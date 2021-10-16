/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Setter_Getter;

/**
 *
 * @author kazuma
 */
public class Main_2 {
    
    public String nama;
    public int HP;
    public int MP;
    public int Attack;
    public double gold;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public int getAttack() {
        return Attack;
    }

    public void setAttack(int Attack) {
        this.Attack = Attack;
    }

    public double getGold() {
        return gold;
    }

    public void setGold(double gold) {
        this.gold = gold;
    }
    
    public static void main(String []args){
        Main_2 Player = new Main_2();
        
        Player.setNama("Kazuma");
        Player.setHP(100);
        Player.setMP(50);
        Player.setAttack(500);
        Player.setGold(1.000);
        
        System.out.println("    Status Player   ");
        System.out.println("Nama : " +Player.getNama());
        System.out.println("Darah yang dimiliki : " +Player.getHP());
        System.out.println("Mana yang dimiliki : " +Player.getMP());
        System.out.println("Jumlah Damage yang dimiliki : " +Player.getAttack());
        System.out.println("Uang yang dimiliki :" +Player.getGold());
    }
}
