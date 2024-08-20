public record Book(double price, String author) {
  // record -> like history

  // if a class you no need to use setter , good to use "record"
  // if not setter, you can use constructor to input information

  // with:
  // 1. getter -> price(), author()
  // 2. One default constructor only - all-args constructor
  // 3. attributes are private final
  // 4. Already support equals(), hashCode(), toString()
  // 5. Class is final ( cannot be extended )
  // 6. Support custom instance method
  // 7. Support static method
  // 8. Support static, static final
  // 9. DO NOT support final custom instance variable ( price & author ) 
  // 10. DO NOT sopport custom constructor

  //Constant
  public static final double MIN_PRICE = 10.0;

  public static double calculateFinalPrice(double price, double discount) {
    return price * (1 - 0.2);     // not this.price because this is static method . 
                                //dont have this () , no need to new an object to use this method
  }

  public boolean isTooExpensive() {
    return this.price > 100;
  }

  //All attribute are final
  public void setPrice(double price){
    this.price = price;             //The final field Book.price cannot be assigned
  }
}
