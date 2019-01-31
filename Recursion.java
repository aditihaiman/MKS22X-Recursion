import java.util.*;

public class Recursion {

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
