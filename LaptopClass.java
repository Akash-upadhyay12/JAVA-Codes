public class LaptopClass {
    String name;
    String brand;
    int price;

    void showdetail(){
        System.out.println("these are the details..");
    }


    public static void main(String[] args) {
        LaptopClass l1 = new LaptopClass();
        LaptopClass l2 = new LaptopClass();
        l1.name = "Victus";
        l1.brand ="HP";
        l1.price =50000;
        l2.name = "ASUS VIVOBOOK";
        l2.brand ="ASUS";
        l2.price =60000;
        l1.showdetail();
        System.err.println("The name is laptop is "+ l1.name);
        System.err.println("The brand of laptop is "+ l1.brand);
        System.err.println("The price of laptop is "+ l1.price);
        System.err.println("The name is laptop is "+ l2.name);
        System.err.println("The brand of laptop is "+l2.brand);
        System.err.println("The price of laptop is "+l2.price);

        
        
    }
    
}
