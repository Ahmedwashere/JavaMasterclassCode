public class Dog extends Animal{

    private String earShape;
    private String tailShape;

    public Dog(){
        super("Chihuahua", "Normal Size", 50.0); // This calls the default constructor of the parent class
    }

    public Dog(String type, double weight){
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type,
                // This is a way to do calculations before sending something
                // to the superclass.
                (weight < 15) ? "Small" : ((weight > 50) ? "Large" : "Medium")
                , weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void makeNoise(){
        super.makeNoise();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        System.out.println("Dogs walk, run and wag their tail");
    }
}
