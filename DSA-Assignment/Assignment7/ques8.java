public class ques8 {
    public static void main(String[] args) {
        int coordinates[][]={{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
            int x0=coordinates[0][0];
        int x1=coordinates[1][0];
        int y0=coordinates[0][1];
        int y1=coordinates[1][1];
        int dx=x1-x0;
        int dy=y1-y0;
        int flag=0;
        for(int i=2;i<coordinates.length;i++){
            int x=coordinates[i][0];
            int y=coordinates[i][1];
            if(dx*(y-y0)!=dy*(x-x0)){
             System.out.println(false);
               flag=1;
            }
        }
       if(flag==0){
          System.out.println(true);
       }
    }
}
