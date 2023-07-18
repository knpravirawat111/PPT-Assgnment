

import java.util.Arrays;

public class Ques1 {
 
     public static int[] twoSum(int[] numbers, int target) {
     int arr[]=new int[2];
     int i=0,j=numbers.length-1;
     int num1=-1,num2=-1;
     while(i<j){
         if(numbers[i]+numbers[j]>target){
             j--;
         }else if(numbers[i]+numbers[j]<target){
             i++;
         }else{
                num1=i+1;
                num2=j+1;
                break;
         }
     }
         
        arr[0]=num1;
        arr[1]=num2;
        return arr;

    }     

    public static void main(String[] args) {
         int arr[] ={2,7,11,15};
         int target=9;
         System.out.println(Arrays.toString(twoSum(arr,target)));

    }
    
}
