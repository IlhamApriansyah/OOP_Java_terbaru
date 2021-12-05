/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package This_Super;

/**
 *
 * @author kazuma
 */

public class Boss_Super extends Karyawan_Super {
    
    float gaji = 3000f;
    String nama = "Ilham";
    int NIK = 65440352;
    
    public void Showinfo(){
        System.out.println("Nama = " + super.nama);
        System.out.println("NIK = " + super.NIK);
        System.out.println("Gaji = $" + gaji);
        
    }
}
