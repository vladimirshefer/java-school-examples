package learning.transactions;

public class Spending extends Transaction {

  private double amount;
  private String comment;

  public Spending(double amount, String comment) {
    this.amount = amount;
    this.comment = comment;
  }

  @Override
  public double diff() {
    return -amount;
  }

  public String toString(){
    return -amount + " " + comment;
  }

}
