import java.util.*;

public class Main {
    public static void Main(String args[]){
        Student student1;
        Student student2;

        student1 = new Student(1,"Eray Anil Yaman","Computer Engineering");
        student2 = new Student(2,"Bora Gul","Electrical Electronic Engineering");

        System.out.println(student1.GetName());
        System.out.println(student1.GetDepartment());


        System.out.println(student2.GetName());
        System.out.println(student2.GetDepartment());
    }
}
