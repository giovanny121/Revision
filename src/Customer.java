public class Customer {
    private String name;
    private int age;
    private int customerId;
    public  Customer(String name, int age , int customerId){
        this.customerId=customerId;
        this.name=name;
        this.age=age;
    }

    public int getCustomerId(){
        return this.customerId;
    }
    public void setCustomerId(int customerId){
        this.customerId = customerId;
    }
    public  String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
    public  int getage(){
        return age;
    }
    public void setage(int age){
        this.age=age;
    }
    @Override
    public String toString(){
        return name;
    }
}
