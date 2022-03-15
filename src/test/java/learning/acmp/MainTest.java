package learning.acmp;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class MainTest {

  @Test
  void testSort() {
    List<Integer> original = Arrays.asList(109, 114, 56, 17, 999);
    List<Integer> actual = Main.sort(original);
    List<Integer> expected = Arrays.asList(17, 56, 109, 114, 999);
    assertEquals(expected, actual);
  }

}
