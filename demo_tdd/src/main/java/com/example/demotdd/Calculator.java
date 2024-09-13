package com.example.demotdd;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

  private List<Integer> integers;

  public Calculator(){
  }

  public Calculator (List<Integer> i){    
    this.integers = i;
  }

  public int sum(){
 //   return 0;
    //sir
   return this.integers.stream().mapToInt(e -> e.intValue()).sum();
  }

}
