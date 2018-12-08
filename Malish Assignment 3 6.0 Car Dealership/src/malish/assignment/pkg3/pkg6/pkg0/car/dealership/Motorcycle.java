/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package malish.assignment.pkg3.pkg6.pkg0.car.dealership;
import java.awt.Color;
/**
 *
 * @author RedPanda13
 */
public class Motorcycle extends Vehicle
{

    private static int motoCount;
    private double motoWeight;
    private String motoType;

    //construcor
    public Motorcycle(String make, String model, String color, String doors, String passengers, double purchasePrice)
    {

              super(make, model, color, doors, passengers, purchasePrice);
              
              motoCount++;

    }

    private void setMotoWeight(double motoWeight){this.motoWeight = motoWeight;}
    private double getMotoWeight(){return this.motoWeight;}
    
    private void setMotoType(String motoType){this.motoType = motoType;}
    private String getMotoType(){return this.motoType;} 
    private String type = "";
    public String getType(){return this.type;}
    public void setType(String s){this.type = s;}
    

    
    //Override for Commission (Motorcycle)
 
    
}

