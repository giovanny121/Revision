public class Main {
    public static void main(String [] args) {
        Customer customer1=new Customer("Jeremy" ,30,1);
        Customer customer2=new Customer("Wfi" ,35,2);
        Customer customer3=new Customer("Jf" ,37,3);
        Customer customer4=new Customer("Jemina" ,30,4);
        Customer customer5=new Customer("Jeremy" ,34,5);
        Customer customer6=new Customer("miriam" ,302,6);
        Customer customer7=new Customer("Mama" ,30,7);
        Customer customer8=new Customer("Daniel" ,30,8);
        Customer customer9=new Customer("papa" ,40,9);
        Customer customer10=new Customer("Jere" ,3,100);
        Sedan sedan=new Sedan("UBM45", "CAR",52.5);
        SportBike bike =new SportBike("UBJ78","Motorcycle",30.1);
        sedan.rentVehicle(customer5);
        sedan.rentVehicle(customer2);
        sedan.rentVehicle(customer8);
        sedan.rentVehicle(customer6);
        bike.rentVehicle(customer1);
        bike.rentVehicle(customer3);
        bike.rentVehicle(customer9);
        sedan.rentVehicle(customer10);
        bike.rentVehicle(customer7);
        sedan.rentVehicle(customer4);
        sedan.printVehicleDetails();
        sedan.printRentedBy();
        bike.printVehicleDetails();
        bike.printRentedBy();
        sedan.returnVehicle(customer5);
        bike.returnVehicle(customer7);
        System.out.println(" ");
        bike.printVehicleDetails();
        bike.printRentedBy();
        sedan.printVehicleDetails();
        sedan.printRentedBy();
    }


}