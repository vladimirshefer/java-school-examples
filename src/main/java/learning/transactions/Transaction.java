package learning.transactions;

public abstract class Transaction {

  public abstract MoneyAmount diff(MoneyAmount accountBalance);

}
