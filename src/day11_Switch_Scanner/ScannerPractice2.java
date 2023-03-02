package day11_Switch_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//I love Java

        System.out.println("Enter your first sentence");
        String firstSentence= input.nextLine(); //I

        System.out.println("Enter your second sentence");
        String secondSentence= input.nextLine();

        System.out.println("firstSentence = " + firstSentence);
        System.out.println("secondSentence = " + secondSentence);

        input.close();

    }

}
