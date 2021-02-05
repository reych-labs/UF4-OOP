package mvm.daw.exemples;

public class Student{
    private int studentId;
    private String name,ssn;
    private double gpa;
    private final int SCHCODE=34958;

    public Student(){
        this.studentId = 0;
        this.name = "";
        this.ssn = "";
        this.gpa = 0.0;
    }//end constructor method

    public Student(int sId, String n){
        this.studentId = sId;
        this.name = n;
    }

    public int getStudentId(){
        return studentId;
    }//end method getStudentId
    public void setStudentId(int x){
        studentId= x;
    }//end method setStudentId

    public String getName(){ return name; }
    public void setName(String n) { name = n;}

    public String getSsn(){ return ssn;}
    public void setSsn(String s) {ssn = s;}

    public double getGpa(){ return gpa;}
    public void setGpa(double g){gpa = g;}

    public void printValues() {
        System.out.println("L'identificador és: "+studentId + " i el seu nom és: "+ name);
    }
}