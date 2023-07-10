import java.util.Arrays;

public class Ques4 {
    public static void plusOne(int[] digits) {
        int n=digits.length;
        for(int i=n-1;i>=0;i--){
        if(digits[i]<9){
        digits[i]=digits[i]+1;
       
        }
        else{
        digits[i]=0;
        }
        }
       
        }
       public static void main(String[] args) {
          
           int arr[]= {1,2,4};
           plusOne(arr);
       System.out.println(Arrays.toString(arr));
   }
   
    
}
