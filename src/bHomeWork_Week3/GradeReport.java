package bHomeWork_Week3;

/*
       grade report====> A,B,C,D,F
  */
public class GradeReport {
    public static void main(String[] args) {
        int score = 61;
        char grade;

        if (score >= 80 && score <= 100){
            grade='A';
        } else if (score>=70 && score<=79) {
            grade='B';
        } else if (score>=60 && score<=69) {
            grade='C';
        } else if (score>=50 && score<=59) {
            grade='D';
        }else {
            grade = 'F';
        }
            System.out.println("grade = " + grade);

    }
}
