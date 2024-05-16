import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        // You can assign subclasses to the parent class.
////        Movie starwars = Movie.getMovie("Comedy", "starwars");
////        starwars.watchMovie();
////
////        System.out.println();
////        Movie interstellar = Movie.getMovie("Adventure", "Interstellar");
////        interstellar.watchMovie();
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("\nEnter Movie Type (movie types are " +
                    "A for Adventure, " +
                    "C for Comedy, " +
                    "S For ScienceFiction, " +
                    " Q for Quit." );

            System.out.print("What type of movie would you like? :  ");
            String movieType = sc.nextLine();

            if ("Qq".contains(movieType)){
                break;
            }

            System.out.print("\n What is the title of the movie? : " );
            String movieTitle = sc.nextLine();

            if ("Qq".contains(movieTitle)){
                break;
            }

            Movie userMovie = Movie.getMovie(movieType, movieTitle);
            userMovie.watchMovie();
        }
        System.out.println("Program has been exited.");
    }
}