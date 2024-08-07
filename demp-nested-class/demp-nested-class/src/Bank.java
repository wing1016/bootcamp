import java.util.LinkedList;
import java.util.List;

public class Bank {
  public List<Account> accounts;

  public Bank(){
    this.accounts = new LinkedList<>();
  }

  public void add(Account acc){
    accounts.add(acc);
  }
  
  public static class Account {   //
    private static int number = 0;
    private int accNo;    
  }

  public Account(){
    this.accNo = ++number;        //sir code
  }

  public static void main(String[] args) {
    
  }
}
