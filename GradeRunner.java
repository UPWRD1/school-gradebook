
public class GradeRunner {
    
    public static void main( String args[] ) {
        Grade x = new Grade( 75.3 );
        System.out.println(x);

        Grade y = new Grade(33);
        System.out.println(y.getLetterGrade());
    }
}
