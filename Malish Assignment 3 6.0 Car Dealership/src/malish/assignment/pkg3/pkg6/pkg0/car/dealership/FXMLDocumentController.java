/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package malish.assignment.pkg3.pkg6.pkg0.car.dealership;

import java.awt.Color;
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
import javafx.util.Callback;

/**
 *
 * @author RedPanda13
 */
public class FXMLDocumentController implements Initializable {

    private Label label;

    // use of ObservableList for easy showing in FXML
    private final ObservableList<Vehicle> vehicles = FXCollections.observableArrayList();

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
    ObservableList<String> carListDoors = FXCollections.observableArrayList(
            "1", "2", "3", "4", "5", "6");
    @FXML
    private ComboBox<String> carCapacityInput;
    ObservableList<String> carListCapacity = FXCollections.observableArrayList(
            "1", "2", "3", "4", "5", "6", "7");

    private Button updateInput;
    @FXML
    private ComboBox<?> carColorInput;
    @FXML
    public  ComboBox<Vehicle> carRemoveSelect;
    @FXML
    private Button viewSelectedCar;
    @FXML
    private ComboBox<?> truckMakeInput;
    @FXML
    private ComboBox<?> truckModelInput;
    @FXML
    private TextField truckPricePurchasedInput;
    @FXML
    private ComboBox<?> truckColorInput;
    @FXML
    private Button truckUpdateInput;
    @FXML
    private Label carInventory;
    @FXML
    private Label truckInventory;
    @FXML
    private Label motorcycleInventory;
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
    private ComboBox<?> motoColorInput;
    @FXML
    private Button motoUpdateInput;
    @FXML
    private TextField motoPricePurchasedInput;
    @FXML
    private ComboBox<?> motoModelInput;
    @FXML
    private ComboBox<?> motoMakeInput;
    @FXML
    private Label colorDisplay1;
    @FXML
    private Label towingDisplay;
    @FXML
    private ComboBox<?> truckDoorsInput;
    @FXML
    private ComboBox<?> truckCapacityInput;
    @FXML
    private ComboBox<?> motoDoorsInput;
    @FXML
    private ComboBox<?> motoCapacityInput;
    @FXML
    private TextField askingPriceInput;
    @FXML
    private Button vehicleRemoveBTN;

    
    

    
    
//CAR BLOCK***************************************************************************************************************************    
    @Override
//    @FXML
    public void initialize(URL url, ResourceBundle rb) {
        carMakeInput.setItems(carListMake);
        carModelInput.setItems(carListModel);
        carDoorsInput.setItems(carListDoors);
        carCapacityInput.setItems(carListCapacity);

	// set the list to the combo box, it will be kept updated automatically
        carRemoveSelect.setItems(vehicles);

        // adjust the appearance of the combo box
        Callback<ListView<Vehicle>, ListCell<Vehicle>> cellfactory = (ListView<Vehicle> param) -> new ListCell<Vehicle>() {
            @Override
            protected void updateItem(Vehicle vehicle, boolean empty) {
                super.updateItem(vehicle, empty);

                if (vehicle == null || empty) {
                    setGraphic(null);
                } else {
                    // modify this line to see the combo box entries as wanted
                    setText(vehicle.getMake() + " " + vehicle.getModel());
                }
            }
        };

        // call the cellfactory settings just modified on the combo box
        carRemoveSelect.setButtonCell(cellfactory.call(null));
        carRemoveSelect.setCellFactory(cellfactory);
    }

    @FXML
    public void carUpdate(ActionEvent event) {
        // read all attributes from the input components
        String maker = carMakeInput.getSelectionModel().getSelectedItem();
        String model = carModelInput.getSelectionModel().getSelectedItem();
        String doors = carDoorsInput.getSelectionModel().getSelectedItem();
        String passengers = carCapacityInput.getSelectionModel().getSelectedItem();
        Color color = Color.RED;
        String text = carPricePurchasedInput.getText();
        double purchasePrice = text.isEmpty() ? 0.0 : Double.parseDouble(text);
       
        // create new car and add it to the list       
       
        vehicles.add(new Car(maker, model, color, doors, passengers, purchasePrice));

        // reset the input components
        carMakeInput.getSelectionModel().selectFirst();
        carModelInput.getSelectionModel().selectFirst();
        carDoorsInput.getSelectionModel().selectFirst();
        carCapacityInput.getSelectionModel().selectFirst();
        carPricePurchasedInput.setText("");
    }

    @FXML
    public void retrieveVehicle(ActionEvent event) {
        // check if anything is selected
        if (carRemoveSelect.getSelectionModel().getSelectedIndex() != -1) {
            // get the vehicle selected by the id from the combo box
            Vehicle vehicle = vehicles.get(carRemoveSelect.getSelectionModel().getSelectedIndex());

            // check if the vehicle is a car
            if (vehicle instanceof Car) {
                // update the input components to show maker and model
                makeDisplay.setText(vehicle.getMake());
                modelDisplay.setText(vehicle.getModel());
                doorsDisplay.setText(vehicle.getDoors());
                capacityDisplay.setText(vehicle.getPassengers());
                pricePurchasedDisplay.setText(Double.toString(vehicle.getPurchasePrice()));
                
                // do the same for all the other attributes
            }
            
            // if nothing is selected
        } else {
            System.out.println("Nothing selected");
        }
    }
    
    public void vehicleRemoveBTN(java.awt.event.ActionEvent evt){

        
    }
    
    
//**********************************************************************************************************************************

   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @FXML
    private void vehicleRemoveBTN(ActionEvent event) {
        //removes vehicle from inventory
        
        carRemoveSelect.getItems().remove(0);
    }
}