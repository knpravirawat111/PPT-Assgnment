

import java.util.Arrays;

public class Ques7 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr []= {0,1,0,3,12};
		
		 int j=0;
	 int i=0;
	 if(arr.length==0||arr.length==1){
	 return;
	 }
	 while(i<arr.length){
	 if(arr[i]==0){
	 i++;
	 }else{
	 int temp=arr[i];
	 arr[i]=arr[j];
	 arr[j]=temp;
	 j++;
	 i++;
	 }
	 }
	 System.out.println(Arrays.toString(arr));
	}

}
