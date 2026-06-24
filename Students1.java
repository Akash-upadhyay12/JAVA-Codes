import java.util.*;
public class Students1 {
    int roll;
    String name;
    int [] marks;

    public Students1(int roll, String name, int[]  marks){
        this.roll = roll;
        this.name = name;
        this.marks = marks;

    }
     double CalculateAverage(){
        double sum = 0;
        for(int i = 0; i<marks.length; i++){
            sum += marks[i];
        }
        double  avg = sum/5.00;
        return avg; 
    }
    

    char calculateGrade(double avg){
        if(avg > 90){
            return 'A';
        }
        else if(avg > 80){
            return 'B';
        }
        else if(avg>70){
            return 'C';
        }
        else{
            return 'D';
        }
      
    }
    void  showDetails(){
        double avg = CalculateAverage();
        System.out.println("roll no : " + roll);
        System.out.println("name : " + name);
        System.out.println("Average :" + avg);
        System.out.println("Grade : " + calculateGrade(avg));

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int roll = sc.nextInt();
        String name = sc.nextLine();
        int [] marks = new int[5];
        for(int  i = 0; i<5; i++){
            marks[i] = sc.nextInt();

        }
        Students1 st = new Students1(roll, name, marks);
        st.showDetails();


        
    }
    
}
