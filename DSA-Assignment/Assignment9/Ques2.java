

import java.util.Arrays;

public class Ques2 {
    
    public static int[] searchRange(int[] nums, int target) {
        //    int arr[]=new int [2];
        int   arr[]={-1,-1};
            int s=0;
            int e=nums.length-1;
          
           while(s<=e){
               int mid=s+(e-s)/2;
               if(nums[mid]==target){
                 arr[0]=mid;
                   e=mid-1;
               }
               else if(nums[mid]>target){
                   e=mid-1;
               }else{
                   s=mid+1;
               }
           }
            int l=0;
            int r=nums.length-1;
               while(l<=r){
               int mid=l+(r-l)/2;
               if(nums[mid]==target){
                  arr[1]=mid;
                    l=mid+1;
               }
               else if(nums[mid]>target){
                   r=mid-1;
               }else{
                   l=mid+1;
               }
           }
    
            if(nums.length==1 && nums[0]==target){
                 arr[0]=0;
                 arr[1]=0;
           }
           
         else  if(arr[0]==0&&arr[1]==0){
                arr[0]=0;
                 arr[1]=0;
         }
        
      return arr ;
    
        }
    
     public static void main(String[] args) {
            int nums[]={5,7,7,8,8,10};
            int target=8;
            System.out.println(Arrays.toString(searchRange(nums,target)));

     }
    
}
