package qa.udst.ecommerce.model;

import java.util.ArrayList;

public class Order {
    int orderId;
    ArrayList <BaseProduct> products = new ArrayList<>();
    double totalPrice;
    Customer customer;

    public void AddProduct(BaseProduct product){
        products.add(product);
    }


    public double calcoulateTotal( ){
        double totalPrice=0;
        for (BaseProduct i :products ){   
            totalPrice+=i.getPrice();
        }
        return totalPrice;
    }


    public void displayorder( ){
        for (BaseProduct i :products ){

            System.out.println( "\n"+i.getId()+"       "+i.getName()+"        \t     "+ i.getPrice());
        }
        
    }

}
