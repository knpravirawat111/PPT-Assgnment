public class Ques2 {
    public static int arrangeCoins(int n) {
        long sum=0;
        long s=0;
        long e=n;
        while(s<=e){
            long mid=s+(e-s)/2;
            if((mid*(mid+1)/2)==n){
                return (int)mid;
            }else if((mid*(mid+1)/2)>n){
                      e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return (int)s-1;
          }
          public static void main(String[] args) {
            int n=5;
            System.out.println("the no of stairs is "+arrangeCoins( n) );
          }
}
