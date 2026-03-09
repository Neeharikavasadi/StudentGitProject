import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student Roll Number: ");
        int roll = sc.nextInt();

        System.out.print("Enter Student Marks: ");
        int marks = sc.nextInt();

        System.out.println("----- Student Details -----");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.println("Marks: " + marks);
    }
}