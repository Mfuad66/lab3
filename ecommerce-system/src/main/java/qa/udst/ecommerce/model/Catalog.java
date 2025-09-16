package qa.udst.ecommerce.model;

import java.util.ArrayList;

public class Catalog {
    ArrayList<BaseProduct> catalog =new ArrayList<>();

    public void AddProduct(BaseProduct product){
        catalog.add(product);

    }

    public void displayAllProduct(){
        System.out.println("All Products: ");
        for (BaseProduct i :catalog ){
            System.out.println(i);
        }
    }

    


    
}
