package learning.exceptions;

public class Main {

  public static void main(String[] args) throws Exception {
    // исключения = исключительная ситуация в программе =
    // ситуация, которая не предусмотрена алгоритмом работы программы

//    System.out.println(0.0 / 0.0); // Not A Number

    try {
      ExceptionsPlayground.trowRandomException();
    } catch (IllegalStateException e) {
      System.out.println("некорректное состояние");
      throw new Exception("Не смогли обработать ошибку :(", e);
    } catch (NullPointerException e) {
      System.out.println("нулевой указатель");
      throw new Exception("Не смогли обработать ошибку :(", e);
    } catch (RuntimeException e) {
      System.out.println("внутренняя ошибка");
      throw new Exception("Не смогли обработать ошибку :(", e);
    }

    System.out.println("Successfully completed!");
  }

  public static int div(int divided, int divider) {
    return divided / divider;
  }

  // casting = приведение типов =
  // преобразование значения из одного типа в другой без* изменения значения
  // кастинг бывает
  // 1. примитив в примитив (int -> long, double -> int, ...).
  // 2. объект в объект (String -> Object, Transaction -*> Refill, String -/> Integer)
  // 3. примитив в обертку и наоборот (Integer -> int, int -> Integer)

}
