package day14_String;

public class StringMethods2 {
    public static void main(String[] args) {

        String str = "Java is fun, i love learning Java.";
        String str2 = str.replace("Java", "Python");//"Python is fun, i love learning Python."

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email = "JohnSmith@yahoo.com";
        email = email.replace("yahoo", "gmail");

        System.out.println("email = " + email);

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python";
        String sentence2 = sentence.replace("Python", ""); //"Java Java   C# C# C++ C++"

        System.out.println("sentence2 = " + sentence2);

        sentence2 = sentence2.replace("   ", " ");
        System.out.println("sentence2 = " + sentence2);


        String s = "Dog Dog Dog Dog Dog Dog";
        s = s.replace("Dog", "Cat");

        System.out.println("s = " + s);

        String s2 = "C# is fun, C# is cool";
        ////s2 = s2.replace("C# is c", "Java is c");
        s2 = s2.replace(" C#", "Java");

        System.out.println("s2 = " + s2);

        String s3 = "Java";
        s3 = s3.replace("a", "e");

        System.out.println(s3);

        System.out.println("-----------------------------------------");

        String result = "Java Java Java";

        //result=result.replace("Java","Python");
        result = result.replaceFirst("Java", "Python");

        String result2 = "C# is fun, C# is cool";
        result2 = result2.replaceFirst("C#", "Java");

        System.out.println(result2);

        System.out.println(result);

        String result3 = "Java";
        result3 = result3.replaceFirst("va", "vo");

        System.out.println(result3);

    }
}
