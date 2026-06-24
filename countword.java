public class countword{
    public static void main(String[] args) {
        String s = "aksh";
        int [] freq = new int[26];
        for(int i = 0; i<s.length(); i++){
            freq[s.charAt(i) -'a']++;
            
            System.out.print(s.charAt(i)+ " ");
            

        }
        for(int i =0; i<26; i++){
            if(freq[i]>0){
            System.out.print(freq[i] + " ");
            }
        }
       
    }
}