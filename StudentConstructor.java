public class StudentConstructor {
    String name;
    int age;
    int roll_no;

    StudentConstructor(String name, int age, int roll_no) {
        System.out.println("constructor called...");
        this.name = name;
        this.age = age;
        this.roll_no = roll_no;

    }

 
    public static void main(String [] args){
        StudentConstructor c = new StudentConstructor("Akash", 21, 1);
        System.out.println(c.name);
        System.out.println(c.age);
        System.out.println(c.roll_no);






    }
    
}
