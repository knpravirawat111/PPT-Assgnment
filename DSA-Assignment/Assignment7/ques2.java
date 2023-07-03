import java.util.HashMap;
import java.util.Map;

public class ques2 {
    public static void main(String[] args) {
        String num="69";
        int flag=0;
         Map<Character, Character> map = new HashMap<Character, Character>();
        map.put('6', '9');
        map.put('9', '6');
        map.put('0', '0');
        map.put('1', '1');
        map.put('8', '8');
        int l = 0, r = num.length() - 1;
        while (l <= r) {
            if (!map.containsKey(num.charAt(l))){
                  System.out.println(false);
                  flag=1;
            } 
            if (map.get(num.charAt(l++)) != num.charAt(r--)){
                 System.out.println(false);
                 flag=1;
            }
        }if(flag==0){
           System.out.println(true);
        }
    }
}
