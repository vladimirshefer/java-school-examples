package learning.transactions;

import java.util.ArrayList;
import java.util.List;

public class Account {

  private MoneyAmount balance;
  private String ownerName;
  private List<Transaction> history = new ArrayList<>();

  public Account(MoneyAmount balance, String ownerName){
    this.balance = balance;
    this.ownerName = ownerName;
  }

  public void apply(Transaction transaction) {
    MoneyAmount diff = ExchangeService.exchange(
        transaction.diff(balance),
        balance.getCurrency()
    );

    balance = new MoneyAmount(
        balance.getAmount() + diff.getAmount(),
        balance.getCurrency()
    );
    history.add(transaction);
  }

  public double balance() {
    return this.balance.getAmount();
  }

  public List<Transaction> history(){
    return history;
  }

}
