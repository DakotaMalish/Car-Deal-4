/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package malish.assignment.pkg3.pkg6.pkg0.car.dealership;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.shape.Rectangle;
import javafx.util.Callback;
import javax.swing.JOptionPane;

/**
 *
 * @author RedPanda13
 */
public class FXMLDocumentController implements Initializable {
        int count = 0;

    private Label label;

    // use of ObservableList for easy showing in FXML
    private final ObservableList<Vehicle> vehicles = FXCollections.observableArrayList();
    
   // private final ObservableList<Truck> trucks = FXCollections.observableArrayList();

    public double tempComPrice = 0;
    
    
//CAR BLOCK***************************************************************************************************************************    
    @FXML
    private ComboBox<String> carMakeInput;
    private final ObservableList<String> carListMake = FXCollections.observableArrayList(
            "Dodge", "Ford", "Honda", "Toyota");

    @FXML
    private ComboBox<String> carModelInput;
    private final ObservableList<String> carListModel = FXCollections.observableArrayList(
            "Coupe", "Hatchback", "Sedan", "Convertible", "Sports Utility", "Crossover");

    @FXML
    private ComboBox<String> carDoorsInput;
    private final ObservableList<String> carListDoors = FXCollections.observableArrayList(
            "1", "2", "3", "4", "5", "6");
    @FXML
    private ComboBox<String> carCapacityInput;
    private final ObservableList<String> carListCapacity = FXCollections.observableArrayList(
            "1", "2", "3", "4", "5", "6", "7");
    
    @FXML
    private ComboBox<String> carColorInput;
    private final ObservableList<String> carListColor = FXCollections.observableArrayList(
            "Red", "Blue", "Black", "Green", "Silver", "Gray", "Brown", "Dark Red");
//**************************************************************************************************************************************    
//Truck Block***************************************************************************************************************************         
    @FXML
    private ComboBox<String> truckMakeInput;
    private final ObservableList<String> truckListMake = FXCollections.observableArrayList(
            "Dodge", "Ford", "Honda", "Toyota");

    @FXML
    private ComboBox<String> truckModelInput;
    private final ObservableList<String> truckListModel = FXCollections.observableArrayList(
            "Pickup", "Dually", "Extended Cab", "Dual Cab", "Panel", "Tow", "Flatbed");

    @FXML
    private ComboBox<String> truckDoorsInput;
    private final ObservableList<String> truckListDoors = FXCollections.observableArrayList(
            "1", "2", "3", "4");
  
    @FXML
    private ComboBox<String> truckCapacityInput;
    private final ObservableList<String> truckListCapacity = FXCollections.observableArrayList(
            "1", "2", "3", "4");
    
    @FXML
    private ComboBox<String> truckColorInput;
    private final ObservableList<String> truckListColor = FXCollections.observableArrayList(
            "Red", "Blue", "Black", "Green", "Silver", "Gray", "Brown", "Dark Red");
//**************************************************************************************************************************************
//Motorcycle Block**********************************************************************************************************************
    @FXML
    private ComboBox<String> motoCapacityInput;
    private final ObservableList<String> motoListCapacity = FXCollections.observableArrayList(
            "1", "2");
    
    
    @FXML
    private ComboBox<String> motoModelInput;
    private final ObservableList<String> motoListModel = FXCollections.observableArrayList(
            "Touring Bike", "Chopper", "Cruiser", "Power Cruiser", "Dirt Bike", "Enduro Bike", "Motocross Bike", "Scooter", "Sport Bike");
    
    
    @FXML
    private ComboBox<String> motoMakeInput;
    private final ObservableList<String> motoListMake = FXCollections.observableArrayList(
            "Dodge", "Ford", "Honda", "Toyota", "Yamaha");
    
    
    @FXML
    private ComboBox<String> motoTypeInput;
    private final ObservableList<String> motoListType = FXCollections.observableArrayList(
            "Single", "Parallel-Twin", "Inline-Three", "Inline-Four", "V-Twin (trans)", "V-Twin (long)", "Flat-Twin (boxer)", "L-Twin");
    
    
    @FXML
    private ComboBox<String> motoColorInput;
    private final ObservableList<String> motoListColor = FXCollections.observableArrayList(
            "Red", "Blue", "Black", "Green", "Silver", "Gray", "Brown", "Dark Red");
    
//**************************************************************************************************************************************   
    
    
    
