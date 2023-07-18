

public class Ques5 {
    public static int majorityElement(int[] nums) {
        int count=0;
        int element=0;
        for(int i=0;i<nums.length;i++){
             if(count==0){
                element=nums[i];
            }
            if(nums[i]==element){
                count++;
            }else{
                count--;
            }
           
        }
        return element;
    }
    public static void main(String[] args) {
        int arr[]={3, 3, 4, 2, 4, 4, 2, 4, 4};
        
        System.out.print(majorityElement(arr));
     }

}
