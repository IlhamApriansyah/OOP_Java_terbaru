/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassAnonymous;

/**
 *
 * @author kazuma
 */
public class Main {
    
    static String tittle = "Tutorial Anonymous";
    
    public static void main(String []args){
        
        Button btn = new Button();
        
     //Class Anonymous dengan implementasi interface
     btn.setAction(new Clickdong(){
         
        @Override
        public void sedangClick(){
        System.out.println(tittle);
        System.out.println("-------------------------");
        System.out.println("Tombol berhasil di klik");
        System.out.println("Yeahhh");
    }
    });
    
    //klik tombol
    btn.doClick();
    }
}
