/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author kazuma
 */
public class Intel implements Komputer {
    
    private boolean isTurnOn;
    
    @Override
    public void TurnOn(){
       isTurnOn = true;
       System.out.println("Komputer menyala");
       System.out.println("     INTEL       ");
    }

    @Override
    public void TurnOff() {
        isTurnOn = false;
       System.out.println("Komputer mati");
       System.out.println("     INTEL       ");
    }

}
