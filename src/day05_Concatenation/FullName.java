package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String firstName="Zack";
        String lastName="Abd";
        String fullName=firstName + " " + lastName;
        int age = 42;
        String jobTitle = "engineer";
        String companyName = "Chevron";
        double salary=150000;

     // full name of the person is
        System.out.println("Full name of the person is " + fullName +".");

        //___is ___years old
        System.out.println(fullName + " is " + age + " years old. ");

//fullName is jobTitle, works at companyName, and fullName ' salary is salary.
        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName
                + ", and " + fullName + "'s salary is $" + salary + ".");
    }
}
/**
 1. Create a class called FullName.java 2. Declare the following variables:
 1. firstName 2. lastName
 3. Use concatenation to print the full address
 */