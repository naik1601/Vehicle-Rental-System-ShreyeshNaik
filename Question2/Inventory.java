package Question2;

import java.util.ArrayList;
import java.util.List;

//importing vehicletype from Vehicle class
import Question2.Vehicle.VehicleType;

public class Inventory {
    private int inventoryID;
    private VehicleType type;
    private List<Vehicle>vehicles;
//Created constructor with parameters 
    public Inventory(int inventoryID, VehicleType type) {
        this.inventoryID = inventoryID;
        this.type = type;
        this.vehicles = new ArrayList<>();  
    }
    //added method addvehicle
    public void addVehicle(Vehicle vehicle){
        if (vehicle.getType() ==this.type) {

            this.vehicles.add(vehicle);
        }

    }

    //added method removevehicle
    public void removeVehicle(Vehicle vehicle){
        if (vehicle.getType() ==this.type) {

            this.vehicles.remove(vehicle);
        }

    }
   // created getterforinventory
    public int getInventoryID() {
        return this.inventoryID;
    }
// created getter for type
    public VehicleType getType() {
        return this.type;
    }
// Created get list of vehicles
    public List<Vehicle> getVehicles() {
        return vehicles;
    }

}
