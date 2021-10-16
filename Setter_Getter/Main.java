/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Setter_Getter;

/**
 *
 * @author kazuma
 */
public class Main {
    
    public String nama;
    public int nim;
    public String kelas;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    public static void main(String []args){
         Main mhs = new Main();
         
         mhs.setNama("Ilham Apriansyah");
         mhs.setNim(1904030007);
         mhs.setKelas("5A");
         
         System.out.println("   Daftar mahasiswa    ");
         System.out.println("Nama : " +mhs.getNama());
         System.out.println("Nim : " +mhs.getNim());
         System.out.println("Kelas : " +mhs.getKelas());
         
         
    }
}
