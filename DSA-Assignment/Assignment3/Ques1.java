import java.util.Arrays;

class Ques1{
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
       
        int ans=0;
        for(int i=0;i<nums.length-2;i++){
            int s=i+1;
            int e=nums.length-1;
            int diff=Integer.MAX_VALUE;
            while(s<e){
              int  sum=nums[i]+nums[s]+nums[e];
              if(sum== target){
                  return sum;
              }
              else  if(Math.abs(diff)>Math.abs(sum-target)){
                    diff=sum-target;
                    ans=Math.abs(sum);
                }

                 if(sum>target){
                    e--;
                }else{
                    s++;
                }
            }
        }
        return ans;
    
    }

    public static void main(String[] args) {
        int nums[]={-1,2,1,-4};
       
          System.out.println(threeSumClosest(nums,1));
    }
}