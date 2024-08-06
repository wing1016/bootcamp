public class BusinessException extends Exception {
 // public class BusinessException extends RuntimeException {   //<<

  private ErrorCode code;

  public ErrorCode getErrorCode() {
    return this.code;
  }

  //This is encapsulation!!!
  public String codeWithMessage() {   //sir code
    return "Message : " + this.getMessage() + " :: " + this.code;
  }

  // public BusinessException(int ec, String message) {
  //   super(message);
  //   this.errorCode = ec;
  // }


  public BusinessException(ErrorCode ec) {
  //  super(message);
    this.code = ec;
  }

  // #sir //sir version

}
