import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

enum Geometry {
    POINT, LINE
}

// I could have made an Abstract Class for Point and Line.
// This would ensure easy adding and organization for future map icons.
public class Main {
    public static void main(String[] args) {

        // Make Generic Class First
        Layer locations = new Layer<Mappable>();

        locations.addMapItems(new River("Nile River", new double[][] {
                {12.4, 45.3},
                {42.5, 24.65}
                }),
                new Mountain("Mt. Everest", new double[] {
                -39.2, 45.6
                }));


        locations.renderLayer();
    }
}

interface Mappable {
    String render();
}

// Render should return Render - Name of Place as GEOSHAPE (coordinates)

class Layer<T extends Mappable>{
    private List<T> places = new ArrayList<>();

    public Layer(T place) {
        this.places.add(place);
    }

    // Default constructor
    public Layer(){

    }

    public List<T> getPlaces(){
        return places;
    }

    public void renderLayer(){
        System.out.println("-".repeat(30));
        for(T t : places){
            System.out.print(t.render());
        }
        System.out.println("-".repeat(30));
    }

    public void addMapItem(T t){
        if (!places.contains(t)){
            places.add(t);
        }
    }

    public void addMapItems(T... t){
        places.addAll(Arrays.asList(t));
    }

}

class River implements Mappable{
    private String name;
    private double[][] coordinates;

    public River(String name, double[][] coordinates) {
        this.name = name;
        this.coordinates = coordinates;
    }

    public String getCoordinates(){
        return Arrays.deepToString(coordinates);
    }

    @Override
    public String render() {
        return """
                Render %s as %s (%s)
                """.formatted(name, Geometry.LINE, getCoordinates());
    }
}

class Mountain implements Mappable{
    private String name;
    private double[] coordinates;

    public Mountain(Mappable place, String name, double[] coordinates) {
        this.name = name;
        this.coordinates = coordinates;
    }

    // Automatically calls default constructor
    public Mountain(String name, double[] coordinates) {
        this.name = name;
        this.coordinates = coordinates;
    }

    public String getCoordinates(){
        return Arrays.toString(coordinates);
    }

    @Override
    public String render(){
        return """
                Render %s as %s (%s)
                """.formatted(name, Geometry.POINT, getCoordinates());
    }
}


