

import java.util.Arrays;

public class Ques8 {
    public static int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        if(n%2 != 0){
            return new int[0];
        }
        int [] ans=new int[n/2];
        int [] count=new int[100001];
        for(int i : changed){
            count[i]++;
        } 
        int idx = 0;
        for(int i=0;i<100001;i++){
            while(count[i]>0 && i*2<100001 && count[i*2]>0){
                count[i]--;
                count[i*2]--;
                ans[idx]=i;
                idx++;
            }
        }
        for(int i=0;i<100001;i++){
            if(count[i] != 0){
                return new int[0];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={1,3,4,2,6,8};
        System.out.println(Arrays.toString(findOriginalArray(arr)));
    }
    
}
