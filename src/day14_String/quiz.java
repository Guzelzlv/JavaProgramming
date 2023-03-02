package day14_String;

public class quiz {
    public static void main(String[] args) {

        int num=9;
        if (num++==10){
            System.out.println("Hello world"+num);
        }else{
            System.out.println("hello universe"+num);

            int score =0;

            if (score==0){
                score+=50;
            }
if (score!=0){
    score+=50;
}
            System.out.println(score);
        }

        boolean A=true, B=!false;

        if (B){
            System.out.println("B");
        } else if (A) {
            System.out.println("A");

        }else {
            System.out.println("C");
        }

        boolean X=true;
        boolean Y= !X==false;
        boolean Z=Y;

        if (X){
            System.out.println("helo ev");

        }if (Y){
            System.out.println("tod");
        }if (Z){
            System.out.println("we");
        }

        int x=10;
        int y=x++;

        System.out.println(y++ +" "+x++ + " "+y);



    }
}
