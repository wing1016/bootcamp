// 18 Jun 24

import javax.xml.stream.events.StartDocument;

public class Student extends Person {
    private int studentId;

    // private String name;
    // private int age;

    // Constructor -> the process of constructing student object
    // public Student(String n, int sid, int age){
    public Student(String name, int sid, int age) {

        // 1. Create parent object inside Student object (heap object)
        super(name, age); // this line is calling Parent class constructor ...
        this.studentId = sid;
        // this.name = n;
        // this.age = age;

    }

    // public String getName() {
    // return this.name;
    // }

    public int getStudentId() {
        return this.studentId;
    }

    // public int getAge() {
    // return this.age;
    // }



    public static void main(String[] args)  {
        Student s = new Student("wing", 12, 30);
    }
}
