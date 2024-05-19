package dev.lpa;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

record GroceryItem(String name, String type, int count){
   //Default constructor
    public GroceryItem(String name){
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString(){
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}
public class Main {
    public static void main(String[] args) {
        // Don't assign objects to a base object array as we will not
        // get compile time errors, and it will be much harder to debug
        // our code.
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("Milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 7);
        groceryArray[2] = new GroceryItem("Oranges", "PRODUCE", 13);

        System.out.println(Arrays.toString(groceryArray));

        // This initalization is dangerous as we can add objects
        // of different types to the ArrayList.
        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Rice Cakes");

        System.out.println(objectList);

        //Initialize an ArrayList of type Grocery Item
        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("apples", "PRODUCE", 7));
        groceryList.add(0, new GroceryItem("Oranges", "PRODUCE", 13));
        groceryList.remove(2);
        System.out.println(groceryList);

        String[] items = {"Banana", "Strawberry", "Milk"};

        List<String> list = List.of(items);
        System.out.println(list);
        System.out.println(list.getClass().getName());

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("Salad");

        // Create ArrayList in one line
        ArrayList<String> nextList = new ArrayList<>(
                List.of("Hammam","Rice", "Quinoa")
        );

        System.out.println(nextList);

        System.out.println(groceries.get(2));

        if (nextList.contains("Hammam")){
            System.out.println("List contains Hammam");
        }

        //indexOf gets first index of something in an ArrayList
        //lastIndexOf gets the index of the last occurance of something
        System.out.println(nextList);
        nextList.add("Yogurt");
        nextList.add("Eggs");
        nextList.add("Bubbly");
        nextList.add("Penne Pasta");
        nextList.add("Yogurt");
        nextList.add("Water");
        System.out.println(nextList);

        System.out.println("The first index of yogurt is = " + nextList.indexOf("Yogurt"));
        System.out.println("The last index of yogurt is = "  + nextList.lastIndexOf("Yogurt"));

        //The remove function only removes the first instance of something
        // in the ArrayList.
        //nextList.remove("Yogurt");
        System.out.println(nextList);

        //removeAll("List of Elements") - deletes all elements in the ArrayList that are an element in the Collection
        nextList.removeAll(List.of("Yogurt", "Water"));
        System.out.println("Yogurts and Water Removed = " + nextList);

        //retainAll("List of elements") - keeps al elements except the elements we delete
        nextList.retainAll(List.of("Hammam", "Quinoa", "Bubbly"));
        System.out.println("RetainAll(List) = Remove all except Hammam, Quinoa, Bubbly" + nextList);
        //arraylist.clear() removes all elements of a list
        nextList.clear();
        System.out.println(nextList);
        //arraylist.isEmpty() - returns a boolean whether a list is empty or not
        if (nextList.isEmpty()){
            System.out.println("Empty list of groceries");
        }
        nextList.add("Cake");
        //addAll(Takes a List of Elements) method in Java, appends all elements in the collection to an ArrayList.
        nextList.addAll(List.of("Yogurt", "Bubbly", "Water"));
        System.out.println(nextList);

        //How do we sort an ArrayList?
        // arraylist.sort(Comparator ) - E.X. arraylist.sort(Comparator.naturalOrder()) -
        nextList.sort(Comparator.naturalOrder());
        System.out.println(nextList);

        // Comparators are special types that allow for comparison between objects
        // naturalOrder() helps sort alphabetical String and numbers.
        //or Comparator.reverseOrder() - sorts in reverse Alphabetical order.
        nextList.sort(Comparator.reverseOrder());
        System.out.println(nextList);

        // Also transform an ArrayList to an Array
        // Transform the ArrayList to an Array
        String[] groceryTestArray = nextList.toArray(new String[nextList.size() - 2]);
        System.out.println(Arrays.toString(groceryTestArray));


        ArrayList<Integer> intArrayList = new ArrayList<Integer>();

        intArrayList.add(23);
        intArrayList.add(46);
        System.out.println(intArrayList);

        //You also have containsAll(Takes List of elements) and returns whether all elements
        // In that list are contained within the array.



    }
}
