package bHomeWork_Week3;

public class CharacterIdentity {
    public static void main(String[] args) {

        char givenCharacter='#';

        if (givenCharacter >=48 && givenCharacter<=57){
            System.out.println("Digit");
        } else if (givenCharacter >= 65 && givenCharacter <= 90 ||
                givenCharacter >= 97 && givenCharacter <= 122) {
            System.out.println("Alphabetic Character");
        }else {
            System.out.println("Special Character");
        }


    }
}
/*
4. Create a class called Character Identity, and write a program that can
identify if the given character is a digit or Alphabetic Character(A~Z
or a~Z) or a special character
Ex:
ch = '@'
output:
Special Character
HINT: You may wanna check out the numbers of the
chracters on ASCII table
 */