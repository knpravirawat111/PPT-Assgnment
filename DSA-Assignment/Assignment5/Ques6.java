
import java.util.*;

public class Ques6 {
    
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            int n = Math.abs(nums[i]);
            if(nums[n-1] > 0) {
                nums[n-1] = -nums[n-1];
            } else {
                list.add(Math.abs(nums[i]));
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int arr1[]={4,3,2,7,8,2,3,1};
        Ques6 obj = new Ques6();
       int an[]= obj.findDuplicates(arr1);
        System.out.println(an);
    }
 

}