        @FXML
    private TextField truckPricePurchasedInput;
    @FXML
    private Button truckUpdateInput;
    @FXML
    public  ComboBox<Vehicle> vehicleSelectCombo;
    @FXML
    private TextField carPricePurchasedInput;
    @FXML
    private Button carUpdateInput;
    @FXML
    private Label doorsDisplay;
    @FXML
    private Label capacityDisplay;
    @FXML
    private Label colorDisplay;
    @FXML
    private Label pricePurchasedDisplay;
    @FXML
    private Label commissionDisplay;
    @FXML
    private Label makeDisplay;
    @FXML
    private Label modelDisplay;
    @FXML
    private Button motoUpdateInput;
    @FXML
    private TextField motoPricePurchasedInput;
    @FXML
    private Button vehicleRemoveBTN;
    @FXML
    private Label inventoryCount;
    @FXML
    private Label truckTowingCapacityDisplay;
    @FXML
    private TextField truckTowingCapacity;
    @FXML
    private TextField truckBedLength;
    @FXML
    private Label TruckBedDisplay;
    @FXML
    private TextField motoWeightInput;
    @FXML
    private Label motoWeightDisplay;
    @FXML
    private Label motoTypeDisplay;
    @FXML
    private Rectangle sellVehicleBTN;
    @FXML
    private TextField comPriceInput;
    @FXML
    private Button vehiclesSellBTN;

    
    

    
    
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //cars
        carMakeInput.setItems(carListMake);
        carModelInput.setItems(carListModel);
        carDoorsInput.setItems(carListDoors);
        carCapacityInput.setItems(carListCapacity);
        carColorInput.setItems(carListColor);
        carUpdateInput.setDisable(true);
        
        //Trucks
        truckMakeInput.setItems(truckListMake);
        truckModelInput.setItems(truckListModel);
        truckDoorsInput.setItems(truckListDoors);
        truckCapacityInput.setItems(truckListCapacity);
        truckColorInput.setItems(truckListColor);
        truckUpdateInput.setDisable(true);
        
        //Motorcycle
        motoMakeInput.setItems(motoListMake);
        motoModelInput.setItems(motoListModel);
        motoTypeInput.setItems(motoListType);
        motoCapacityInput.setItems(motoListCapacity);
        motoColorInput.setItems(motoListColor);
        motoUpdateInput.setDisable(true);
         
        
 //CAR BLOCK***************************************************************************************************************************         
	// set the list to the combo box, it will be kept updated automatically
        vehicleSelectCombo.setItems(vehicles);

        // adjust the appearance of the combo box
        Callback<ListView<Vehicle>, ListCell<Vehicle>> cellfactory = (ListView<Vehicle> param) -> new ListCell<Vehicle>() {
            @Override
            protected void updateItem(Vehicle vehicle, boolean empty) {
                super.updateItem(vehicle, empty);

                if (vehicle == null || empty) {
                    setGraphic(null);
                } else {
                    // modify this line to see the combo box entries as wanted
                    setText(vehicle.getType() + " " + vehicle.getModel() + " " + vehicle.getMake());
                }
            }
        };

