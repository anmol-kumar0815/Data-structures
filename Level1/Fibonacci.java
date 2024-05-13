import java.util.Scanner;

public class Fibonacci {
  public static void FibonacciTillN(int n){
    int a = 0, b = 1, c = 1;

    while(n-- > 0){
      System.out.print(a + " ");
      a = b;
      b = c;
      c = a + b;
    }
  }

  public static void main(String args[]){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    FibonacciTillN(n);
  }
}
