package day19_LoopPractices;

import java.util.Scanner;

public class Practice_5Salary_Calculator {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        while(true){
        System.out.println("How much you make an hour?");
        int hourlyRate= scan.nextInt();
        if (hourlyRate<=0){
            System.err.println("Invalid Entry for Hourly Rate");
            System.exit(0);
        }

        System.out.println("How many hours do you work per week?");
        int weeklyHour= scan.nextInt();
        if (weeklyHour<1 || weeklyHour>144){
            System.err.println("Invalid Entry for Weekly Hours");
            System.exit(0);
        }
        System.out.println("Enter your state tax rate");
        int stateTaxRate= scan.nextInt();

        if (stateTaxRate<0 || stateTaxRate>10){
            System.err.println("Invalid Entry for state tax Rate");
            System.exit(0);
        }

        int GrossSalary = hourlyRate * weeklyHour * 52;

        System.out.println("GrossSalary = " + GrossSalary);


        double federalTax = GrossSalary * 26 / 100;
        System.out.println("federalTax = " + federalTax);

        double stateTax = GrossSalary * stateTaxRate;
        System.out.println("stateTax = " + stateTax);

        double totalTax = stateTax + federalTax;
        System.out.println("totalTax = " + totalTax);

        double netIncome = GrossSalary - totalTax;
        System.out.println("netIncome = " + netIncome);

        System.out.println("Would you like to enter another number? (yes/no)");
        String a= scan.next();

        if( !(a.equalsIgnoreCase("no")|| a.equalsIgnoreCase("yes"))){
            System.err.println("Invalid Entry");
            System.exit(0);
        }

        if (a.equalsIgnoreCase("no")){
            System.out.println("Thank you");
            break;
        }


    }
}}
/*
5. Write a program for the salary calculator
			1. Ask the user "How much you make an hour?"
					If user entered hourlyRate is 0 or negative, terminate the program after
					displaying the error message "Invalid Entry for Hourly Rate"

			2. Ask the user  "How many hours do you work per week?"
					if user entered weeklyHour is less than 1 or greater than 144, terminate
					the program after displaying the error message "Invalid Entry for Weekly Hours"

			3. Ask the user  "Enter your state tax rate"
					if the state tax rate is less than 0% or greater than 10%, terminate the
					 program after displaying the error message "Invalid Entry for state tax Rate"
4. Display:
					1. Gross Salary
					2. Federal Tax (assume that federal tax rate is 26%)
					3. State Tax
					4. Total Tax
					5. Net Income

 */