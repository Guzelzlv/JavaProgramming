package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {

        String str1 = "   25 batch   ";
        str1 = str1.trim();//"batch25"

        System.out.println(str1);
        System.out.println("=================================================");

        String str2 = "Cydeo School";
        int n1 = str2.indexOf("h");//8

        System.out.println("n1 = " + n1);

        int n2 = str2.indexOf("ool");//9
        System.out.println("n2 = " + n2);

        String str3 = "Java Programming language";
        int n3 = str3.indexOf("a ");

        System.out.println("n3 = " + n3);

        int n4 = str3.indexOf("gua");//20
        System.out.println("n4 = " + n4);

        int n5 = str3.lastIndexOf("g");
        System.out.println("n5 = " + n5);

        System.out.println("----------------------------");

        String s = "Java Nova Cava Wawa orange";
        //             012345

        int firstA = s.indexOf("a");
        int lastA = s.lastIndexOf("a");
        int secondA = s.indexOf("a ");
        int thirdA = s.indexOf("a C");
        // int forthA=s.indexOf("ava W");
        //int forthA=s.lastIndexOf("av");
        int forthA = s.indexOf("Ca") + 1;
        // int fifthA = s.lastIndexOf("va") + 1;
        int fifthA = s.lastIndexOf("a W");
        int sixthA = s.lastIndexOf("aw");
        //int seventhA = s.indexOf("a o");
        int seventhA = s.lastIndexOf("a ");


        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("forthA = " + forthA);
        System.out.println("fifthA = " + fifthA);
        System.out.println("sixthA = " + sixthA);
        System.out.println("seventhA = " + seventhA);
    }
}
