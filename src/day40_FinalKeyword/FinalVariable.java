package day40_FinalKeyword;

public class FinalVariable {

    final String birthDay;
    final static String name;

    static {
        name = "EU-10";
    }
    public FinalVariable(String birthday) {
        this.birthDay = birthday;
    }


    public static void main(String[] args) {

       final double pi = 3.14;

        //pi = 4.14; final variables can not be reassigned
        // pi = 5.4;

        final String name;

        name = "Java";
        //   name = "Wooden Spoon";

        System.out.println(name);

        System.out.println("---------------------------------------");

        FinalVariable obj = new FinalVariable("Jan/20");
        //obj.birthDay = "June/01"; // final variables can not be reassigned

        System.out.println(obj.birthDay);

        System.out.println("---------------------------------------");
        //  FinalVariable.name = "Python";

        System.out.println(FinalVariable.name);
    }
}
