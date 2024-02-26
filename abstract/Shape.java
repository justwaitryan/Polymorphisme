/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstrak;

/**
 *
 * @author User
 */
public abstract class Shape {
    String color;
    
    void setColor(String color){
        this.color = color;
    }
    
    String getColor(){
        return this.color;
    }
    
    abstract float getArea();
}
