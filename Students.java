public class Students{
    String name;
    int age;
    int roll_no;

    void study(){
        System.out.println("studying..");
    }
    void reading(){
        System.out.println("Reading");
    }
    void sleep(){
        System.out.println("Sleeping");
    }
    public static void main(String[] args) {
        Students s1 = new Students();
        //new keyword for allocate object in  heap memory
        s1.name = "akash";
        s1.age = 12;
        s1.roll_no = 1;
        s1.study();
        s1.reading();
        s1.sleep();
        System.out.println("name is "+ s1.name);
        System.out.println("age is " + s1.age);
        System.out.println("roll no is" + s1.roll_no);



        
    }
    
        
    
}