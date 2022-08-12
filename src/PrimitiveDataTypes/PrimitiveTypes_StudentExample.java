package PrimitiveDataTypes;

// There are 4 main Primitive Data Types
// Boolean, int, double, and char

// The rest are the Reference Types
// String - it is built out of characters

import java.util.Scanner;

public class PrimitiveTypes_StudentExample{

    public static void main(String[] args) {

        int studentAge = 15;
        double studentGPA = 3.45;
        char studentFirstInitial = 'R';
        char studentLastInitial = 'M';
        boolean studentHasPerfectAttendance = true;
        String studentName = "Ray";

        System.out.println(studentName + " " + studentLastInitial);
        System.out.println("The initial is: " + studentName.charAt(0));

        //User Input
        System.out.println("Please enter GPA");
        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();
        System.out.println(studentName + " has a GPA of: " + studentGPA);



    }
}
