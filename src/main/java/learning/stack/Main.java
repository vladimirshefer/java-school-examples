package learning.stack;

import java.util.Scanner;

public class Main {

  // разворот последовательности чисел
  // 4
  // 2 4 5 8
  // 8 5 4 2
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int ARRAY_SIZE = in.nextInt();
    // 1. inline
    // 2. ООП. - создать класс Стек и пользоваться им как коллекцией

//    int size = 0;
    MyStack stack = new MyStack(ARRAY_SIZE);
    for (int i = 0; i < ARRAY_SIZE; i++) {
      int value = in.nextInt();
      stack.push(value);
      System.out.println("Added element " + value);
    }

    for (int i = 0; i < ARRAY_SIZE; i++) {
      System.out.println(stack.pop());
    }

  }

}
