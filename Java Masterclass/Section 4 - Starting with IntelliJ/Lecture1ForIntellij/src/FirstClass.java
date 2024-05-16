public class FirstClass {
    // You can type 'psvm' for public static void main etc
    public static void main(String[] args){
        System.out.println("Ahmed was here!");


        boolean isAlien = true;
        int result = 20;

        if(!isAlien || result == 2) {
            System.out.println("Hi there");
        }

        int secondTopScore = 50;
        if((secondTopScore > 40) && (secondTopScore <= 100)){
            System.out.println("Congrats on your top score");
        }

        // The bene
        String value = (7 % 5) == (12 % 5) ? "Haha It is true!" : "Sorry it is false";
        System.out.println(value);

    }
}
