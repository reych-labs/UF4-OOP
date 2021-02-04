public class Student{
    private int studentId;
    private String name,ssn;
    private double gpa;
    private final int SCHCODE=34958;
    public Student(){

    }//end constructor method

    public int getStudentId(){
        return studentId;
    }//end method getStudentId
    public void setStudentId(int x){
        studentId= x;
    }//end method setStudentId
}