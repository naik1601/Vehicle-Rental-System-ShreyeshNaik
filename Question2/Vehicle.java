//created a package that consist various java files
package Question2;

//Created a public vehicle class

public class Vehicle{

    // created a instance variable usign private access modifier
    private int vehicleID;
    private String make;
    private String model;
    private int year;
    private int mileage;
    //created enum of VehicleType
    public enum VehicleType
    {
        CAR,
        SUV,
        TRUCK
    }
    //created a variable of VehicleType
    private VehicleType type;
    private boolean availableForRent = true;
    private int dailyrate;

    //getter method of vehicleID
    public int getvehicleID(){
        return this.vehicleID;
    }
    //setter method of vehicleID
    public void setVehicleID(int vehicleID) {
        this.vehicleID = vehicleID;
    }
    //getter method of make
    public String getMake() {
        return make;
    }
    //setter method of make
    public void setMake(String make) {
        this.make = make;
    }
    //getter method of model
    public String getModel() {
        return model;
    }
    //setter method of model
    public void setModel(String model) {
        this.model = model;
    }
    //getter method of year
    public int getYear() {
        return year;
    }
    //setter method of year
    public void setYear(int year) {
        this.year = year;
    }
     //getter method of mileage
    public int getMileage() {
        return mileage;
    }
    //setter method of mileage
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
    //getter method of type
    public VehicleType getType() {
        return type;
    }
    //setter method of type
    public void setType(VehicleType type) {
        this.type = type;
    }
    //getter method of availableForRent
    public boolean getavailableForRent(){
        return this.availableForRent;
    }
    //setter method of availableForRent
    public void setAvailableForRent(boolean availableForRent) {
        this.availableForRent = availableForRent;
    }
    //getter method of dailyrate
    public int getDailyrate() {
        return dailyrate;
    }
    //setter method of dailyrate
    public void setDailyrate(int dailyrate) {
        this.dailyrate = dailyrate;
    }
    // Created constructor with parameter that helps setting values to the instance variables
    public Vehicle(int vehicleID, String make, String model, int year,int mileage,VehicleType type,int dailyrate){

        this.vehicleID=vehicleID;
        this.make=make;
        this.model=model;
        this.year=year;
        this.mileage=mileage;
        this.type=type;
        this.dailyrate=dailyrate;

    }
     


}