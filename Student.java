public class Student {
    private String myName;
    private Grades myGrades;

    public Student(String name, double[] gradeList) {
        myName = name;
        myGrades = new Grades(gradeList);
    }

    public void setGrade(int spot, double grade) {
        myGrades.setGrade(spot, grade);
    }

    public String getName() {
        return myName;
    }

    public int getNumGrades() {
        return myGrades.getNumGrades();
    }

    public double getSum() {
        return myGrades.getSum();
    }

    public double getAverage() {
        int len = myGrades.getNumGrades();
        double sum = myGrades.getSum();
        return sum / len;
    }

    public double getAverageMinusLow() {
        int len = myGrades.getNumGrades();
        double sum = myGrades.getSum();
        double low = myGrades.getLowGrade();
        double avg = (sum - low) / (len - 1);
        return avg;
    }

    public double getHighGrade() {
        return myGrades.getHighGrade();
    }

    public double getLowGrade() {
        return myGrades.getLowGrade();
    }

    public String toString() {
        return myName + " " + myGrades;
    }
}
