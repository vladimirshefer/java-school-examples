package learning.transactions;

import java.util.List;

public class Main {

  public static void main(String[] args) {

    Transaction salary = new Refill(new MoneyAmount(100_000.0, "RUB"), "Зарплата");
    Transaction buyCar = new Spending(new MoneyAmount(300_000.0, "RUB"), "Купил машину");
    Transaction interest = new InterestIncome(10.0, "Проценты по счету");

    Account myRubAccount = new Account(new MoneyAmount(1_000_000.0, "RUB"), "Vladimir Shefer");

    myRubAccount.apply(salary);
    myRubAccount.apply(buyCar);
    myRubAccount.apply(interest);

    Transaction rentHotel = new Spending(new MoneyAmount(1000.0, "USD"), "оплата отеля в отпуске");
    myRubAccount.apply(rentHotel);

    double balance = myRubAccount.balance();
    System.out.println(balance);
    List<Transaction> history = myRubAccount.history();
    System.out.println(history);

    // 1. историю чтобы вывести, ее нужно где-то хранить.
    // 2. переопределить toString

  }

  // 75.0
  // 880000.0
  // [
  // "+100000.0 Зарплата", "-300000.0 Купил машину", "+80000.0 Проценты по счету"
  // ]

}
