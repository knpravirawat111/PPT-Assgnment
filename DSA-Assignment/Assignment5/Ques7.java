

public class Ques7 {
   public static int findMin(int arr[], int n)
    {
        
        int ans=Integer.MAX_VALUE;
        int s=0;
        int e=n-1;
        while(s<=e){
            int mid =s+(e-s)/2;
            if(arr[mid]>=arr[s]){
          ans=Math.min(ans,arr[s]);
                s=mid+1;
            }else{
                ans=Math.min(ans,arr[mid]);
                e=mid-1;
            }
        }
        
        return ans;
        
    }
    public static void main(String[] args) {
        int n=5;
        int arr[]={4,5,1,2,3};
        
        System.out.println(findMin(arr, n));
    }
}
