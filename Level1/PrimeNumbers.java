import java.util.Scanner;
import java.util.Arrays;

public class PrimeNumbers {
  public static boolean isPrime(int n) {     // Time complexity is √n
    if(n == 1) return false;

    for(int i=2; i*i<=n; i++){
      if(n % i == 0){
        return false;
      }
    }

    return true;
  }

  public static void primeTillN(int n){     // Time complexity is n(√n) => (n)^(2/3)
    for (int i=1; i<=n; i++){
      if(isPrime(i)){
        System.out.println(i);
      }
    }
  }

  // Sieve of Eratosthenes algorithm
  // Use this algo when n is smaller or equal to 10^7, and
  // When it's possible that, for a number we have to check if it is prime or not more that once.
  public static void isPrimeTillN(int n){    // Time complexity is O(N*log(log(N)))
    boolean[] isPrimeList = new boolean[n+1];
    Arrays.fill(isPrimeList, true);

    for(int i=2; i*i<=n; i++){
      if(isPrimeList[i] == false) continue;

      for (int j=i*2; j<=n; j=j+i){
        isPrimeList[j] = false;
      }
    }

    // Print all prime numbers
    for(int i=2; i<=n; i++){
      if(isPrimeList[i]) {
        System.out.print(i + " ");
      }
    }
  }

  public static void main(String args[]){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    // System.out.println(isPrime(n));
    // primeTillN(n);
    isPrimeTillN(n);
  }
}
