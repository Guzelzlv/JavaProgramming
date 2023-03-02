package day04_Variables;

import javax.lang.model.SourceVersion;

public class SalaryCalculator {

    public static void main(String[]args){
           //hourly Rates, weeklyHours

        int hourlyRates = 65;
        int weeklyHours = 45;
        int numberOfWeeks = 52;

        int salary = hourlyRates*weeklyHours * numberOfWeeks;

        //System.out.println(salary);
        System.out.println("hourlyRates = $" + hourlyRates);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("numberOfWeeks = " + numberOfWeeks);
        System.out.println("salary = $" + salary);

    }
}
