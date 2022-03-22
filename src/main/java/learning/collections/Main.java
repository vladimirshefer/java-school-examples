package learning.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

  public static void main(String[] args) {

    // Список: List:
    // упорядоченные
    // неотсотрированные
    // имеют размер

    // Set: Множество: Сет:
    // неупорядоченный
    // неотсортированный (хотя может быть и отсортированным)
    // хранит только уникальные значения.

//    Scanner in = new Scanner(System.in);
//    int n = 100;
//    Set<Integer> integers = new TreeSet<>();
//    for (int i = 0; i < n; i++) {
//      int randomInt = ThreadLocalRandom.current().nextInt();
//      integers.add(randomInt);
//    }
//    System.out.println(integers);

    // напечатать все уникальные числа которые были поданы на вход
    // пример:  1 3 55 55 3 -> 1 3 55

    // 7 3 5 5 5
    // [1 3 55 55 3]  // integers

    // Map, Словарь, Ассоциативный массив
    // Мама -     родитель женского пола
    // ^ ключ key  ^ значение value

    Map<String, String> dict = new HashMap<>();
    dict.put("Мама", "Родитель женского пола");
    dict.put("Мама", "Родитель пола");
    dict.put("Папа", "Родитель мужского пола");
    System.out.println(dict.get("Мама"));
    System.out.println(dict.get("Папа"));
    System.out.println(dict.get("Бабушка"));

    // {
    //  "Мама": "Родитель женского пола",
    //  "Папа": "Родитель мужского пола"
    // }

  }

  private static List<Integer> getUniqueIntegers(List<Integer> integers) {
    List<Integer> uniqueIntegers = new ArrayList<>();
    for (int i = 0; i < integers.size(); i++) {
      Integer integer = integers.get(i);
      boolean alreadyContains = false;
      for (int j = 0; j < uniqueIntegers.size(); j++) {
        Integer uniqueInteger = uniqueIntegers.get(j);
        if (uniqueInteger.equals(integer)) {
          alreadyContains = true;
          break;
        }
      }

      if (!alreadyContains) {
        uniqueIntegers.add(integer);
      }
    }
    return uniqueIntegers;
  }

}
