import java.util.ArrayList;

public class Ques5{
    public static void main(String[] args) {
	
	int	nums1[] = {1,2,3,0,0,0};
			int nums2 [] = {2,5,6};
			int m = 3;
			int n = 3;
			int x=m+n;
			ArrayList ans=new ArrayList();
			 int i=0,j=0;
		
		
		 while(i<n&&j<m){
		 if (nums1[i]==0){
		 i++;
		 }
		 if(nums2[j]==0){
		 j++;
		 }
		 if(nums1[i]>nums2[j]){
		 ans.add(nums2[j]);
		
		 j++;
		 }
		 else{
		 ans.add(nums1[i]);
		
		 i++;
		 }
		
		 }
		 while(i<n){
		 ans.add(nums1[i]);
		
		 i++;
		
		 }
		 while(j<n){
		 	ans.add(nums2[j]);
		 j++;
		
		 }
System.out.println(ans);
	}

}