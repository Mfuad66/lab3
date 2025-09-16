package qa.udst.ecommerce.model;

public class DigitalProduct extends BaseProduct{
    String downloadLink ;

    
    
    public DigitalProduct(int id, String name, double price, String downloadLink, ProductCategory category) {
        super(id, name, price, category= ProductCategory.DIGITAL);
        this.downloadLink = downloadLink;
    }



    @Override
    public void displayDetails() {
        // TODO Auto-generated method stub
        
        System.out.println("name: "+ name+", Price: "+price+" downloadLink: "+downloadLink);

    }
}
