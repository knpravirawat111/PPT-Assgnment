
// import java.util.*;


public class Ques3 {
    
      public static boolean validMountainArray(int[] arr) {
        // if(arr.length ==1 ||arr.length==2){
        //     return false;
        // }
        int s=0;
        int e=arr.length-1;
        while(s<e){
            if(arr[s]<arr[s+1]){
              s++;
            }
            else if(arr[e]<arr[e-1]){
                 e--;
            }
            else{
                break;
            }
        }
       
        return s!=0&&e!=arr.length-1&&s==e;
        }

        public static void main(String[] args) {
           int arr[]={0,1,2,3,4,5,3,2,1};
                System.out.println(validMountainArray(arr));
        }
}
