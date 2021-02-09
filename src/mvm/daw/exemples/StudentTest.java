package mvm.daw.exemples;

import java.util.Scanner;

public class StudentTest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix l'identificador de l'alumne: ");
        int ssn = sc.nextInt();
        System.out.println("Introdueix un nom: ");
        String name = sc.next();
        Student st = new Student(ssn, name);
        st.printValues();
    }
}
