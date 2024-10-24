public class SportBike extends Motorcycle{
    public SportBike(String licensePlate,String vehicalType,double rentalPrice){
        super(licensePlate,vehicalType,rentalPrice);
    }
    @Override
    public void printVehicleDetails(){
        System.out.println("License Plate : "+ getLicensePlate() + ",  Vehical Type : " + getVehicleType() + ", Rental Price : " + getRentalPricePerDay());
    }
    @Override
    public void printRentedBy(){
        System.out.println("Rented by : " + getCustomers());
    }
    @Override
    public  void rentVehicle(Customer customer){
        getCustomers().add(customer);
        System.out.println("The Sportbike has been rented by: " + customer.getname());

    }
    @Override
    public void returnVehicle(Customer customer){
        getCustomers().remove(customer);
        System.out.println("The Customer " + customer.getname() + " Has return the Sport Bike " );

    }

}

