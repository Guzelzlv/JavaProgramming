package bHomeWork_Week3;

public class ChooseLanguage {
    public static void main(String[] args) {

        int selection=4;
        String language;

        if (selection==1){
            language="Hello, thanks for your call.";
        } else if (selection==2) {
            language="Hola, gracias para llamar.";
        } else if (selection==3) {
            language="Merhaba, aradiginiz icin tesekkurler.";
        } else if (selection==4) {
            language="Привет, спасибо за ваш звонок.";
        }else {
            language="Merci ,pour votre appel.";}

        System.out.println(language);
    }
}
/*
3. Creat a class called ChooseLanguage, Given an integer variable named
selection that has a number between 1~5, Write a program that can
select the language based on the number that's given in selection and
prints the following message:
for 1: Hello, thanks for your call
for 2: Hola, gracias para llamar
for 3: Merhaba, aradiginiz icin tesekkurler
for 4: Privet, spasibo za vash zvonok
for 5: Merci ,pour votre appel
 */