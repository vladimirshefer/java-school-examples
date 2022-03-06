package learning.transactions;

public class Refill extends Transaction {

  private MoneyAmount moneyAmount;
  private String comment;

  public Refill(MoneyAmount moneyAmount, String comment) {
    this.moneyAmount = moneyAmount;
    this.comment = comment;
  }

  @Override
  public MoneyAmount diff(MoneyAmount accountBalance) {
    return moneyAmount;
  }

  @Override
  public String toString() {
    String sign = "";
    if (moneyAmount.getAmount() > 0) {
      sign = "+";
    }
    return sign + moneyAmount.getAmount() + " " + moneyAmount.getCurrency() + " " + comment;
  }

}