        // call the cellfactory settings just modified on the combo box
        vehicleSelectCombo.setButtonCell(cellfactory.call(null));
        vehicleSelectCombo.setCellFactory(cellfactory);
    }

    @FXML
    public void carUpdate(ActionEvent event) {
        // read all attributes from the input components
        String maker = carMakeInput.getSelectionModel().getSelectedItem();
        String model = carModelInput.getSelectionModel().getSelectedItem();
        String doors = carDoorsInput.getSelectionModel().getSelectedItem();
        String passengers = carCapacityInput.getSelectionModel().getSelectedItem();
        String color = carColorInput.getSelectionModel().getSelectedItem();
        String type = "Car";
    
    try{    
        String text = carPricePurchasedInput.getText();
        double purchasePrice = text.isEmpty() ? 0.0 : Double.parseDouble(text);
        // create new car and add it to the list 
        vehicles.add(new Car(type, maker, model, color, doors, passengers, purchasePrice));
        
        //increases inventory by 1
        count++;
        inventoryCount.setText(Integer.toString(count));

        
    }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null,
                            " Pealse only enter A Numeric Price.");
        carPricePurchasedInput.setText("");
            }    
    
        // reset the input components
        carMakeInput.getSelectionModel().selectFirst();
        carModelInput.getSelectionModel().selectFirst();
        carDoorsInput.getSelectionModel().selectFirst();
        carCapacityInput.getSelectionModel().selectFirst();
        carColorInput.getSelectionModel().selectFirst();
        carPricePurchasedInput.setText("");
        carUpdateInput.setDisable(true);
    }
    // enables button
    @FXML
    public void enableCarSubmit (ActionEvent event){carUpdateInput.setDisable(false);}

   
    
//**********************************************************************************************************************************


//TRUCK BLOCK***********************************************************************************************************************
    @FXML
    public void truckUpdate(ActionEvent event) {
        // read all attributes from the input components
        String maker = truckMakeInput.getSelectionModel().getSelectedItem();
        String model = truckModelInput.getSelectionModel().getSelectedItem();
        String doors = truckDoorsInput.getSelectionModel().getSelectedItem();
        String passengers = truckCapacityInput.getSelectionModel().getSelectedItem();
        String color = truckColorInput.getSelectionModel().getSelectedItem();
        String type = "Truck";
    try{    

        String text = truckPricePurchasedInput.getText();
        double purchasePrice = text.isEmpty() ? 0.0 : Double.parseDouble(text);
        
        String box = truckTowingCapacity.getText();
        double truckWeight = box.isEmpty() ? 0.0 : Double.parseDouble(box);
        
        text = truckBedLength.getText();
        double truckLength = text.isEmpty() ? 0.0 : Double.parseDouble(text);
        

        

        // create new truck and add it to the list 
        vehicles.add(new Truck(type, maker, model, color, doors, passengers, purchasePrice, truckWeight, truckLength));
        //increases inventory by 1
        count++;
        inventoryCount.setText(Integer.toString(count));

        
    }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null,
                            " Pealse only enter A Numeric Price.");
        carPricePurchasedInput.setText("");
        truckTowingCapacity.setText("");
        truckBedLength.setText("");
            }    
    
        // reset the input components
        truckMakeInput.getSelectionModel().selectFirst();
        truckModelInput.getSelectionModel().selectFirst();
        truckDoorsInput.getSelectionModel().selectFirst();
        truckCapacityInput.getSelectionModel().selectFirst();
        truckColorInput.getSelectionModel().selectFirst();
        truckPricePurchasedInput.setText("");
        truckTowingCapacity.setText("");
        truckBedLength.setText("");
        truckUpdateInput.setDisable(true);
    }
    // enables button
        @FXML
    public void enableTruckSubmit (ActionEvent event){truckUpdateInput.setDisable(false);}

   
   
    
//**********************************************************************************************************************************

