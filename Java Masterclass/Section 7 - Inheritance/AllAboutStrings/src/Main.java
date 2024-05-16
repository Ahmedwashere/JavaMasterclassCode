public class Main {
    public static void main(String[] args) {

        printInformation("Wyuincharooga Booga");
        String string = "Wyuinoocharga Booga";
        String compareString = "Wyuinoocharga";

        System.out.printf("IndexOf on a String = %d%n", string.indexOf("oo", 3));
        System.out.printf("Last index of char 0 = %d%n", string.lastIndexOf("oo", 10));
        System.out.printf("The String %s starts with the string %s = %b%n", string, compareString, string.startsWith(compareString));


    }

    public static void printInformation(String string){
            int length = string.length();
            System.out.printf("Length = % d, %s%n", length, string);
            System.out.printf("First char = %c %n", string.charAt(0));
            System.out.printf("First of 2nd character = %d%n", string.indexOf(string.charAt(3)));
            System.out.printf("Empty String = %b%n", string.isEmpty());

            System.out.printf("Last Char = %c%n", string.charAt(string.length()-1));


    }
}