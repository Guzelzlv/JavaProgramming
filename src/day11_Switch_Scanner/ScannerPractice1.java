package day11_Switch_Scanner;

import  java.util.Scanner;

public class ScannerPractice1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         // 1. Ask the user to enter an integer number
        System.out.println("Enter an integer number:");
        int num1 = input.nextInt();

        // 2. Ask to enter decimal number
        System.out.println("Enter decimal number");
        double num2 = input.nextDouble();

        // 3. enter a word
        System.out.println("Enter a word");
        String str = input.next();

        input.close();
    }

}
