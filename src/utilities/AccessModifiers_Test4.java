package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;
//                               now it is subclass
public class AccessModifiers_Test4 extends ProtectedAccessModifier {

    public static void main(String[] args) {

      //  System.out.println(AccessModifiers_Task4.name1);//DEFAULT is not visible outside the package
        System.out.println(AccessModifiers_Test4.name2); // PROTECTED-is visible outside package in subclass only

       // AccessModifiers_Test4.method1(); // DEFAULT
        AccessModifiers_Test4.method2();

    }
}