//Motorcycle Block******************************************************************************************************************

    @FXML
    public void motoUpdate(ActionEvent event) {
        // read all attributes from the input components
        String maker = motoMakeInput.getSelectionModel().getSelectedItem();
        String model = motoModelInput.getSelectionModel().getSelectedItem();
        String motoType = motoTypeInput.getSelectionModel().getSelectedItem();
        String passengers = motoCapacityInput.getSelectionModel().getSelectedItem();
        String color = motoColorInput.getSelectionModel().getSelectedItem();
        String type = "Motorcycle";
        String doors = null;
    try{    

        String text = motoPricePurchasedInput.getText();
        double purchasePrice = text.isEmpty() ? 0.0 : Double.parseDouble(text);
        
        String box = motoWeightInput.getText();
        double motoWeight = box.isEmpty() ? 0.0 : Double.parseDouble(box);

        
        // create new truck and add it to the list 
        vehicles.add(new Motorcycle(type, maker, model, color, doors, passengers, purchasePrice, motoWeight, motoType));
        //increases inventory by 1
        count++;
        inventoryCount.setText(Integer.toString(count));

        
    }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null,
                            " Pealse only enter A Numeric Price.");
        carPricePurchasedInput.setText("");

            }    
    
        // reset the input components
        motoMakeInput.getSelectionModel().selectFirst();
        motoModelInput.getSelectionModel().selectFirst();
        motoTypeInput.getSelectionModel().selectFirst();
        motoCapacityInput.getSelectionModel().selectFirst();
        motoColorInput.getSelectionModel().selectFirst();
        motoPricePurchasedInput.setText("");
        motoWeightInput.setText("");
        motoUpdateInput.setDisable(true);
        
    }
    // enables button
    
    @FXML
    public void enableMotorcycleSumbit (ActionEvent event){motoUpdateInput.setDisable(false);}
   

