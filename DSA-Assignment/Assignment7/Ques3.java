public class Ques3 {
    public static void main(String[] args) {
        String num1="123";
        String num2="11";
    StringBuilder sb = new StringBuilder();
    int carry = 0;
    int i = num1.length() - 1;
    int j = num2.length() - 1;

    while (i >= 0 || j >= 0 || carry > 0) {
      if (i >= 0)
        carry += num1.charAt(i--) - '0';
      if (j >= 0)
        carry += num2.charAt(j--) - '0';
      sb.append(carry % 10);
      carry /= 10;
    }

    System.out.println(sb.reverse().toString()) ;
  
    }
}
