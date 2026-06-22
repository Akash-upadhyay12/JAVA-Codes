public class Electricity {
    public static void main(String[] args){
        int electricity = -100;
        if(electricity<=100 && electricity>=0){
            System.out.println(electricity*5);
        }
        else if(electricity<=200 && electricity>100){
            System.out.println((electricity-100)*7+500);
        }
        else if(electricity>200){
            System.out.println((electricity-200)*9+1200);
        }
        else{
          System.out.println("Invalid");  
        }
    }
}
