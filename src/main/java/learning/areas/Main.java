package learning.areas;

import static java.util.Arrays.asList;

import java.util.List;
import java.util.Scanner;
import learning.areas.Figure;
import learning.areas.Round;
import learning.areas.Square;
import learning.areas.Triangle;

public class Main {

  // round 4.0
  // square 5.6
  // triangle 6.6 9.0
  public static void main(String[] args) {
    double areasSum = 0;
    do {
      Scanner in = new Scanner(System.in);
      System.out.println("Пожалуйста, введите round / square / triangle");
      System.out.println("Введите exit для выхода.");
      Figure figure;
      String figureType = in.next();
      if (figureType.equals("round")) {
        System.out.println("Введите радиус:");
        double r = in.nextDouble();
        figure = new Round(r);
      } else if (figureType.equals("square")) {
        System.out.println("Введите длину стороны:");
        double size = in.nextDouble();
        figure = new Square(size);
      } else if (figureType.equals("triangle")) {
        System.out.println("Введите 2 длины катетов:");
        double side1 = in.nextDouble();
        double side2 = in.nextDouble();
        figure = new Triangle(side1, side2);
      } else if (figureType.equals("exit")) {
        break;
      } else {
        System.out.println("Неправильное значение!");
        continue;
      }

      areasSum = areasSum + figure.getArea();
      System.out.print("Площадь введенной фигуры = ");
      System.out.println(figure.getArea());
      System.out.print("Сумма площадей всех фигур = ");
      System.out.println(areasSum);
    } while (true);
  }

  // NPE
}
