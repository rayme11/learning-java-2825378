package Functions;

import java.util.Scanner;

public class CalculateSalary {

    public static double calculateYearlySalary(double hoursPerWeek, double salaryPerHour){

        if (hoursPerWeek <= 0 )
        {
            return -1;
        }

        if (salaryPerHour <= 0) {
            return -1;
        }

        double yearlySalary = (hoursPerWeek * salaryPerHour ) * 52;
        return yearlySalary;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter hours per week");
        double hoursPerWeek = input.nextDouble();

        System.out.println("Please enter salary per hour");
        double salaryPerHour = input.nextDouble();


        Double annualSalary = calculateYearlySalary(hoursPerWeek, salaryPerHour);

        if (annualSalary > 1) {
            System.out.println("Your salary per year is: " + annualSalary);
        }
        else {
            System.out.println("Your input was too small to be considered a salary ");
        }


    }
}
