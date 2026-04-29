package RoughWork;
public class BankAccount {
  private String owner ;
  private  double balance;

  BankAccount(String owner, double balance) {
    this.owner = owner;
    this.balance = balance;
  }
  
  
  void withdraw(double amount) {
    if (amount > balance) {
      System.out.println("Insufficient funds. Withdrawal denied.");
    } else {
      balance -= amount;
      System.out.println("Withdrawal successful. New balance: $" + balance);
    }
  }

  void deposit(double amount) {
    balance += amount;
    System.out.println("Deposit successful. New balance: $" + balance);
  }

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }


  


  
}
