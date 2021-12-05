/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

import java.util.Scanner;

/**
 *
 * @author kazuma
 */
public class main {
    public static void main(String []args){
        
        //merk
        Komputer i3 = new Intel();
        
        //user
        KomputerUser ilham = new KomputerUser(i3);
        
        //menyalakan 
        ilham.TurnOnKomputer();
        
        //mematikan
        ilham.TurnOffKomputer();
        
        //Input
        Scanner input = new Scanner(System.in);
        String aksi;
        
         while (true) {
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan Komputer");
            System.out.println("[2] Matikan Komputer");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih : ");
            aksi = input.nextLine();
            
            if(aksi.equalsIgnoreCase("1")){
                ilham.TurnOnKomputer();
            } else if (aksi.equalsIgnoreCase("2")){
                ilham.TurnOffKomputer();
            } else if (aksi.equalsIgnoreCase("0")){
                System.exit(0);
            } else {
                System.out.println("Pilihan salah");
            }
        }

    }

}