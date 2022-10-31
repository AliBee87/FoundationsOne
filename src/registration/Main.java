package registration;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner input = new Scanner (System.in);

        System.out.println("Student Registration Form\n");
        System.out.print("Enter first name: ");
        String firstName = input.nextLine();
        student.setFirstName(firstName);
        System.out.print("Enter last name: ");
        String lastName = input.nextLine();
        student.setLastName(lastName);
        System.out.print("Enter year of birth: ");
        String birthYear = input.next();
        student.setYear(Integer.parseInt(birthYear));


        System.out.println("\nWelcome " + student.getFirstName() + student.getLastName() + "!");
        System.out.println("Your registration is complete.");
        System.out.println("Your temporary password is: " + student.getFirstName() + "*" + student.getYear());



    }
}