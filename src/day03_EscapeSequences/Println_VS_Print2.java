package day03_EscapeSequences; // It's package name of the class

public class Println_VS_Print2 {

    public static void main(String[] args) { // main method

        System.out.println("Knock Knock"); //first it prints knock knock, then it appends a new line
        System.out.println("Who is this?");

        System.out.println("This is Java");

        System.out.println("___________________________");

        System.out.print("Knock Knock"); //prints knock knock, doesn't append new line
        System.out.print("Who is this?");
        System.out.print("This is Java");

        System.out.println();
        System.out.println("____________________________");

        System.out.println("Hello everyone. How are you all today? Today we will learn Escape Sequences, and next week we will learn Variables. ");

        System.out.println("_______________________________");

        System.out.print("Hello everyone, How are you all today? ");
        System.out.print("Today we will learn Escape Sequences, ");
        System.out.print(", and next week we will learn Variables. ");

        System.out.println();

    }


}


/*
Topics:
       println method
       print method
       Comments
 */