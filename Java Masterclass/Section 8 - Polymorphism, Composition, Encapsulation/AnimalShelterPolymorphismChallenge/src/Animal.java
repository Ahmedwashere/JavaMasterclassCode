public class Animal {

    private String name;
    private String type;
    private boolean adopted;

    public Animal(){
        this("Default Name ", "No Type");
    }

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String makeSound(){
        return "Animal Sound...";
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void adoptAnimal(){
        adopted = true;
    }
    
    public static Animal getAnimal(String name, String type){
        return switch (type.toUpperCase().charAt(0)) {
            case 'W' -> new Wolf(name, type);
            case 'C' -> new Cat(name, type);
            case 'D' -> new Dog(name, type);
            default -> null;
        };
    }

    public void printAnimal(){
        System.out.printf("{Name= %s, Type= %s}", name, getClass().getSimpleName());
    }
}

class Wolf extends Animal {

    public Wolf(String name, String type) {
        super(name, type);
    }

    @Override
    public String makeSound(){
        return "Awooooooo ".repeat(3);
    }

}

class Cat extends Animal {

    public Cat(String name, String type) {
        super(name, type);
    }

    @Override
    public String makeSound(){
        return "Meeeooow ".repeat(3);
    }

}

class Dog extends Animal {

    public Dog(String name, String type) {
        super(name, type);
    }

    @Override
    public String makeSound(){
        return "Roof ".repeat(3);
    }

}