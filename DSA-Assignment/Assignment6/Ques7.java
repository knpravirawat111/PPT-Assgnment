import java.util.Arrays;

public class Ques7 {
    public static int[][] generateMatrix(int n) {
        int top=0;
        int bottum = n-1;
        int left=0;
        int right=n-1;
        int count=1;
        int arr[][] = new int[n][n];
        while(left<=right && top<=bottum){
        // left ->rigth;
       for(int j=left;j<=right;j++){
             arr[top][j]=count++;
       }
       top++;
    //    top-> bottum;
       for(int i=top;i<=bottum;i++){
           arr[i][right]=count++;
       }
       right--;
    //    right->left;
       for(int j=right;j>=left;j--)
       {
           arr[bottum][j]=count++;
       }
       bottum--;
       // bottum -> left;
       for(int i=bottum;i>=top;i--){
           arr[i][left]=count++;
       }left++;
        }
        return arr;
    }

    public static void main(String[] args) {
           int n=4;
           int arr[][]=generateMatrix( n);
           System.out.println("the spiral matrix is " );
           for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            System.out.print(arr[i][j]+" ");
           }
           System.out.println();
        }
    }
}
