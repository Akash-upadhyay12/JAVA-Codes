import java.util.*;
public class CountTyres {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0; i<n; i++){
            int c = sc.nextInt();
            int b = sc.nextInt();
            int total = (c*4) + (b*2);
            System.out.print(total);
        }
        
    }
    
}
