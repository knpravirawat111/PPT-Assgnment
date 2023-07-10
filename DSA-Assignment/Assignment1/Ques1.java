

import java.util.ArrayList;

public class Ques1 {
    
    public static void main(String[] args) {
		
		 int arr[]={2,7,11,15};
	 int target=9;
	 ArrayList ans = new ArrayList();
	 for(int i=0;i<arr.length;i++){
	 for(int j=i;j<arr.length;j++){
	 if(arr[i]+arr[j]==target){
	 ans.add(i);
	 ans.add(j);
	 }
	 }
	 }
	
	 // int s=sc.nextInt();
	 System.out.println(ans);
	 // System.out.println(s);
	}

}
