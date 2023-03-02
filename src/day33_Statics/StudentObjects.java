package day33_Statics;

import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {


        Student student1 = new Student("Aha");

        Student student2 = new Student("Jan",'F');

        Student student3 = new Student("Ahmet", 123);

        Student student4 = new Student("Lana", 345, 'B');

        Student student5 = new Student("Alma",'F',20);

        Student student6 = new Student("Guzel", 'F',38, 777);

        Student student7 = new Student("Sultan",'M',18,333,'A');

        System.out.println(student1==student2);

        Student[] students = {student1,student2,student3,student4,student5,student6,student7};

        System.out.println(Arrays.toString(students));








    }
}
