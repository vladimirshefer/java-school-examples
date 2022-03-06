package learning.transactions;

public class ExchangeService {

  public static double exchangeRate(String currencyFrom, String currencyTo) {
    if (currencyFrom.equals(currencyTo)) {
      return  1.0;
    }

    if (currencyFrom.equals("USD") && currencyTo.equals("RUB")) {
      return 75.0;
    }

    if (currencyFrom.equals("RUB") && currencyTo.equals("USD")) {
      return 1 / 75.0;
    }

    // TODO
    return 0;
  }

  public static MoneyAmount exchange(MoneyAmount original, String currencyName) {
    double newAmount = original.getAmount() * exchangeRate(original.getCurrency(), currencyName) ;
    MoneyAmount result = new MoneyAmount(newAmount, currencyName);
    return result;
  }

}
