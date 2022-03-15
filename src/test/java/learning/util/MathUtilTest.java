package learning.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilTest {

  @Test
  public void testPow1() {
    double pow = MathUtil.pow(9, 1);
    assertEquals(9.0, pow, 0.00001);
  }

  @Test
  public void testPow0() {
    double pow = MathUtil.pow(9, 0);
    assertEquals(1.0, pow, 0.00001);
  }

}
