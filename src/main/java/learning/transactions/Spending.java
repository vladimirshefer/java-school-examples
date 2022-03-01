package learning.transactions;

public class Spending extends Transaction {

  private double amount;

  public Spending(double amount, String comment) {
    this.amount = amount;
  }

  @Override
  public double diff() {
    return -amount;
  }

}
