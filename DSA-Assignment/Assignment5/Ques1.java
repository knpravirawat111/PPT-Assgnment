

public class Ques1 {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        int arr[][]=new int [m][n];
        int count=0;
        if(original.length != m*n){
           
            return new int [0][0];
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=original[count++];
            }


        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int n=2;
        int m=2;
        int ans[][]=construct2DArray(arr,m,n);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                 System.out.print((ans[i][j])+" ");
            }
               System.out.println();
        }
    
    }
}

