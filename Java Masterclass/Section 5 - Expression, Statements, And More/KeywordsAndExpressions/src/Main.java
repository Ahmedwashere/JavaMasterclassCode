public class Main {
    public static void main(String[] args) {
        // int int = 5; This is not a valid initalization of an integer
        int int2 = 5; // This is a valid identifier

        // double [kilometers = (100 * 1.609344)]; Everything between the [ ] is part of the expression

        int highScore = 50;

        if (highScore > 25){

            highScore = 1000 + highScore;
        }

        int health = 100;

        if ((health < 25) && (highScore > 100)){
            highScore = highScore - 1000;
        }

    }
}