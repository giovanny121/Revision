import java.util.ArrayList;

public abstract class Car implements Vehical{
    private String licensePlate;
    private String vehicalType;
    double rentalPrice;
    private ArrayList<Customer> customers= new ArrayList();

    public Car(String licensePlate,String vehicalType,double rentalPrice){
        this.licensePlate=licensePlate;
        this.vehicalType=vehicalType;
        this.rentalPrice=rentalPrice;

    }
   @Override
    public String getLicensePlate() {
        return licensePlate;
    }
    @Override
  public String getVehicleType(){
       return vehicalType;
  }
  @Override
    public double getRentalPricePerDay(){
        return rentalPrice;
    }
    public ArrayList<Customer> getCustomers(){
        return customers;
    }


}
