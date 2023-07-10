
public class Ques4 {
    public static boolean main(String[] args) {
		// TODO Auto-generated method stub
		int flowerbed[]= {1,0,0,0,1};
		int n=1;
		 int count = 0;
	 int first = -2;
	 int second = 0;
	 while(second < flowerbed.length){
	 while(second < flowerbed.length && flowerbed[second] != 1){
	 second ++;
	 }
	 if(second >= flowerbed.length){break;}
	 count += (second-first-2)/2;
	
	 first = second;
	
	 second ++;
	 }
	 System.out.println(second);
	 count += (second-first-1)/2;
	 return count >= n;
	}

}
