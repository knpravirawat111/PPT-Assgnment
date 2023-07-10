

import java.util.HashMap;
import java.util.Map;

public class Ques3 {
    public static void main(String[] args) {
		
		int nums[]= {1,3,2,2,5,2,3,7};
		 int ans = 0;
		 Map<Integer, Integer> count = new HashMap<>();
		 for (final int num : nums)
		 count.merge(num, 1, Integer::sum);
		 for (final int num : count.keySet())
		 if (count.containsKey(num + 1))
		 ans = Math.max(ans, count.get(num) + count.get(num + 1));
		 System.out.println(ans);
	}

}
