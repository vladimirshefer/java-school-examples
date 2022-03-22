package learning.exceptions;

import java.util.concurrent.ThreadLocalRandom;

public class ExceptionsPlayground {

  public static void trowRandomException() {
    int exceptionNumber = ThreadLocalRandom.current().nextInt(3);
    if (exceptionNumber == 0) {
      throw new RuntimeException("Runtime Exception happened!");
    }
    if (exceptionNumber == 1) {
      throw new IllegalStateException("Illegal State happened!");
    }
    if (exceptionNumber == 2) {
      throw new NullPointerException("Null Pointer happened!");
    }
  }



}
