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

  public static void printInverseOfNumber(int number){
    int quotient = number;

    while(quotient != 0){
      int remainder = quotient % 10;
      System.out.println(remainder);
      quotient = quotient / 10;
    }
  }

  public static void main(String args[]){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    printInverseOfNumber(n);
  }
}
