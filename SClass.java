
import java.util.Scanner;
import static java.lang.System.*;
import java.util.Arrays;

public class SClass {
    private String name;
    private Student[] studentList;

    public SClass() {
        name = "";
        studentList = new Student[0];
    }

    public SClass(String nname, int stuCount) {
        name = nname;
        studentList = new Student[stuCount];
    }

    public void addStudent(int stuNum, Student s) {
        studentList[stuNum] = s;
    }

    public String getClassName() {
        return name;
    }

    public double getStudentAverage(int stuNum) {
        return studentList[stuNum].getAverage();
    }

    public double getStudentAverage(String stuName) {
        for (Student student : studentList) {
            if (student.getName() == stuName) {
                return student.getAverage();
            }
        }
        return 0.0;
    }

    public String getStudentName(int stuNum) {
        return studentList[stuNum].getName();
    }

    public double getClassAverage() {
        double accum = 0.0;
        for (Student student : studentList) {
            accum += student.getAverage();
        }
        return accum / studentList.length;
    }

    public String getStudentWithHighestAverage() {
        Student best = studentList[0];
        for (Student student : studentList) {
            if (student.getAverage() >= best.getAverage()) {
                best = student;
            }
        }
        return best.getName();
    }

    public String getStudentWithLowestAverage() {
        Student worst = studentList[0];
        for (Student student : studentList) {
            if (student.getAverage() <= worst.getAverage()) {
                worst = student;
            }
        }
        return worst.getName();
    }

    public String getFailureList(double failingGrade) {
        String accum = "";
        for (Student student : studentList) {
            if (student.getAverage() <= failingGrade) {
                accum += student.getName() + ", ";
            }
        }
        return accum;
    }

    public String toString() {
        String accum = "";
        for (Student student : studentList) {
            accum += student.toString() + "\t" + student.getAverage() + "\n";
        }
        return accum;
    }
}