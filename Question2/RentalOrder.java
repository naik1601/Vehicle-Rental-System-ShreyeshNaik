package Question2;

public class RentalOrder {
    private int totalCost;
    private Customer customer;
    private Vehicle vehicle;
    private int rentalLength;
    

    // Constructor with specified rental length
    public RentalOrder(Customer customer, Vehicle vehicle, int rentalLength) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.rentalLength = rentalLength;
        this.totalCost = calculateTotalCost();  
    }
    //Constructor withh default length 1

    public RentalOrder(Customer customer, Vehicle vehicle) {
        this(customer, vehicle, 1);
    }  
    //Method to calculate the cost
    public int calculateTotalCost() {
        int baseCost = vehicle.getDailyrate() * rentalLength;
        int discount = baseCost * (customer.getDiscountrate() / 100);
        return baseCost - discount;
    }
    //Method to completeOrder
    public void completeOrder() {
        customer.addOrder(this);  
        vehicle.setAvailableForRent(false);  
        
    }
    //ovvering the tostring method to get the information about the fields
   @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rental Order Details:\n");
        sb.append("Customer: ").append(customer.getName()).append("\n");
        sb.append("Vehicle: ").append(vehicle.getMake()).append(" ").append(vehicle.getModel()).append("\n");
        sb.append("Rental Length: ").append(rentalLength).append(" days\n");
        sb.append("Total Cost: $").append(totalCost).append("\n");
        
        return sb.toString(); 
    }
}
