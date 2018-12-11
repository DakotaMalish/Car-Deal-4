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
public class Truck extends Vehicle
{

    //private static int truckAskingPrice;
    private double truckWeight;
    private double truckLength;
    private int truckPassengers;

    
    
    
    //construcor
    public Truck(String type, String make, String model, String color, String doors, String passengers, double purchasePrice, double truckWeight, double truckLength)
    {

              super( type, make, model, color, doors, passengers, purchasePrice);
              
    this.truckLength = truckLength;
    this.truckWeight = truckWeight;

        
    }

    public void setTruckWeight(double truckWeight){this.truckWeight = truckWeight;}
    public double getTruckWeight(){return this.truckWeight;}
    
    public void setTruckLength(double towingLength){this.truckLength = towingLength;}
    public double getTruckLength(){return this.truckLength;}
    
    public void setTruckPassengers(int truckPassengers){this.truckPassengers = truckPassengers;}
    public int getTruckPassengers(){return this.truckPassengers;}
    
//    private String type = "";
//    public String getType(){return this.type;}
//    public void setType(String s){this.type = s;}
    

    //Override for Commission (truck)
  






}
