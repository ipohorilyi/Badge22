package day50_inheritance;

public class InheritanseTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Illia";
        p1.age = 26;

        p1.talk();
        p1.work("SDET");
        p1.walk();

        Student student = new Student();
        student.name = "Ali";
        student.age = 21;
        student.talk();
        student.walk();
        student.work("sdet");
        student.school = "cybertekSchool";
        student.study("java programing");



    }
}
