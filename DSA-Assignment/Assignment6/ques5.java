import java.util.Arrays;

public class ques5 {
      public static void reverse(long a[]){
         int i=0;
         int j=a.length-1;
         while(i<j){
             long temp=a[i];
             a[i]=a[j];
             a[j]=temp;
             i++;
             j--;
         }
     }

    public static long minValue(long a[], long b[], long n) 
    {
        // Your code goes here
        long sum=0;
        Arrays.sort(a);
        Arrays.sort(b);
        reverse(b);
        for( int i=0;i<n;i++){
            sum +=a[i]*b[i];
        }
           return sum;
    }
    public static void main(String[] args) {
        long arr1[]={5,3,4,2};
        long arr2[]={4,2,2,5};
        int n=4;
        System.out.println(" the minimize sum of product of arrays is " +minValue(arr1,arr2,n) );
    }
}
