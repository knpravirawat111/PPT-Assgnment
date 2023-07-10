

import java.util.Arrays;

public class Ques8 {
    	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1};
		int k=0;
		 final int max = Arrays.stream(nums).max().getAsInt();
		 final int min = Arrays.stream(nums).min().getAsInt();
        int  ans=Math.max(0, max - min - 2 * k);
		 System.out.println(ans);
	}

}
