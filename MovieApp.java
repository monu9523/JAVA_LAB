import java.util.ArrayList;

class Movie {
    // Instance variables
    private String movieTitle;
    private String genre;
    private int duration; // in minutes
    private double rating;

    // Constructor
    public Movie(String movieTitle, String genre, int duration, double rating) {
        this.movieTitle = movieTitle;
        this.genre = genre;
        this.duration = duration;
        this.rating = rating;
    }

    // Getter for movieTitle
    public String getMovieTitle() {
        return movieTitle;
    }

    // Method to display movie titles of all movies
    public static void displayMovieTitles(ArrayList<Movie> movies) {
        System.out.println("Movie Titles:");
        for (Movie movie : movies) {
            System.out.println(movie.getMovieTitle());
        }
    }

    public static void main(String[] args) {
        // Creating a list of movies
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Inception", "Sci-Fi", 148, 8.8));
        movies.add(new Movie("The Dark Knight", "Action", 152, 9.0));
        movies.add(new Movie("Interstellar", "Sci-Fi", 169, 8.6));

        // Displaying the movie titles
        Movie.displayMovieTitles(movies);
    }
}
