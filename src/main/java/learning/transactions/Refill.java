package learning.transactions;

public class Refill extends Transaction {

  private double amount;
  private String comment;

  public Refill(double amount, String comment) {
    if (amount < 0) {
      throw new IllegalArgumentException("Sum could not be negative");
    }

    this.amount = amount;
    this.comment = comment;
  }

  @Override
  public double diff() {
    return amount;
  }

  @Override
  public String toString() {
    String sign = "";
    if (amount > 0) {
      sign = "+";
    }
    return sign + amount + " " + comment;
  }

}
