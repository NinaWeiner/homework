package homework27.task02;

public class Bank_account {

  private final String accountNumber;
  private double balance;
  public Bank_account(String accountNumber) {
    this.accountNumber = accountNumber;
    this.balance = 0;
  }
  public String getAccountNumber() {
    return accountNumber;
  }
  public double getBalance() {
    return balance;
  }
  /* setter для accountNumber не пишем,что бы нелься было изменить номер счета.
  а вместо сеттера для баланса пишем метода:
   */
  public void deposit(double amount) { // этот метод позволяет положить сумму на счет
    if (amount > 0) {
      balance += amount;
      System.out.println("Сумма " + amount + " зачисленна на счёт ");
    }else {
      System.out.println(" Введите правильную сумму ");
    }
  }
  public void withdraw(double amount) {  // этот метод позволяет снять со счета, если:
    if (amount > 0 && amount <= balance) {      // сумма больше 0, и меньше= балансу
      balance -= amount;
      System.out.println("Сумма " + amount + " снята со счёта ");
    }else {
      System.out.println("Не достаточно средств на счету ");
    }
  }
}
