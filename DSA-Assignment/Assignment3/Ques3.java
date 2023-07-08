import java.util.Arrays;

public class Ques3 {

     public static void nextPermutation(int[] nums) {
        int idx1=0;
        int idx2=-1;
        int flag=0;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx1=i;
             flag=1;
                break;
            }
        }
        
        for(int i=nums.length-1;i>idx1;i--){
            if(nums[idx1]<nums[i]){
                idx2=i;
                int temp=nums[idx1];
                nums[idx1]=nums[i];
                nums[i]=temp;
            }
        }


        if(flag==0){
            Arrays.sort(nums);
        }else{
      Arrays.sort(nums,idx1,idx2);
        }
     
       
    }
    public static void main(String[] args) {
        int nums []={1,2,3};
         nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
