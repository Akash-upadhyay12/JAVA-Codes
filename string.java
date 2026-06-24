import java.util.*;
public class string{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            String s = sc.next();
            int k = 0;
            int j = s.length()-1;
            while(k<=j){
                if(s.charAt(k) != s.charAt(j)){
                    System.out.print("false");
                }
                k++;
                j--;
            }
            
           
        }
        System.out.println("true");
    }
}



