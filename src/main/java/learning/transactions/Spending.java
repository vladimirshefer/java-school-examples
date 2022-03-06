package learning.transactions;

public class Spending extends Transaction {

  private MoneyAmount moneyAmount;
  private String comment;

  public Spending(MoneyAmount moneyAmount, String comment) {
    this.moneyAmount = moneyAmount;
    this.comment = comment;
  }

  @Override
  public MoneyAmount diff(MoneyAmount accountBalance) {
    return new MoneyAmount(-moneyAmount.getAmount(), moneyAmount.getCurrency());
  }

  public String toString(){
    return -moneyAmount.getAmount() + " " + moneyAmount.getCurrency() + " " + comment;
  }

}
