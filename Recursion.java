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

    //makeAllSums testing //
    System.out.println(makeAllSums(3));

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

  public static int fib(int n){
    if (n < 2) return 1;
    return fibHelp(n, 1, 1);
  }

  private static int fibHelp(int n, int prev, int prev2) {
    if (n==2) return prev+prev2;
    return fibHelp(n-1, prev+prev2, prev);
  }

  public static ArrayList<Integer> makeAllSums(int n){
    ArrayList<Integer> sums = new ArrayList<Integer>();
    return sumsHelp(n, sums, 0);
  }

  private static ArrayList<Integer> sumsHelp(int n, ArrayList<Integer> sums, int psum){
    if (n<=0) {
      sums.add(psum);
      return sums;
    }
    sumsHelp(n-1, sums, psum+n);
    sumsHelp(n-1, sums, psum);
    return sums;
  }

  // private static ArrayList<Integer> addArr(ArrayList<Integer> arr, ArrayList<Integer> arr2) {
  //   for (int x = 0; x<arr2.size(); x++) {
  //     arr.add(arr2.get(x));
  //   }
  //   return arr;
  // }

}
