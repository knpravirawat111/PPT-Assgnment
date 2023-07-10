

import java.util.Arrays;

public class Ques5 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
int nums []= {-10,-5,2,6};
int n=nums.length;
//sort the array;
// if there is two large negative number then we take 2 first and 1 last and compare with last 3 thrre number;
Arrays.sort(nums);
System.out.println(Math.max((nums[n-1]*nums[n-2]*nums[n-3]),(nums[0]*nums[1]*nums[n-1])));
	}

}
