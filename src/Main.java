import composition.Movie;
import composition.TvShows;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
Director director = new Director("Christopher Nolan");
Actors actor1 = new Actors("Leonardo Dicaprio");
Actors actor2 = new Actors("Joseph Gordon-Levitt");

        ArrayList<Actors> cast = new ArrayList<>();
        cast.add(actor1);
        cast.add(actor2);

        Media media = new Media("The Wolf of Wall Street", "R", director, cast);

        Movie movie = new Movie(148, "Comedy/Thriller", 829.3);

        TvShow tvShow = new TvShow("Breaking Bad","MA", new Director("Vince Gilligan"),
                new ArrayList<>(), 5, 62);

        System.out.println("Media Title: " + media.getTitle());
        System.out.println("Media Rating: " + media.getRating());

        System.out.println("Movie Description: " + movie.getDescription());
        System.out.println("Movie Length: " + movie.getLength());

        System.out.println("TV Show Title: " + tvShow.getTitle());
        System.out.println("Tv Show Seasons: " + tvShow.getEpisodes());

        System.out.println("Director Name: " + director.getName());
        System.out.println("Actor Name: " + actor1.getName());
    }
}