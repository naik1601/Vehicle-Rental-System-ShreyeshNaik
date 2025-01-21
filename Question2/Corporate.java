package Question2;

//created a Corporate class which inherits Customer
public class Corporate extends Customer{
    //created instance variable
    private String Country;
    private String taxID;
    //created a constructor
    public Corporate(int id, String name, int discountrate,String Country,String taxID){
        //super() is used to call super class constructor
        super( id, name, discountrate);
        this.Country=Country;
        this.taxID=taxID;  
     }
//This method is of interface since we are implementing interface in customer class so we have to override otherwise the compiler will give error 
    @Override
    public String generatereport() {
        //string builder is use to format the string
        StringBuilder generatereport = new StringBuilder();
        generatereport.append("Corporate Customer Report\n");
        generatereport.append("ID: ").append(getid()).append("\n");
        generatereport.append("Name: ").append(getName()).append("\n");
        generatereport.append("Discount Rate: ").append(getDiscountrate()).append("%\n");
        generatereport.append("Country: ").append(Country).append("\n");
        generatereport.append("Tax ID: ").append(taxID).append("\n\n");

        // Add order history
        generatereport.append("Order History:\n");
        for (RentalOrder order : getOrderHistory()) {
            generatereport.append(order).append("\n");
        }
        return generatereport.toString();
    }
    
}
