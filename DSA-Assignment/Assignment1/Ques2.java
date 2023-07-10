

import java.util.ArrayList;

public class Ques2 {
    public static void main(String[] args) {
		
		 ArrayList ans= new ArrayList();
		 int arr[]={2,3,3,2};
	 int key=3;
		 int count=0;
	 for(int i=0;i<arr.length;i++) {
		 if(arr[i]!=key) {
		 	 ans.add(arr[i]);
		 	 count++;
		 }
	 }
	 int remain=(arr.length-1)-count;
	 for(int i=0;i<=remain;i++) {
		 ans.add(0);
	 }
	 System.out.println(count);
	 System.out.println(ans);
	}

}

