/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author kazuma
 */
public class KomputerUser {
    
    private Komputer komputer;
    
    public KomputerUser(Komputer komputer){
        this.komputer = komputer;
    }
    
    void TurnOnKomputer(){
        this.komputer.TurnOn();
    }
    
    void TurnOffKomputer(){
        this.komputer.TurnOff();
    }

}

