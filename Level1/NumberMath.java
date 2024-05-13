import java.util.Scanner;
import java.lang.Math;

public class NumberMath {

  public static int countDigitsOfNumbers(int number){
    int quotient = number;
    int digitCount = 0;

    while(quotient != 0){
      quotient = quotient / 10;
      digitCount++;
    }

    return digitCount;
  }

  public static void printDigitsOfNumber(int number) {
    int digitCount = countDigitsOfNumbers(number);
    int divider = (int)Math.pow((double)(10), (double)(digitCount - 1));

    while(divider != 0){
      int quotient = number / divider;
      int remainder = number % divider;
      System.out.println(quotient);
      number = remainder;
      divider = divider / 10;
    }
  }

  public static void main(String args[]){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    printDigitsOfNumber(n);
  }
}
