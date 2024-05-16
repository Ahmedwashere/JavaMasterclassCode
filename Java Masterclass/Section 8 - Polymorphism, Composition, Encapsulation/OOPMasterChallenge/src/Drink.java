public class Drink {
    private String type;
    private String size;
    private double price;

    public Drink(String type, String size){
        this.type = type;
        this.size = size;
        this.price = switch (size.toUpperCase().charAt(0)){
            case 'S' -> 1.29;
            case 'M' -> 1.59;
            case 'L' -> 1.99;
            default -> {
                System.out.println("Valid Drink Size Not Given. " +
                        "Will Give Small for $1.29");
                yield 1.29;
            }
        };
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }
}
