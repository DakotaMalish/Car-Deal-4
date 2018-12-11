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

    //private double motoAskingPrice;
    private double motoWeight;
    private String motoType;

    //construcor
    public Motorcycle(String type, String make, String model, String color, String doors, String passengers, double purchasePrice, double motoWeight, String motoType)
    {

              super( type, make, model, color, doors, passengers, purchasePrice);
              
            
    //this.motoAskingPrice = motoAskingPrice;        
    this.motoType = motoType;
    this.motoWeight = motoWeight;
    }

    public void setMotoWeight(double motoWeight){this.motoWeight = motoWeight;}
    public double getMotoWeight(){return this.motoWeight;}
    
    public void setMotoType(String motoType){this.motoType = motoType;}
    public String getMotoType(){return this.motoType;} 
    
    //public void setmotoAskingPrice
    
//    private String type = "";
//    public String getType(){return this.type;}
//    public void setType(String s){this.type = s;}
//    

    
    //Override for Commission (Motorcycle)
 
    
}

