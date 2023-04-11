import javax.naming.Name;

public class Student {
    private int StudentId;
    private String Name;
    private String Department;

    public Student(int StudentId,String Name,String Department){
        this.StudentId = StudentId;
        this.Department = Department;
        this.Name = Name;
    }
    public String GetName(){
        return Name;
    }
    public void Listens(String subject){
        System.out.println("Student listens the subject :" + subject);

    }
    public String TakeNotes(String note){

        return "My note : " + note;
    }
}
