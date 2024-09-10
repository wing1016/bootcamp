package com.example.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;


// !!! In test code base, we define the test class based on "Testing environment"
// This class "SolutionTest" is a testing enviroment
// x represent something like environment,For example, succcessful / fail counting, etc.
// !!! TestInstance is "per method" by default
// default is using >> @TestInstance(TestInstance.Lifecycle.PER_METHOD)

// !!! PER_METHOD
@TestInstance(TestInstance.Lifecycle.PER_METHOD)

public class SolutionPerMethodTest {
  private int x;

  @BeforeAll // !!! before all test cases
  // because only run 1 time, so the init method must be STATIC!!!
  static void init() {
    System.out.println("before all ...");
  }


  @AfterAll // !!! After all test casesSSS
  static void close() {
    System.out.println("after all.....");
  }

  @BeforeEach   // normally use to reset counter / flag ...
  void beforeEach() {
    System.out.println("before Each ...");
  }


  @AfterEach
  void afterEach() {
    System.out.println("after Each.....");
  }


  @Test
  void test() {
    System.out.println("test()");
    this.x++;
    assertEquals(1, this.x);
  }

  @Test
  void test2() {
    System.out.println("test 2 ()");
    this.x++;
    assertEquals(1, this.x);
  }

  // Junit framework generate below code like below
  // !!! st1 is a Test Instance, while st2 is another Test Instance
  // !!! so, it is a "Per method" Testing Environment
  public static void main(String[] args) {
    SolutionPerMethodTest.init();
    SolutionPerMethodTest st1 = new SolutionPerMethodTest();
    st1.test();

    SolutionPerMethodTest st2 = new SolutionPerMethodTest();
    st2.test();
    SolutionPerMethodTest.close();

  }
}
