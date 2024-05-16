public class Main {

    // The main method does not rely on an instance of the Main class
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Porsce");
        car.setModel("911 Turbo S");
        car.setDoors(2);
        car.setColor("Black");
        car.setConvertible(false);

        car.describeCar();

    }

}