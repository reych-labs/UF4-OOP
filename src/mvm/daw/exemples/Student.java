package mvm.daw.exemples;

public class Student extends Person{
    private int studentId;
    private String ssn;
    private double gpa;
    private final int SCHCODE=34958;

      public Student(int sId, String n){
          super(n);
          this.studentId = sId;

    }

    public int getStudentId(){
        return studentId;
    }//end method getStudentId
    public void setStudentId(int x){
        studentId= x;
    }//end method setStudentId

    public String getSsn(){ return ssn;}
    public void setSsn(String s) {ssn = s;}

    public double getGpa(){ return gpa;}
    public void setGpa(double g){gpa = g;}

    public void printValues() {
        System.out.println("L'identificador és: "+studentId + " i el seu nom és: "+ super.name);
    }
}