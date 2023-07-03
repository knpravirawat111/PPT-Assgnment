import java.util.*;
import java.lang.*;
public class Ques4 {
    public static void main(String[] args) {
        String s="Lets keep Leetcode";

     
        int len = s.length(); 
        if(len == 1) 
            System.out.println(s);
        
        int firstIndex, lastIndex;
        char[] res = s.toCharArray(); 
        char temp;
        
        for(int index = 0 ; index < len ; index++){
            
            firstIndex = index; 
            
            while(++index < len && res[index] != ' '); 
            lastIndex = index - 1; 
            
      // reversing characters of the word
            while(firstIndex < lastIndex){
                temp = res[firstIndex];
                res[firstIndex++] = res[lastIndex];
                res[lastIndex--] = temp;
            }
        }
        
       System.out.println(res);
    }
}
