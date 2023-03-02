package day32_Constructor;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Zack");

        Employee employee2 = new Employee("Rano", 'F');

        Employee employee3 = new Employee("Guzel", 'F',"SDET");

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

    }
}
