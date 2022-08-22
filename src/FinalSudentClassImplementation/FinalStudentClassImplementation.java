package FinalSudentClassImplementation;

public class FinalStudentClassImplementation {

    public static void main(String[] args) {

        Student student1 = new Student("Ray","Maldonado",2023,3.9,"Engineering");

        System.out.println("Student 1 data is: \n");
        System.out.println("Student 1 name is: " + student1.firstName);
        System.out.println("Student 1 lastname is: " + student1.lastName);
        System.out.println("Student 1 graduation wish year is : " + student1.expectedYearToGraduate);
        System.out.println("Student 1 graduation realist year is : " + student1.realistYearToGraduate());

    }
}
