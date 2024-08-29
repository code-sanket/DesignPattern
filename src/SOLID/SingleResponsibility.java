package SOLID;

public class SingleResponsibility {

    static class Invoice{
        void printInvoice(){
            System.out.println("printing Invoice"); //now this class has only one responsibility
        }
    }

    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.printInvoice(); // following single responsibility
    }
}
