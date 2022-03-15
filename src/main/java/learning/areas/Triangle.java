package learning.areas;

public class Triangle extends Figure {

  private final double side1;
  private final double side2;

  public Triangle(
      double side1Parameter,
      double side2Parameter
  ) {
    this.side1 = side1Parameter;
    this.side2 = side2Parameter;
  }

  @Override
  public double getArea() {
    return side1 * side2 / 2;
  }

}
