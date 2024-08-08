public class BusinessException extends Exception {
  // public class BusinessException extends RuntimeException { //<<

  private int code;

  public int getCode() {
    return this.code;
  }

  // This is encapsulation!!!
  public String codeWithMessage() {  
    return "Message : " + this.getMessage() + " :: " + this.code;
  }

  // public BusinessException(int ec, String message) {
  // super(message);
  // this.errorCode = ec;
  // }


  public BusinessException(ErrorCode ec) {
    // super(message);
    super(ec.getMessage());
    this.code = ec.getCode();
  }

  // #sir# //sir version

}
