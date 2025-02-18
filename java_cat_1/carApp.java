public class carApp extends Vehicle {
    
    private String fuelType;
    
   
   public Car(String brand, String model, int year, String fuelType) {
       
        super(brand, model, year);
        this.fuelType = fuelType;
    }
   
    @Override
    public void displayDetails() {
        
        super.displayDetails();
       
        System.out.println("Fuel Type: " + fuelType);
    }
}