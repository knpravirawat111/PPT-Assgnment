public class Ques4 {
    
    public static int searchInsert(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                e=mid-1;
             //    ans=mid;
            }else{
                s=mid+1;
             //    ans=mid;
            }
        }
        return s;
     }

     public static void main(String[] args) {
        int nums[]={1,3,5,6};
        int target = 5;
        System.out.println(searchInsert(nums,target));
     }
}
