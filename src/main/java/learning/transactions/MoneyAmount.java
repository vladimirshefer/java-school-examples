package learning.transactions;

public class MoneyAmount {

  private double amount;
  private String currency;

  public MoneyAmount(double amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  public double getAmount(){
    return amount;
  }

  public String getCurrency() {
    return currency;
  }

}