//**********************************************************************************************************************************

    @FXML
    public void retrieveVehicle(ActionEvent event) {
        // check if anything is selected
        if (vehicleSelectCombo.getSelectionModel().getSelectedIndex() != -1) {
            // get the vehicle selected by the id from the combo box
            Vehicle vehicle = vehicles.get(vehicleSelectCombo.getSelectionModel().getSelectedIndex());
            
            // check if the vehicle is a car
            if (vehicle instanceof Car) {
                // update the input components to show maker and model
                makeDisplay.setText(vehicle.getMake());
                modelDisplay.setText(vehicle.getModel());
                doorsDisplay.setText(vehicle.getDoors());
                capacityDisplay.setText(vehicle.getPassengers());
                colorDisplay.setText(vehicle.getColor());
                pricePurchasedDisplay.setText(Double.toString(vehicle.getPurchasePrice()));
                truckTowingCapacityDisplay.setText(" ");
                TruckBedDisplay.setText(" ");
                motoWeightDisplay.setText(" ");
                motoTypeDisplay.setText(" ");
               // do the same for all the other attributes
            }
            else if(vehicle instanceof Truck){
                Truck tempTruck = (Truck) vehicles.get(vehicleSelectCombo.getSelectionModel().getSelectedIndex());
                
                makeDisplay.setText(tempTruck.getMake());
                modelDisplay.setText(tempTruck.getModel());
                doorsDisplay.setText(tempTruck.getDoors());
                capacityDisplay.setText(tempTruck.getPassengers());
                colorDisplay.setText(tempTruck.getColor());
                pricePurchasedDisplay.setText(Double.toString(tempTruck.getPurchasePrice()));
                truckTowingCapacityDisplay.setText(Double.toString(tempTruck.getTruckWeight()));
                TruckBedDisplay.setText(Double.toString(tempTruck.getTruckLength()));
                motoWeightDisplay.setText(" ");
                motoTypeDisplay.setText(" ");
            }
            else if(vehicle instanceof Motorcycle){
                Motorcycle tempMotorcycle = (Motorcycle) vehicles.get(vehicleSelectCombo.getSelectionModel().getSelectedIndex());
                
                makeDisplay.setText(tempMotorcycle.getMake());
                modelDisplay.setText(tempMotorcycle.getModel());
                doorsDisplay.setText(tempMotorcycle.getDoors());
                capacityDisplay.setText(tempMotorcycle.getPassengers());
                colorDisplay.setText(tempMotorcycle.getColor());
                pricePurchasedDisplay.setText(Double.toString(tempMotorcycle.getPurchasePrice()));
                motoWeightDisplay.setText(Double.toString(tempMotorcycle.getMotoWeight()));
                motoTypeDisplay.setText(tempMotorcycle.getMotoType());
                truckTowingCapacityDisplay.setText(" ");
                TruckBedDisplay.setText(" ");
            }
            // if nothing is selected
        } else {                    
                    JOptionPane.showMessageDialog(null,
                            " Nothing Selected!");
            
        }
    }

    
    @FXML
    private void vehicleRemoveBTN(ActionEvent event) {
        //removes vehicle from inventory
                     

               if (vehicleSelectCombo.getSelectionModel().getSelectedIndex() != -1) {                       
                    
                   vehicleSelectCombo.getItems().remove(vehicleSelectCombo.getSelectionModel().getSelectedIndex());
                    count--;
                    inventoryCount.setText(Integer.toString(count));
                } else {

        
                }
   
            }
               
                  
        @FXML
    private void vehiclesSellBTN(ActionEvent event){           
    if (vehicleSelectCombo.getSelectionModel().getSelectedIndex() != -1) {
            // get the vehicle selected by the id from the combo box
            Vehicle vehicle = vehicles.get(vehicleSelectCombo.getSelectionModel().getSelectedIndex());
        try{
            // check if the vehicle is a car
            if (vehicle instanceof Car) {

                if(Double.parseDouble(comPriceInput.getText()) >= vehicle.getPurchasePrice()){
                    
                   tempComPrice = Double.parseDouble(comPriceInput.getText()) * 0.05;
                   
                   commissionDisplay.setText(Double.toString(tempComPrice));
                    if (vehicleSelectCombo.getSelectionModel().getSelectedIndex() != -1) {                       
                    
                   vehicleSelectCombo.getItems().remove(vehicleSelectCombo.getSelectionModel().getSelectedIndex());
                    count--;
                    inventoryCount.setText(Integer.toString(count));
                    } else {
                    // put joption here
        
                }
                }else{
                    JOptionPane.showMessageDialog(null,
                            " The asking price is to low");
  
                }
            }
            else if(vehicle instanceof Truck){
                Truck tempTruck = (Truck) vehicles.get(vehicleSelectCombo.getSelectionModel().getSelectedIndex());

                
                if(Double.parseDouble(comPriceInput.getText()) >= tempTruck.getPurchasePrice()){
                   
                    tempComPrice = Double.parseDouble(comPriceInput.getText()) * 0.15;
                    commissionDisplay.setText(Double.toString(tempComPrice));
                    
                    if (vehicleSelectCombo.getSelectionModel().getSelectedIndex() != -1) {                       
                    
                    vehicleSelectCombo.getItems().remove(vehicleSelectCombo.getSelectionModel().getSelectedIndex());
                    count--;
                    inventoryCount.setText(Integer.toString(count));
                } else {
                    // put joption here
        
                }
                }else{
                    JOptionPane.showMessageDialog(null,
                            " The asking price is to low");
  
                }
            }
            else if(vehicle instanceof Motorcycle){
                Motorcycle tempMotorcycle = (Motorcycle) vehicles.get(vehicleSelectCombo.getSelectionModel().getSelectedIndex());
                
                if(Double.parseDouble(comPriceInput.getText()) >= tempMotorcycle.getPurchasePrice()){
                   
                    tempComPrice = Double.parseDouble(comPriceInput.getText()) * 0.20;
                    commissionDisplay.setText(Double.toString(tempComPrice));
                    if (vehicleSelectCombo.getSelectionModel().getSelectedIndex() != -1) {                       
                    
                    vehicleSelectCombo.getItems().remove(vehicleSelectCombo.getSelectionModel().getSelectedIndex());
                    count--;
                    inventoryCount.setText(Integer.toString(count));
                    
                } else {
                    // put joption here
        
                }
       
                }else{
                    JOptionPane.showMessageDialog(null,
                            " The asking price is to low");
  
                }
            
            }
                }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null,
                            " Pealse only enter A Numeric Price.");
        
        comPriceInput.setText("");

            }
            // if nothing is selected
        } else {
            System.out.println("Nothing selected");
        }      
        }         
        }
        
