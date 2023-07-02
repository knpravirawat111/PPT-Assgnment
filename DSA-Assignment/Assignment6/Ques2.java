public class Ques2 {
    public static void main(String[] args) {
        int matrix[][]={ {1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target =3;
          int s=0;
        int m=matrix.length;
        int n=matrix[0].length;
        int e=m*n-1;

        while(s<=e){
            int mid=s+(e-s)/2;
            int midEle=matrix[mid/n][mid%n];
            if(midEle==target){
               System.out.println("true");
               return;
            }
            else if(midEle>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
      System.out.println("false");
    }
    
}

