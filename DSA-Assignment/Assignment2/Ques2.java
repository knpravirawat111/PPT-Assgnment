
import java.util.HashSet;
import java.util.Set;

public class Ques2 {
       public static void main(String[] args) {
		

		int candyType []= {6,6,6,6};
		// first create set
		Set diffCandy = new HashSet();
		
		for(int i=0;i<candyType.length;i++) {
			diffCandy.add(candyType[i]);
		}
		System.out.println(Math.min(candyType.length/2,diffCandy.size()));
	}

}
