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
import org.junit.jupiter.api.ClassOrderer.OrderAnnotation;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//@TestMethodOrder(OrderAnnotation.class)
//sir
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

  public static void main(String[] args) {
    SolutionTestPerClassTest st1 = new SolutionTestPerClassTest();
    SolutionTestPerClassTest.init();
    // st1.init();

    // st1.test();
    // st1.test2();
    // st1.close();
    SolutionTestPerClassTest.close();
  }
}
