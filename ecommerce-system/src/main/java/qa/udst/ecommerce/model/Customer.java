package qa.udst.ecommerce.model;

public class Customer {
    int customerId;
    String name;
    String email;

    public Customer(int customerId, String name, String email) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
    }

    public void displayCustomerInfo(){
        System.out.println("ID: "+customerId+", name: "+name+", email: "+email);
    }

    @Override
    public String toString() {
        return "Customer "+customerId+", Name: "+name+", Email: "+email;
    }
    
}
