public class TestPolimorfismo {

    public static void main(String[] args) {

       // Movie theMovie = new Adventure("Star Wars");
       // theMovie.watchMovie();
       Movie myMovie=Movie.getMovie("Comedy", "Gato con botas");
        myMovie.watchMovie();

        //Le tienes que decir implicitamente que es Adventure
        //Pero si cambias de "A" por "C" tronara en runtime
        Adventure movie =(Adventure)Movie.getMovie("A", "Tom Sayer");
        movie.watchMovie();

        Object comedy=Movie.getMovie("C", "Minios");
        //comedy.watchMovie(); //Error
        //Comedy.watchComedy(); //Error
        Movie movieComedy=(Comedy)comedy;
        movieComedy.watchMovie();//OK
        //movieComedy.watchComedy(); //Error watchComedy no esta en Movie

        //Var se introdujo en java 10
        var moon =Movie.getMovie("S", "Life in the moon");
        moon.watchMovie();
        //moon.watchScienceFiction(); Error

        var adventureMovie=new Adventure("Vengadores");
        adventureMovie.watchAdventure();

    }
}
