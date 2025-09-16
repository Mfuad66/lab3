package qa.udst.ecommerce.model;


import java.time.LocalDate;

public class Invoice {
    int InvoiceId;
    Order order;
    LocalDate date = LocalDate.now(); ;
    Customer customer;
    

    public Invoice(int invoiceId, Order order, Customer customer) {
        this.InvoiceId = invoiceId;
        this.order = order;
        this.customer= customer;
    }

    public void generateInvoice(){
            System.out.println(customer);
            System.out.printf("_______________________________________");
            System.out.printf("\n\t\tInvoice ",InvoiceId );
            System.out.printf("\n\t\t%td-%<tb-%<tY", date);
        
            System.out.printf("\n---------------------------------------");
            System.out.printf("\n| ID |\t\tDESC\t|\tAMT\t  |");
            System.out.printf("\n---------------------------------------\n" );
        

            order.displayorder();

            System.out.printf("\n---------------------------------------\n" );
            System.out.printf("\n                 total                \n" );
            System.out.printf("\n---------------------------------------\n" );
            System.out.println("\t\t"+ order.calcoulateTotal());
            System.out.printf("\n---------------------------------------");
            System.out.printf("\n\t\tTHANK YOU!");
            System.out.printf("\n_______________________________________");
        

    }

    public void displayInvoice(){
            generateInvoice();
    }

}
