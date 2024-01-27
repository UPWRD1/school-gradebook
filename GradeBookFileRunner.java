
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;

public class GradeBookFileRunner {
    public static void main(String args[]) throws Exception {
        out.println("Welcome to the Class Stats program!");
        Scanner file = new Scanner(new File("gradebook.dat"));
        String className = file.nextLine();
        int numStudents = file.nextInt();
        // make a new class
        SClass theClass = new SClass(className, numStudents);
        // read in the information for each student
        for (var i = 0; i < numStudents; i++) {
            file.nextLine();

            // read in the student name
            String studentName = file.nextLine();

            // read in the student's grades
            int studentNumGrades = file.nextInt();

            double[] gradeAccum = new double[studentNumGrades];

            for (var j = 0; j < studentNumGrades; j++) {
                double ne = file.nextDouble();
                gradeAccum[j] = ne;
            }
            // add a new student to the class
            Student ns = new Student(studentName, gradeAccum);
            out.println(ns + "");
            theClass.addStudent(i, ns);
        }
        out.println("\n");
        // print out the class
        out.println("Failure List = " + theClass.getFailureList(70));
        out.println("Highest Average = " +
                theClass.getStudentWithHighestAverage());
        out.println("Lowest Average = " +
                theClass.getStudentWithLowestAverage());
        out.println("Class average = " + theClass.getClassAverage());

    }
}
