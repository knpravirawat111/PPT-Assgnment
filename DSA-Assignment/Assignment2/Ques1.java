
//	Ques1.	Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2),..., (an, bn) such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.

import java.util.Arrays;

public class Ques1 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,3,2};
		// first sort the array;
		int sum=0;
Arrays.sort(arr);
for(int i=0;i<arr.length;i+=2) {
	 sum=sum+Math.min(arr[i], arr[i+1]);
}
System.out.println(sum);
	}
}
