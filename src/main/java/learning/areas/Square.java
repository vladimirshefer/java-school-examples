package learning.areas;

public class Square extends Figure {

  private double size;

  public Square(double sizeParameter) {
    this.size = sizeParameter;
  }

  @Override
  public double getArea() {
    return size * size;
  }

}
