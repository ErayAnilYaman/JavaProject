public class Professor {
    private String Name;
    private String Department;
    public Professor(String ProfessorName,String ProfessorDepartment) {
        this.Department = ProfessorDepartment;
        this.Name = ProfessorName;
    }

    public String Teaches(String subject){
        return subject;
    }



}