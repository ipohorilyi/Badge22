package day47_constuctors;

public class Student {
    //NO args constructor
    public Student(){
        System.out.println("NO args constructor");
    }
    public Student(String name){
        System.out.println("name paramater constructor | name : " + name);
    }
    public Student (int age ){
        System.out.println("age of student: " +age);
    }
    public Student (String name, int age){
        System.out.println("name = " + name + ", age = " + age);
    }
}
