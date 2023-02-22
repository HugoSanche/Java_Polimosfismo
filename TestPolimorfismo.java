public class TestPolimorfismo {

    public static void main(String[] args) {

       // Movie theMovie = new Adventure("Star Wars");
       // theMovie.watchMovie();
       Movie myMovie=Movie.getMovie("Comedy", "Gato con botas");
        myMovie.watchMovie();
    }
}
