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
    public String GetDepartment(){
        return Department;
    }
}
