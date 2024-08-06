import javax.naming.InsufficientResourcesException;

public class Account {
  private double balance;

  public Account() {
    this.balance = 0.0d;
  }

  public double getBalance() {
    return this.balance;
  }

  public void setBalance(double bl) {
    this.balance = bl;
  }

  public void credit(double amount) {
    this.balance += amount;
  }

  public void debit(double amt) throws InsufficientBalanceException {
    if (this.balance < amt) {
      // throw new BusinessException(-99, " Not Enough money!! "); //Checked exception
   //   throw new BusinessException(ErrorCode.INSUFF_BAL); // Checked exception
      throw new InsufficientBalanceException();
      // throw new IllegalArgumentException();
    }
    this.balance -= amt;
  }

  public static void main(String[] args)  throws InsufficientBalanceException { //at last,  throw error to JVM .
    Account acc = new Account();
    acc.credit(100);
    try {
      acc.debit(70);
      acc.debit(31);
    } catch (BusinessException e) {
      // System.out.println("Message : " + e.getErrorCode() + " - " + e.getMessage());
      System.out.println(e.codeWithMessage()); // <<- // !!! This is encapsulation !!!
    } finally {     //finally < seldom use now !!
      System.out.println(" this is a section to run wheather exception or not ");
    }
    System.out.println(acc.getBalance()); //
  }
}
