package FinalSudentClassImplementation;

public class Student {

  static int yearsExtraToGraduation = 1;
  String firstName;
  String lastName;
  int expectedYearToGraduate;
  double gpa;
  String declaredMajor;

  public Student(String firstName, String lastName, int expectedYearToGraduate, double gpa, String declaredMajor){
      this.firstName = firstName;
      this.lastName = lastName;
      this.expectedYearToGraduate = expectedYearToGraduate;
      this.gpa = gpa;
      this.declaredMajor = declaredMajor;
  }

  public int realistYearToGraduate(){
      return this.expectedYearToGraduate + yearsExtraToGraduation;
  }

}
