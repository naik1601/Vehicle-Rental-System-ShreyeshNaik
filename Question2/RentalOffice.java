package Question2;
import java.util.ArrayList;
import java.util.List;
//Created a rental class which implements the interface Reportable
public class RentalOffice implements Reportable {
private int officeID;
private String locationZip;
private List<Inventory>inventories;
private List<RentalOrder>rentalOrders;

//created rental office constructor
public RentalOffice(int officeID, String locationZip) {
    this.officeID = officeID;
    this.locationZip = locationZip;
    this.inventories = new ArrayList<>();
    this.rentalOrders = new ArrayList<>();
}
   

//Created a addInventory method to add inventory also it check that if the type is duplicated or no

public boolean addInventory(Inventory inventory) {
    for (Inventory inv : inventories) {
        if (inv.getType() == inventory.getType()) {
            System.out.println("Inventory of type " + inv.getType() + " already exists.");
            return false; 
        }
    }
    inventories.add(inventory);
    System.out.println("Inventory added: " + inventory.getType());
    return true;
}

// Method to remove an inventory
public boolean removeInventory(Inventory inventory) {
    if (inventories.remove(inventory)) {
        System.out.println("Inventory removed: " + inventory.getType());
        return true;
    } else {
        System.out.println("Inventory not found.");
        return false;
    }
}
//overriding the reportable interface class
    @Override
    public String generatereport() {
        //stringbuilder to format the string
        StringBuilder generatereport = new StringBuilder();
        generatereport.append("Rental Office Report\n");
        generatereport.append("Office ID: ").append(officeID).append("\n");
        generatereport.append("Location ZIP: ").append(locationZip).append("\n\n");
        generatereport.append("Inventories:\n");
        for (Inventory inventory : inventories) {
            generatereport.append("Inventory Type: ").append(inventory.getType()).append("\n");
            generatereport.append("Vehicles:\n");
            for (Vehicle vehicle : inventory.getVehicles()) {
                generatereport.append(" VehicleID: ").append(vehicle.getvehicleID()).append("\n")
                .append("Make:").append(vehicle.getMake()).append("\n")
                .append("Model:").append(vehicle.getModel()).append("\n")
                .append("Year:").append(vehicle.getYear()).append("\n")
                .append("Mileage:").append(vehicle.getMileage()).append("\n")
                .append("VehicleType:").append(vehicle.getType()).append("\n")
                .append("DailyRate:").append(vehicle.getDailyrate()).append("\n")
                     ;
            }
        }
        generatereport.append("\nOrder History:\n");
        for (RentalOrder order : rentalOrders) {
            generatereport.append(order).append("\n");
        }

        return generatereport.toString();
    };
    //created method to add Rentalorder
    public void addOrder(RentalOrder order) {
        this.rentalOrders.add(order);
        
    }

}