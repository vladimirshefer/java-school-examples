package learning.transactions;

import java.util.List;

public class Main {

  public static void main(String[] args) {
    Transaction salary = new Refill(100_000.0, "Зарплата");
    Transaction buyCar = new Spending(300_000.0, "Купил машину");

    Account myRubAccount = new Account(1_000_000.0, "Vladimir Shefer");

    myRubAccount.apply(salary);
    myRubAccount.apply(buyCar);

    double balance = myRubAccount.balance();
    System.out.println(balance);
    List<Transaction> history = myRubAccount.history();
    System.out.println(history);

    // 1. историю чтобы вывести, ее нужно где-то хранить.
    // 2. переопределить toString

  }

  // 800000.0
  // [
  // "+100000.0 Зарплата", "-300000.0 Купил машину"
  // ]

}
