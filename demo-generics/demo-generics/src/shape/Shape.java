package shape;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class Shape {
  abstract double area();

  //Approache 1
  // no new a shape , no use of arttribute> so use static method
  public static double area(List<Shape> shapes) {
    BigDecimal bd = BigDecimal.valueOf(0.0); // BigDecimal always use valueOf!!! dont do BigDecimal( , )
    for (Shape s : shapes) {
      bd = bd.add(BigDecimal.valueOf(s.area()));
    }
    return bd.doubleValue();
  }

  //Approach 2 : Generics   ( level 1 )   !!! useful
  // < T extends Shape >  <- is to describe the parent relationship T only can be Shape
  public static <T extends Shape> double area2(List<T> shapes){       // same as approach 1 totally
    BigDecimal bd = BigDecimal.valueOf(0.0); // BigDecimal always use valueOf!!! dont do BigDecimal( , )
    for (Shape s : shapes) {
      bd = bd.add(BigDecimal.valueOf(s.area()));
    }
    return bd.doubleValue();
  }
  //Question
  //List<Object> vs List<T> ? what is the differencnce

  public static double area3(List<? extends Shape> shapes){

    return -1.0;
  }

  public static void main(String[] args) {
    //Circle vs Shape -> parent relationship
    //List<Shape> vs List<Circle> -> not parent relationship
    List<Shape> shapes = new LinkedList<>();
    shapes.add(new Circle(3.0));
    shapes.add(new Circle(4.2));
    shapes.add(new Square(5.0));
    shapes.add(new Bird()); //?

    // extends do not extends constructor !!!

    System.out.println(Shape.area(shapes)); //  83.69202829163208
    //   rounding usually not do in the method, it will do in main

    System.out.println(Shape.area2(shapes));  // 83.69202829163208

 //   List<? super Shape> shapes2 = new ArrayList<Object>(); 
 List<? extends Shape> shapes2 = new ArrayList<Circle>(); 
  //  shapes2.add(new Circle(3.4));// Not OK, shapes2 may be a circle list or a square list , so add is in red error
  //  shapes2.add(new Square(5.0));   // not Ok bcos during compile time, java dont know
    // the actual type of object reference by shape2

    //<? super >  only can add class above Shape , this mean Object.class
    //<? extends > you can add class below Shape.class

    List<? super Shape> shapes3 = new ArrayList<Object>(); 
   // shapes3 = new ArrayList<Shape>();

    shapes3.add(new Circle(3.4));
    shapes3.add(new Square(3.4));
    shapes3.add(new Bird());
    //During complie time , you decide the list is a list a Object
    //During complie time, we DO NOT know actual type of shapes3

 //   List<Object> objects = new ArrayList<Circle>();   //not ok ( not parent relationship ) 
    Object object = new Circle(2.4); // ok ( Parent relationship )

  }
}
