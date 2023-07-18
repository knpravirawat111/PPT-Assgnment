package Assignment9;

public class Ques6 {
    public static int firstBadVersion(int n) {
        int s=1;
        int e=n;
        int result=0;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(firstBadVersion(mid)){
                result=mid;
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int n=5;
        int bad=4;
        System.out.println(firstBadVersion(n));
    }
}
