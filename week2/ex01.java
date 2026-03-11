
import java.util.Scanner;

class ex01 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("How many students are there?");

        String studentsInput = myObj.nextLine();
        int numStudents = Integer.parseInt(studentsInput);
        for (int i = 1; i <= numStudents; i++) {
            System.out.println("How many marks does student " + i + " have?");
            String marksInput = myObj.nextLine();
            int marks = Integer.parseInt(marksInput);
            System.out.println("How many subjects does student " + i + " have?");
            String subjectsInput = myObj.nextLine();
            int subjects = Integer.parseInt(subjectsInput);
            double average = (double) marks / subjects;
            System.out.println("The average marks for student " + i + " is: " + average);
            if (average >= 75) {
                System.out.println("Distinction");
            } else if (average >= 50) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }
            System.out.println("The student number is " + (i % 2 == 0 ? "even" : "odd"));
        }
    }

}
