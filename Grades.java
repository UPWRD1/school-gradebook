//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Grades {
    private Grade[] grades;

    public Grades(double[] list) {
        grades = new Grade[list.length];
        for (int i = 0; i < list.length; i++) {
            grades[i] = new Grade(list[i]);
        }
    }

    public void setGrade(int pos, double grade) {
        grades[pos] = new Grade(grade);
    }

    public double getSum() {
        double accum = 0.0;
        for (Grade grade : grades) {
            accum += grade.getNumericGrade();
        }
        return accum;
    }

    public double getLowGrade() {
        double to_ret = 100.0;
        for (Grade grade : grades) {
            double to_comp = grade.getNumericGrade();
            if (to_comp <= to_ret) {
                to_ret = to_comp; 
            }
        }
        return to_ret;
    }

    public double getHighGrade() {
        double to_ret = 0.0;
        for (Grade grade : grades) {
            double to_comp = grade.getNumericGrade();
            if (to_comp >= to_ret) {
                to_ret = to_comp;
            }
        }
        return to_ret;
    }

    public int getNumGrades() {
        return grades.length;
    }

    public String toString() {
        String accum = "";
        for (Grade grade : grades) {
            accum += grade + " ";
        }
        return accum;
    }
}