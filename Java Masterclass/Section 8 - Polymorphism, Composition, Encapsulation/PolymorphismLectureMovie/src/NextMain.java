public class NextMain {
    public static void main(String[] args) {
        Movie userMovie = Movie.getMovie("A", "Jaws");
        userMovie.watchMovie();

        Movie jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        Movie comedy = (Comedy) Movie.getMovie("C", "Airplane");
        comedy.watchMovie();

        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchMovie();

        Object unknownObject = Movie.getMovie("S", "AirBender");
        if (unknownObject.getClass().getSimpleName() == "Adventure"){
            Adventure a = (Adventure) unknownObject;
            a.watchMovie();
        } else if (unknownObject instanceof Comedy){
            Comedy c = (Comedy) unknownObject;
            c.watchMovie();
        } else if (unknownObject instanceof ScienceFiction syfy){
            syfy.watchSyfyFilm();
        }

    }
}
