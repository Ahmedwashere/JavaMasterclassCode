import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        var shelter = new Shelter();

        while (true){
            System.out.println("Enter a name and animal " +
                    "type for the shelter animal. \n (Valid types 'W' for Wolf, 'C' for Cat, Q to quit).");

            System.out.print("Name = ");
            String name = sc.nextLine();

            if ("Qq".contains(name)){
                break;
            }

            System.out.print("Type = ");
            String type = sc.nextLine();


            if ("Qq".contains(type)){
                break;
            }

            var animal = Animal.getAnimal(name, type);
            if (animal == null){
                System.out.println("Please only include valid types! ");
            } else {
                shelter.addAnimal(animal);
            }
        }

        System.out.println("We are now printing the animals.\n" +  "-".repeat(20));
        shelter.printAnimals();
    }
}