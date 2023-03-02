package day09_IfStatements;

public class PosNegZero {
    public static void main(String[] args) {

        int n = 100;
        if (n > 0) {
            System.out.println("Positive");
        }

        if (n < 0) {
            System.out.println("Negative");
        }

        if (n == 0) {
            System.out.println("Zero");
        }

        System.out.println("=====================================");

        boolean positive = n > 0,
                negative = n < 0;

        if (positive) {
            System.out.println("Positive");
        } else if (negative) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");

        }
        System.out.println("---------------------------------");
// these statements not true

        if(positive){
            System.out.println("Positive");
        }

        if(negative){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }

        // if & else statement we can NEVER apply for the tasks that requires more than two condition!!

    }
}
