import java.util.*;

public class Recursion {

  public static void main(String[] args) {
    // Sqrt Testing //
    System.out.println("16: " + sqrt(16, .001) + "; " + Math.sqrt(16));
    System.out.println("100: " + sqrt(100, .001) + "; " + Math.sqrt(100));
    System.out.println("1: " + sqrt(1, .001) + "; " + Math.sqrt(1));
    System.out.println(".5: " + sqrt(.5, .001) + "; " + Math.sqrt(.5));

    // Fib testing //
    System.out.println("Fib 0: " + fib(0));
    System.out.println("Fib 1: " + fib(1));
    System.out.println("Fib 3: " + fib(3));
    System.out.println("Fib 5: " + fib(5));
    System.out.println("Fib 50: " + fib(50));


  }


  public static double sqrt(double n, double tolerance){
    if (n==0) return 0;
    return helperSquareRoot(n, 1, tolerance);
  }

  private static double helperSquareRoot(double n, double guess, double percent) {
    if (Math.abs((n-guess*guess) / n * 100) <= percent) return guess;
    guess = (n / guess + guess) / 2;
    return helperSquareRoot(n, guess, percent);
  }

  public static long fib(long n){
    if (n < 2) return 1;
    return fibHelp(n, 1, 1);
  }

  private static long fibHelp(long n, long prev, long prev2) {
    if (n==2) return prev+prev2;
    return fibHelp(n-1, prev+prev2, prev);
  }

  public static ArrayList<Integer> makeAllSums(int n){
    ArrayList<Integer> sums = new ArrayList<Integer>();
    if (n<0) return sums;
    return sumsHelp(n, sums);
  }

  private static ArrayList<Integer> sumsHelp(int n, ArrayList<Integer> sums){
    sums.add(n);
  }

}
