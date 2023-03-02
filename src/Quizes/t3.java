package Quizes;

public class t3 {
    public abstract class Movie{
        public abstract void makeMovie();
    }

    abstract class Comedy extends Movie{
        public abstract void makeJoke();
    }

    abstract class StandUp extends Comedy{
        public void makeJoke(){
            System.out.println("Joke");
        }
    }
}
