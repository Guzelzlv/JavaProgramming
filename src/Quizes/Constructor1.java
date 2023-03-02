package Quizes;

public class Constructor1 {
    public Constructor1(){
        System.out.println("A");
    }
    public  Constructor1(int a){
        this(2.5);
        System.out.println("B");
    }
    public  Constructor1(double c){
        this();
        System.out.println("C");
    }

    public static void main(String[] args) {
        Constructor1 obj = new Constructor1(100);
    }
}
