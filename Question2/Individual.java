package Question2;
//Created a Individual class which inherits Customer
public class Individual extends Customer {
//Created Instance variable
    private int age;
    private String state;
    private String zip;

//Created Individual COnstructor
    public Individual(int id, String name, int discountrate,int age,String state,String zip) {
        super(id, name, discountrate);
        this.age=age;
        this.state=state;
        this.zip=zip;
        
    }
//Since Customer class implement Reportable interable we have to override its method
    @Override
    public String generatereport() {
        StringBuilder generatereport = new StringBuilder();
        generatereport.append("Individual Customer Report\n");
        generatereport.append("ID: ").append(getid()).append("\n");
        generatereport.append("Name: ").append(getName()).append("\n");
        generatereport.append("Discount Rate: ").append(getDiscountrate()).append("%\n");
        generatereport.append("Age: ").append(this.age).append("\n");
        generatereport.append("State: ").append(this.state).append("\n");
        generatereport.append("ZIP: ").append(this.zip).append("\n\n");
        generatereport.append("Order History:\n");
        for (RentalOrder order : getOrderHistory()) {
            generatereport.append(order).append("\n");
        }
        return generatereport.toString();
    }
    }

   


    

   
    

