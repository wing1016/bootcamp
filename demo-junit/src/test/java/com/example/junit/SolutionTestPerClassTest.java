package com.example.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

//import org.junit.jupiter.api.ClassOrderer.OrderAnnotation;



// !!! This is "Per Class" testing environment
// It will use one object to call all test methods.

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//@TestMethodOrder(OrderAnnotation.class)
@TestMethodOrder(OrderAnnotation.class)
public class SolutionTestPerClassTest {

  private int x;

  @BeforeAll
  static void init() {
    System.out.println("before all ...");
  }

  @AfterAll
  static void close() {
    System.out.println("after all.....");
  }

  @BeforeEach // normally use to reset counter / flag ...
  void beforeEach() {
    System.out.println("before Each per class...");
  }


  @AfterEach
  void afterEach() {
    System.out.println("after Each  per class.....");
  }

  @Test
  @Order(2)
  void test() {
    System.out.println(" test ");
    this.x++;
    assertEquals(1, this.x);
  }

  @Test
  @Order(1)
  void test2() {
    System.out.println(" test 2 ");
    this.x++;
    assertEquals(2, this.x);
  }

  // For Reference Only.
  public static void main(String[] args) {
    SolutionTestPerClassTest.init();
    SolutionTestPerClassTest st1 = new SolutionTestPerClassTest();
    st1.test2(); // goes first
    st1.test();
    SolutionTestPerClassTest.close();
  }
}
