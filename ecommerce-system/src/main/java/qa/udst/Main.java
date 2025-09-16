package qa.udst;

import com.google.common.base.Joiner;

import qa.udst.ecommerce.model.Catalog;
import qa.udst.ecommerce.model.Customer;
import qa.udst.ecommerce.model.DigitalProduct;
import qa.udst.ecommerce.model.Invoice;
import qa.udst.ecommerce.model.Order;
import qa.udst.ecommerce.model.PhysicalProduct;

public class Main {
    public static void main(String[] args) {
        String result = Joiner.on(" ").join("E-commerce","System");
        System.out.println(result);

        WelcomeECommerce.Welcome();

        PhysicalProduct p1 = new PhysicalProduct(1, "Pc", 2000,2300,null);
        PhysicalProduct p2 = new PhysicalProduct(2, "Phone", 1000,5,null);
        PhysicalProduct p3 = new PhysicalProduct(3, "Mouse", 200,23,null);
        DigitalProduct d1 =new DigitalProduct(4, "office 365", 50, "https://www.bing.com/search?q=office+365&form=WSHBSH&qs=AS&cvid=73d204bfb77e463cb539cb37b924adc1&pq=&cc=US&setlang=en-US&nclid=97FF467942C9B14FCDB8F166C19C697B&ts=1757411143727&PC=WSBREC",null);

        p1.displayDetails();
        d1.displayDetails();
        System.out.println("*******************************************");
        Catalog c1 =new Catalog();
        c1.AddProduct(p1);
        c1.AddProduct(p2);
        c1.AddProduct(p3);
        c1.displayAllProduct();
        System.out.println("*******************************************");
        Order o1 = new Order();
        o1.AddProduct(p3);
        o1.AddProduct(p2);
        Customer Co1 = new Customer(1, "ahmad", "ahmad123@gmail.com");
        //Co1.displayCustomerInfo();
        
        System.out.println("*******************************************");
        Invoice  i1 = new Invoice(1, o1,Co1);
        i1.displayInvoice();
        System.out.println("\n*******************************************");
        
    }
}