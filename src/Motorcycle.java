import java.util.ArrayList;

public abstract class Motorcycle implements Vehical{
    private String LicensePlate;
    private String VehicalType;
    double RentalPrice;
    private ArrayList<Customer>customers;

    public Motorcycle(String licensePlate,String VehicalType,double RentalPrice){
        this.LicensePlate=licensePlate;
        this.VehicalType=VehicalType;
        this.RentalPrice=RentalPrice;
        this.customers=new ArrayList<>();
    }

    @Override
    public String getLicensePlate() {
        return LicensePlate;
    }
    @Override
    public String getVehicleType(){
        return VehicalType;
    }
    @Override
    public double getRentalPricePerDay(){
        return RentalPrice;
    }
public ArrayList<Customer> getCustomers(){
        return customers;
}

}

