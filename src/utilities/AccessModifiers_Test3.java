package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiers_Test3 {

    public static void main(String[] args) {

       // System.out.println(ProtectedAccessModifier.name1);//default is not visible outside the pachakge because it is default in other package
        //System.out.println(ProtectedAccessModifier.name2);//proteted is not always visible outside the package, onle visible if it subclass
    }
}
