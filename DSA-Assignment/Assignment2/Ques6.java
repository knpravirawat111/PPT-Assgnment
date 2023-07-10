

public class Ques6 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    int nums []= {1,3,9,10,12};
    int ans=0;
   int target=9;
               int s=0;
        int n=nums.length-1;
        int e=n-1;
        int mid = s+(e-s)/2;
        while(s<=e){
        if(nums[mid]==target){
        ans= mid;
        break;
       
        }
       
        if(nums[mid]>target){
        e=mid-1;
        }
        else
        {
        s=mid+1;
       
        }
        mid = s+(e-s)/2;
        }
       
        System.out.println(ans);
       }

}
