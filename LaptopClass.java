public class LaptopClass {
    String name;
    String brand;
    int price;

    void showdetail(){
        System.out.println("Name is: "+ name);
        System.out.println("brand is: "+ brand);
        System.out.println("price is: "+ price);
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
        System.out.println();
        l2.showdetail();

        
        
    }
    
}
