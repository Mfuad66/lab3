package qa.udst.ecommerce.model;

abstract class BaseProduct {
    int id;
    String name;
    double price;
    ProductCategory category;

    public BaseProduct(int id, String name, double price,ProductCategory category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        
    };

    public void displayDetails(){
        System.out.println("name: "+ name+", Price: "+price);
    }

    @Override
    public String toString() {
        return "Product [ id= " + id + ", name= " + name + ", price= " + price +",  category= "+category+ " ]";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public ProductCategory getCategory() {
        return category;
    }

  
        

}
