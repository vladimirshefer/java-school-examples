package learning.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Integer> ints = Arrays.asList(7, 99, 0, -500, 999, 14);

    // отсортировать по возрастанию
    ArrayList<Integer> intsSortedBubble = new ArrayList<>(ints);
    sort(intsSortedBubble);
    System.out.println(intsSortedBubble);

    //
    ints.sort(new NaturalOrderIntegerComparator());
//    ints.sort(Comparator.naturalOrder());
    System.out.println(ints);
  }

  // [-500, 0, 7, 14, 999, 99]
  // i = 4;
  // j = 5;
  //

  public static void sort(List<Integer> list) {
    for (int i = 0; i < list.size() - 1; i++) {
      for (int j = i + 1; j < list.size(); j++) {
        if (list.get(i) > list.get(j)) {
          // swap list elements
          int temp = list.get(i);
          list.set(i, list.get(j));
          list.set(j, temp);

//          int tmp = a[i];
//          a[i] = a[j];
//          a[j] = tmp;
        }
      }
    }
  }

  // 0. поразрядная сортировка.
  //    + супер быстрая O(n)
  //    - работает не на всех данных (не универсальная)
  // 1. пузырьковая сортировка.
  //    + простая в понимании и реализации
  //    - медленная O(n^2) 100 ~ 100*100 = 10^4
  // 2. быстрая сортировка. quick sort = qsort
  // 3. сортировка слиянием. merge sort
  //    - более сложные в реализации и понимании
  //    + быстрые O(n*log(n)) 100 ~ 100*7 = 700
  // 4. тимсорт timsort (java 8+) == qsort + merge sort

  // сложность алгоритма
  // формула, оценивающая зависимость времени работы от входных данных
  // сложность - является оценочной величиной. примерно, а не точной.

}
