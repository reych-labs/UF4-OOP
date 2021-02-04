import java.util.Scanner;

public class StudentTest {
    public static void main(String args[]){
        Student st = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix un nom: ");
        st.setName(sc.next());
        //System.out.println(st.getName());
        st.printValues();
    }
}
