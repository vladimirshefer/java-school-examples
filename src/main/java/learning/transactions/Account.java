package learning.transactions;

import java.util.List;

public class Account {

  private double balance;

  public Account(double balance, String ownerName){
    this.balance = balance;
  }

  public void apply(Transaction transaction) {
    balance += transaction.diff();
  }

  public double balance() {
    return this.balance;
  }

  public List<Transaction> history(){
    return null;
  }

}
