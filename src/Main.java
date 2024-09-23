import composition.Movie;
import composition.TvShows;

public class Main {
    public static void main(String[] args) {
Media media1 = new Media("Need for Speed","PG-13");
Media media2 = new Media("Rush", "R");

Director director1 = new Director("Scott", "Waugh");
Director director2 = new Director("Ron", "Howard");

Actors actors1 = new Actors("Aaron", "Paul");
Actors actors2 = new Actors("Chris", "Hemsworth");

Movie movie1 = new Movie(210, "Action/Crime", 66);
Movie movie2 = new Movie(203,"Sport/Action", 38);

TvShows tvShows1 = new TvShows(3,10);
TvShows tvShows2 = new TvShows(10,14);

            System.out.println(tvShows1.getSeasons());
            System.out.println(tvShows1.getEpisodes());
            System.out.println(tvShows2.getSeasons());
            System.out.println(tvShows2.getEpisodes());

            System.out.println(movie1.getLength());
            System.out.println(movie1.getDescription());
            System.out.println(movie1.getGrossing());
            System.out.println(movie2.getLength());
            System.out.println(movie2.getDescription());
            System.out.println(movie2.getGrossing());

        System.out.println(actors1.getFirstName());
        System.out.println(actors2.getFirstName());
        System.out.println(actors1.getLastName());
        System.out.println(actors2.getLastName());

        System.out.println(director1.getFirstName());
        System.out.println(director2.getFirstName());
        System.out.println(director1.getLastName());
        System.out.println(director2.getLastName());

        System.out.println(media1.getTitle());
        System.out.println(media2.getTitle());
        System.out.println(media1.getRating());
        System.out.println(media2.getRating());
    }
}