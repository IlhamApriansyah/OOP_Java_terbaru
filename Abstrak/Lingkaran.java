/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstrak;

/**
 *
 * @author kazuma
 */
public class Lingkaran extends Bentuk {
    
    private float radius;
    
    public Lingkaran(float radius){
        this.radius = radius;
    }
    
    @Override
    float getArea(){
        return (float) (Math.PI * radius * radius);
    }
}
