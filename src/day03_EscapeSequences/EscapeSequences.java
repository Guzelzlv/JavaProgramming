package day03_EscapeSequences;

/*
escape sequences: Must be given with double qoute
\n: starts a new line
\t: paragraph space(tab)
\\: single backward slash
\": double quote
 */
public class EscapeSequences {

    public static void main(String[] args) {

        System.out.println("Java \nPython \nC#");

        System.out.println("________________________________________");

        System.out.println("Hello Cydeo. \nHow are you all today? \nIt's nice to see you all! \nWhat class do we have next week?");

        System.out.println("_________________________________________");

        System.out.println("\tJava is Cool Programming Language");

        System.out.println("_________________________________________");

        System.out.println("/ \\"); //in order to print one backward slash we need to give two backward slashes

        System.out.println("__________________________________________");

        System.out.println("My favorite TV show is \"Game of Thrones\""); //in order to print double quote,we need to use \"

    }


}
