package com.example.junit;

import static org.hamcrest.MatcherAssert.*;
import java.util.List;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

public class DemoHamcrestTest{

  // assertThat !!!

  @Test
  void test(){
    assertThat(App.sum(1, 2), is(equalTo(3)));
    assertThat(App.subtract(1, 2), is(equalTo(-1)));
    // sir

    // sir
  }

  @Test
  void testList(){
    List<String>  strings = List.of("ABC","DEF","XYE");
    assertThat(strings, hasSize(3));
    assertThat(strings, contains("ABC", "DEF", "XYE"));  // !!! contains all with ordering

    assertThat(strings, hasItem("ABC"));
    System.out.println(" //sir ");
    //sir
  }

  public static void main(String[] args) {
    // sir
    // assertSame
    // assertEquals(args, args)
  }
}
