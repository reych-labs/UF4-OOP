package daw.activitats.geometria;

import java.util.Scanner;

public class BirthdayTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix la teva data de naixement en format mm/dd/yyyy");
        String birthday = sc.next();
        Birthday b = new Birthday(birthday.substring(0, 2), birthday.substring(3, 5), birthday.substring(6, 10));
        System.out.println(b);
    }
}
