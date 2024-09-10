package com.bootcamp.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;


//Child Class should not use @Data, because we control the "callSuper" manually

//@Data

@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)      //!!!! important
@RequiredArgsConstructor
@AllArgsConstructor


public class Employee extends Person1 {
  private int Salary;

  public Employee(String name, int age, int s){
    super(name, age);
    this.Salary = s;
  }
  public static void main(String[] args) {
    Employee e = new Employee(10000);
    System.out.println(e.toString());

    Employee e1 = new Employee("Wing", 20, 10000);
    Employee e2 = new Employee("John", 20, 10000);
    Employee e3 = new Employee("John", 20, 10000);
    System.out.println(e1.equals(e2));
    System.out.println(e2.equals(e3));

    System.out.println(e1);
    //Employee(Salary=10000)    << ( without callSuper = true )
    //Employee(super=Person1(name=Wing, age=20), Salary=10000)    
  }
}
