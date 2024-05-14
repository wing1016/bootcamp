import java.util.Scanner;

public class DemoSwitch {
  
  public static void main(String[] args) {
    
    char grade = 'B';


    switch (grade){

      case 'A':
      System.out.println("The grade is " + grade);
      break; // to break the switch case
      case 'B':
      System.out.println("The grade is " + grade);
      break;
      case 'C':
      System.out.println("The grade is " + grade);
      break;
      default: 
      System.out.println("no grade");

      if (grade == 'A' || grade =='B' || grade =='C') {
        System.out.println("the grade is " + grade);
      } else {
        System.out.println("no grade");
      }

      //if you dont use "break", the ordering of the case couse various result 
        int x= 10;
      switch (grade){
        case 'A':
         x+=10;
         
        case 'B':
        x+=10;
         
        case 'C':
        x+=10;
         
        default: 
        x+=10;
        System.out.println("x=" + x); 

    }


    //Scanner



  }
    Scanner input = new Scanner(System.in);
    System.out.print("Pls input a num");
    int month = input.nextInt(); 
    
    System.out.println("month = " + month);
    System.out.println("month = " + month);

}
}