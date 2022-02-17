package learning.areas;



public class Round extends Figure {

  private double r;

  public Round(double radius){
    this.r = radius;
  }

  public double getArea(){
    return Math.PI * r * r;
  }

}
