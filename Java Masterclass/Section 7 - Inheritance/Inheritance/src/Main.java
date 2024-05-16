public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Generic Animal", "Humongous", 1242.23);
        doAnimalStuff(animal, "Kinda Fast");

        Dog dog = new Dog();
        doAnimalStuff(dog, "Fast");

        Dog yorkie = new Dog("Yorkie", 15);
        doAnimalStuff(yorkie, "fast");

        Dog retriever = new Dog("Retriever", 65, "Floppy", "Swimmer");
        doAnimalStuff(retriever, "fast");

        Fish goldie = new Fish("Goldfish", 0.25, 2, 3);
        doAnimalStuff(goldie, "fast");
    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println(" _ _ _ _ _ _ ");
    }
}