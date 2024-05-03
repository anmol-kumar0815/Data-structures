import java.util.Scanner;

public class PrimeNumbers {
  public static boolean isPrime(int n) {
    if(n == 1) return false;

    for(int i=2; i*i<=n; i++){
      if(n % i == 0){
        return false;
      }
    }

    return true;
  }

  public static void primeTillN(int n){
    for (int i=1; i<=n; i++){
      if(isPrime(i)){
        System.out.println(i);
      }
    }
  }

  public static void main(String args[]){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    // System.out.println(isPrime(n));
    primeTillN(n);
  }
}
