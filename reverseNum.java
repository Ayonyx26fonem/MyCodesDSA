import java.util.*;

public class reverseNum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int lastDigit = 0, reverse = 0;
    while (n > 0) {
      lastDigit = (n % 10);
      reverse=reverse*10+lastDigit;
      n /= 10;
      // lastDigit = n % 10;
      // n /= 10;
      // System.out.print(lastDigit);
    }
    sc.close();
  }
}
