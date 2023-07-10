import java.util.HashMap;
import java.util.Map;

public class Ques4 {
    public static int findMaxLength(int[] nums) {
        int sum=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
           if(nums[i]==0){
               nums[i]=-1;
           }    
        }
      Map<Integer,Integer>map=new HashMap<>();
      map.put(0,-1);
      for(int i=0;i<nums.length;i++){
          sum=sum+nums[i];
          if(map.containsKey(sum)){
              int last = map.get(sum);
              max=Math.max(max,i-last);
          }else{
              map.put(sum,i);
          }
      }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={0,1,0};
        System.out.println("the maximum length of subArray is " +findMaxLength(arr));
    }
}
