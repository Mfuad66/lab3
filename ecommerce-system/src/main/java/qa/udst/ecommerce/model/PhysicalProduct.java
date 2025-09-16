package qa.udst.ecommerce.model;

public class PhysicalProduct extends BaseProduct implements Shippable{
    double weight;

    

    public PhysicalProduct(int id, String name, double price, double weight, ProductCategory category) {
        super(id, name, price,category =ProductCategory.PHYSICAL);
        
        this.weight = weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void displayDetails() {
        // TODO Auto-generated method stub
        System.out.println("name: "+ name+", Price: "+price+" weight: "+weight +" shipping cost: "+calculateShippingCost()+", trcking ID: "+ generateTrackingNumber());
    }
    
    @Override
    public double calculateShippingCost() {
        // TODO Auto-generated method stub
        double shippingCost = weight * 2 ;
        return shippingCost;
    }

    @Override
    public String generateTrackingNumber() {
        // TODO Auto-generated method stub
    String tackingID = "TRACK"+Integer.toString(id);
    return tackingID;

    }
    
}
