

public class Ques5 {
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int cnt =0;
        for(int i=0;i<arr1.length;i++){
            int fst=arr1[i];
            boolean flag =false;
            for(int j=0;j<arr2.length;j++){
                int scd=arr2[j];
                if(Math.abs(scd-fst)<=d){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int arr1[]={4,5,8};
        int arr2[]={10,9,1,8};
        int d=2;
        System.out.println(findTheDistanceValue( arr1,arr2,d));
    }
}
