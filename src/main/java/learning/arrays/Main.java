package learning.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // дано число ARRAY_SIZE, K
    // K строчек. каждая строчка - пара чисел. Индекс (1..ARRAY_SIZE) и значение
    // вставить все значения в соответствующие индексы
    // после чего посчитать сумму всех элементов массива

    // 5 3
    // 3 3
    // 4 5
    // 3 1
    // [0, 0, 0, 1, 5] -> 6
    Scanner in = new Scanner(System.in);
    int ARRAY_SIZE = in.nextInt();
    int k = in.nextInt();
    int [] numbers = new int[ARRAY_SIZE];
    for (int i = 0; i < k; i++) {
//      numbers[q] = h;
      int q = in.nextInt();
      int h = in.nextInt();
      numbers[q] = h;
    }

    int sum = 0;
    for (int i = 0; i < ARRAY_SIZE; i++) {
      sum = sum + numbers[i];
    }

    System.out.println(sum);

    // 2 типа переменных
    // 1 - примитивный
    // 2 - ссылочный // хранит номер ячейки паямяти в компьютере, где лежат данные

  }

}
