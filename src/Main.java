// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Student studentEray;
        Student studentBora;
        Professor professorEnsar;

        //
        studentEray = new Student(1,"Eray Anil Yaman","Computer Engineering");
        studentBora = new Student(2,"Bora Gul","Electrical Electronic Engineering");

        professorEnsar = new Professor("Ensar Gul","Computer Science");

        // Professor Ensar is teaching the different subjects

        var subjectJava = professorEnsar.Teaches("About Inheritance in Java");
        var subjectNetCore = professorEnsar.Teaches("About Polymorphism in .Net");

        // Students are listening the subject

        studentEray.Listens(subjectJava);
        studentBora.Listens(subjectNetCore);

        // Students take notes about the subject which they are in

        var studentErayNotes = studentEray.TakeNotes(subjectJava);
        var studentBoraNotes = studentBora.TakeNotes(subjectNetCore);

        // outputing the notes that we achieve

        System.out.println(studentErayNotes + "Student Name : "+studentEray.GetName());
        System.out.println(studentBoraNotes + "Student Name : "+studentBora.GetName());



    }
}