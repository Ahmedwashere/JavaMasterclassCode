import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

       // LinkedList<String> placesToVisit = new LinkedList<>();

        var placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Camberra");
        System.out.println(placesToVisit);
        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

//        removeElements(placesToVisit);
        System.out.println(placesToVisit);

 //       printItinerary3(placesToVisit);

        testIterator(placesToVisit);




    }

    private static void addMoreElements(LinkedList<String> list){
        list.addFirst("Darwin");
        list.addLast("Hobart");
        list.add("San Francisco");

        //Queue methods
        list.offer("Chicago");
        list.offerFirst("New York");
        list.offerLast("Lightweight");

        //Stack methods
        list.push("New Orleans");
    }

    private static void removeElements(LinkedList<String> list){
        list.remove(4);
        list.remove("Chicago");

        //No argument remove method
        System.out.println(list);
        String s1 = list.remove();
        System.out.println(s1 + " was removed." );

        //Queue removes
        String s2 = list.removeFirst();
        System.out.println(s2 + " was removed first." );

        //Stack removes
        String s3 = list.removeLast();
        System.out.println(s3 + " was removed last." );

        //  Queue/Deque poll methods
        String p1 = list.poll();
        String p2 = list.pollFirst();
        System.out.println("Elements removed: " + p1 + ", " + p2);

        String p3 = list.pollLast();
        System.out.println("Element removed: " + p3);

        //Stack methods for adding elements
        list.push("Ahmed");
        list.push("Rania");
        list.push("Zoozoo");
        String name = list.pop();
    }

    private static void getElements(LinkedList<String> list){
        System.out.println(list.get(2));

        // getFirst()
        // getLast
        // indexOf
        // lastIndexOf

        //  Queue retrieval methods
        // list.element()

        //Stack retrieval methods
        // list.peek()
        // list.peekFirst();
        // list.peekLast();
    }

    public static void printItinerary(LinkedList<String> list){
        System.out.println("Trip starts at = " + list.getFirst());
        System.out.println("Trip ends at = " + list.getLast());

        for (int i = 1; i < list.size(); i++){
            System.out.println("--> From: " + list.get(i-1)+ " to " +
                    list.get(i));
        }
    }

    public static void printItinerary2(LinkedList<String> list){
        System.out.println("Trip starts at = " + list.getFirst());
        String previousTown = list.getFirst();

        for (String town : list){
            System.out.println("--> From: " + previousTown + " to " +
                    town);

            previousTown = town;
        }

        System.out.println("Trip ends at = " + list.getLast());
    }

    public static void printItinerary3(LinkedList<String> list){
        System.out.println("Trip starts at = " + list.getFirst());
        String previousTown = list.getFirst();

        // Overloaded method that takes the index you want the iterator to start at
        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()){
            var town = iterator.next();
            System.out.println("--> From: " + previousTown + " to " +
                    town);

            previousTown = town;
        }

        System.out.println("Trip ends at = " + list.getLast());
    }

    private static void testIterator(LinkedList<String> list){
        // The only method available for iterators when looping is
        // the remove method.
        var iterator = list.iterator();
        while(iterator.hasNext()){

            if (iterator.next().equals("Camberra")) {
                iterator.remove();
            }
        }
        System.out.println(list);

        //list.listIterator would allow add, set, and remove
        // (GIVE ME GOOD NOTES FOR THIS PLEASE)
    }
}