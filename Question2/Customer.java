package Question2;
import java.util.ArrayList;
import java.util.List;
//Created a abstract class Customer which implement the Reportable interface
public abstract class Customer implements Reportable {
    //created a instance variable
    private int id;
    private String name;
    private int discountrate;
    //rentalOrder is of type List of Rentalorder class 
    private List<RentalOrder>rentalOrders;
    //Made generatereport method of repotable interface because we dont to implement it
    public abstract String generatereport();
    //Created a Customer Constructor
    public Customer(int id,String name,int discountrate){
        this.id=id;
        this.name=name;
        this.discountrate=discountrate;
        this.rentalOrders=new ArrayList<>();

    }
    //Created public method to addOrder which takes RentalOrder  as a parameter
    public void addOrder(RentalOrder order) {
        this.rentalOrders.add(order);
        
    }
    //Created public method to removeOrder which takes RentalOrder  as a parameter

    public void removeOrder(RentalOrder order)
    {
        this.rentalOrders.remove(order);
    }
    //Getter method to get OrderHistory
    public List<RentalOrder> getOrderHistory() {
        return rentalOrders;
    }
    //Setter method to set OrderHistory
    public void setRentalOrders(List<RentalOrder> rentalOrders) {
        this.rentalOrders = rentalOrders;
    }

    //Getter method to get id
    public int getid(){
        return this.id;
    }
 //Setter method to set id
    public void setId(int id) {
        this.id = id;
    }
    //getter method to get discountrate
    public int getDiscountrate() {
        return discountrate;
    }
    //setter method to set discountrate
    public void setDiscountrate(int discountrate) {
        this.discountrate = discountrate;
    }
    //setter method to set the name
    public void setName(String name) {
        this.name = name;
    }
    //getter method to get name
    public String getName() {
        return name;
    }
    

}
