package learning.areas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest {

  @Test
  public void testArea(){
    Square square = new Square(5.0);
    assertEquals(25.0, square.getArea(), 0.0001);
  }

}
