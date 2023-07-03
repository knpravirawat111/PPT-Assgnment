import java.util.*;

public class Ques7 {
  
    public static void main(String[] args) {
          String s="ab#c";
    String t="ad#c";
          Stack st1=new Stack();
        Stack st2=new Stack();
        for(int i=0;i<s.length();i++){
            if((s.charAt(i))=='#'){
                st1.pop();
            }else{
                st1.push(s.charAt(i));
            }
        }
         for(int i=0;i<t.length();i++){
            if((t.charAt(i))=='#'){
                st2.pop();
            }else{
                st2.push(t.charAt(i));
            }
         }
         if(st1.equals(st2)){
            System.out.println(true);
         }
        else{
             System.out.println(true);
        }
    }
    
}
