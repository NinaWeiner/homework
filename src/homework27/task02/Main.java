package homework27.task02;

public class Main {

  public static void main(String[] args) {
    Bank_account bankAccount = new Bank_account("123456789");
    System.out.println("номер счета " + bankAccount.getAccountNumber());
    bankAccount.deposit(1000);
    bankAccount.withdraw(500);
  }            // дальше я не знаю... Она шсе равно нработает
}
