public class checkanagram {
     public static void main(String[] args) {
        String s1 = "aksh";
        String s2 = "shak";
        int [] freq1 = new int[26];
        int [] freq2 = new int[26];
        for(int i = 0; i<s1.length(); i++){
            freq1[s1.charAt(i) -'a']++;
          
        }
        for(int i = 0; i<s2.length(); i++){
            freq2[s2.charAt(i) -'a']++;
          
        }
        for(int i =0; i<26; i++){
            if(freq1[i] != freq2[i]){
                System.out.println(false);
                return;
            }
            
            
        }
        System.out.println(true);
       
    }
    
}
