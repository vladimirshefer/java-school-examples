package learning.util;

public class MathUtil {

  public static double pow(double base, int power) {
    double result = 1;
    for (int i = 0; i < power; i++) {
      result = result * base;
    }
    return result;
  }

}
