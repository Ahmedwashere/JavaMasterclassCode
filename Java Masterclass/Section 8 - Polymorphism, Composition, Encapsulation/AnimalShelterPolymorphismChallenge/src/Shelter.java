import java.util.ArrayList;

public class Shelter {

    private ArrayList<Animal> animals;

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public Shelter(){
        this.animals = new ArrayList<Animal>();
    }

    public void removeAnimal(String name, String type){
        for(int i = 0; i < animals.size(); i++){
            String currentName = animals.get(i).getName();
            String currentType = animals.get(i).getType();

            if (currentName == name && currentType == type){
                animals.remove(i);
                return;
            }
        }

        System.out.printf("No Animal with {Name= %s, Type= %s}", name, type);
    }

    public void printAnimals(){
        for(Animal a : animals){
            System.out.printf("%s - %s -> %s", a.getType(), a.getName(), a.makeSound());
        }
    }

    public Animal findAnimal(String name, String type){
        for (Animal a : animals){
            if (a.getName() == name && a.getType() == type){
                return a;
            }
        }
        System.out.println("No animal is was found. Returning an empty animal.");
        return null;
    }
}
