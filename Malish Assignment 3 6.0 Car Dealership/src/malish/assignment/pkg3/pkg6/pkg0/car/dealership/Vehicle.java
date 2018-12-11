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
public class Vehicle
{

    private String make;
    private String model;
    private String doors;
    private String passengers;
    private String color;
    private double purchasePrice;
    private double customOffer;
    private int vehicleCount;
    private String type = "";
    //private boolean customerOffer = false;

    
    
    //construcor
    public Vehicle(String type, String make, String model, String color, String doors, String passengers, double purchasePrice)
    
    {
     this.vehicleCount++;
     //refers to variables in class
     this.model = model;
     this.make = make;
     this.doors = doors;
     this.passengers = passengers;
     this.color = color;
     this.purchasePrice = purchasePrice;
     this.type = type;
     
     
    }
    //sets up for GUI to grab information
    public String getMake(){return this.make;}
    public void setMake(String make){this.make = make;}
    
    public String getModel(){return this.model;}
    public void setModel(String model){this.model = model;}
        
    public String getDoors(){return this.doors;}
    public void setDoors(String doors){this.doors = doors;}    
    
    public String getPassengers(){return this.passengers;}
    public void setPassengers(String passengers){this.passengers = passengers;}
    
    public String getColor(){return this.color;}
    public void setColor(String color){this.color = color;}
    
    
    public double getPurchasePrice(){return this.purchasePrice;}
    public void setPurchasePrice(double purchasePrice){this.purchasePrice = purchasePrice;}    
    
    public Integer getvehicleCount(){return this.vehicleCount;}
    
    public String getType(){return this.type;}
    public void setType(String s){this.type = s;}
    
        
    //checks the deal agains the cars for sell
    


    //Removes Vehicles from ArrayList
    public void remove()
    {
        
        
    }
    
    
    
    //Determins how much the sailsmen make
    public double commission()
    {
      return 0;
    
    }
        
    }
    









