package learning.transactions;

public class InterestIncome extends Transaction {

  private double rate;
  private String comment;

  public InterestIncome(double rate, String comment){
    this.rate = rate;
    this.comment = comment;
  }

  @Override
  public MoneyAmount diff(MoneyAmount accountBalance) {
    return new MoneyAmount(accountBalance.getAmount() * (rate / 100), accountBalance.getCurrency());
  }

  @Override
  public String toString() {
    return "+" + rate + "% " + comment;
  }


}
