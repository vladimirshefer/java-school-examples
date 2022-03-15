package learning.areas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RoundTest {

  @Test
  void testArea() {
    Round round = new Round(10.0);
    assertEquals(314.15926, round.getArea(), 0.0001);
  }

}
