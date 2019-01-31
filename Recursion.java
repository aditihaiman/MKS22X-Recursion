import java.util.*;

public class Recursion {

  public static void main(String[] args) {
    // Sqrt Testing //
    System.out.println("16: " + sqrt(16, .001) + "; " + Math.sqrt(16));
    System.out.println("100: " + sqrt(100, .001) + "; " + Math.sqrt(100));
    System.out.println("1: " + sqrt(1, .001) + "; " + Math.sqrt(1));
    System.out.println(".5: " + sqrt(.5, .001) + "; " + Math.sqrt(.5));



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

}
