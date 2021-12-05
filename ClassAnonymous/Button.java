/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassAnonymous;

/**
 *
 * @author kazuma
 */
public class Button {
    public Clickdong action;

    public void setAction(Clickdong action) {
        this.action = action;
    }
    
    void doClick(){
        action.sedangClick();
    }
}
