import java.util.*;
public class CheckPalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        int m = n;

        while(n>0){
            int digit = n % 10;
            rev =  rev*10 + digit;
            n /=10;

        }
        if(m == rev){
            System.out.print("true");
        }
        else{
            System.out.println("false");
        }


    }
}