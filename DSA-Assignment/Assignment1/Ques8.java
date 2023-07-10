

import java.util.ArrayList;

    public class Ques8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,2,4};
		int sum=0;
		int duplicate=0;
		ArrayList ans =new ArrayList();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					ans.add(arr[i]);
					duplicate=arr[i];
				}
			
				
			}
			sum=sum+arr[i];
		}
		int TotalSum=(arr.length)*(arr.length+1)/2;
		int num=(TotalSum+duplicate)-sum;
		ans.add(num);
		System.out.println(ans);
	}

}
