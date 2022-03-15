package learning.acmp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    List<Integer> ints = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      ints.add(in.nextInt());
    }

    List<Integer> result = sort(ints);

    for (Integer anInt : result) {
      System.out.print(anInt + " ");
    }

  }

  public static List<Integer> sort(List<Integer> ints) {
    ArrayList<Integer> integers = new ArrayList<>(ints);
    integers.sort(Integer::compare);
    return integers;
  }

}
