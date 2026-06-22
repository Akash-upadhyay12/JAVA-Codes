import java.util.*;
public class SalaryIncrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rating = sc.nextInt();
        int salary = 18000;

        if(rating>0 && rating <=3){
            int total = salary + (salary*5)/100;
            System.out.println(total);
        }
        else if(rating >3 && rating <=4){
            int total = salary + (salary*10)/100;
            System.out.println(total);
            //System.out.println(salary + (salary*10)/100);
            
        }
        else if(rating >4 && rating <=5){
            int total = salary + (salary*20)/100;
            System.out.println(total);
            
        }
        else{
            System.out.println("invalid rating");
        }

        
        
        
    }
    
}
