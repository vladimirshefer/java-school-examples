package learning.transactions;

public class Refill extends Transaction {

  private double amount;

  public Refill(double amount, String comment) {
    this.amount = amount;
  }

  @Override
  public double diff() {
    return amount;
  }

}
