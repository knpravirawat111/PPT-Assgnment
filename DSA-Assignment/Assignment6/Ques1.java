import java.util.*;
public class Ques1 {
      public static int[] diStringMatch(String s) {
      int arr[]=new int[s.length()+1];
      int high=s.length();
      int low=0;
      int k=0;
      for(int i=0;i<s.length();i++){
     
                if(s.charAt(i)=='I'){
                    arr[k++]=low++;
                       }
            else{
              arr[k++]=high--;       
               }
          
          }
               arr[k++]=high;
       
      return arr;
    }

    public static void main(String [] args){
       String str = "IDDI";
       int ans []=diStringMatch(str);
       System.out.println(Arrays.toString(ans));

    }
}
