package learning.transactions;

import java.util.ArrayList;
import java.util.List;

public class Account {

  private double balance;
  private List<Transaction> history = new ArrayList<>();

  public Account(double balance, String ownerName){
    this.balance = balance;
  }

  public void apply(Transaction transaction) {
    balance += transaction.diff();
    history.add(transaction);
  }

  public double balance() {
    return this.balance;
  }

  public List<Transaction> history(){
    return history;
  }

}
