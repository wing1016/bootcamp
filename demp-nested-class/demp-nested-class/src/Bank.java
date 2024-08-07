import java.util.LinkedList;
import java.util.List;

public class Bank {
  private List<Account> accounts;
  private String address;

  public Bank() {
    this.accounts = new LinkedList<>();
  }

  public void add(Account account) {
    //this.accounts.add(account);
    accounts.add(account);
  }

  private static Account createAccount(double amount){  //sir
    new Account().credit(amount);
  }

  public static class Account { // private ?
    private static int number = 0;
    private int acctNo;
    private double balance;

    public Account() {
      this.acctNo = ++number;
    }

    public int getAccNo(){
      return this.acctNo;
    }

    public void credit(double amount){
      this.balance += amount;
    }

    public void print(){
      System.out.println(this.balance);
      //this.address; 
      // you cannot access the outer class instance variable ( address ) in static nested class 
    }
  }
}