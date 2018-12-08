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
public class Car extends Vehicle
{

    private static int carCount;
    private String passengers;
    private String doors;
    //private String carType;
    

 
    //construcor
    public Car(String make, String model, Color color, String doors, String passengers, double purchasePrice)
    {

              super(make, model, color, doors, passengers, purchasePrice);
      //incraments count
      carCount++;
             
    }
    
    //Override for Commission (car)
    
    
    //gets and sets Passenger and door variables
  
    public void setPassengers(String passengers){this.passengers = passengers;}
    public String getPassengers(){return this.passengers;}  

    public void setDoors(String doors){this.doors = doors;}
    public String getDoors(){return this.doors;}
    
    
    private String type = "";
    public String getType(){return this.type;}
    public void setType(String s){this.type = s;}
    
    
    
    
    

    









}
