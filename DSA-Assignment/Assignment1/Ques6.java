
public class Ques6 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,1};
int flag=0;
for(int i=0;i<=arr.length;i++) {
	 for(int j=i+1;i<arr.length;j++) {
	 	if(arr[i]==arr[j]) {
		 	System.out.println("True");
			 flag=1;
	 	}
	}	
	
}
if(flag==0) {
	System.out.println("false");
}
	}


}
