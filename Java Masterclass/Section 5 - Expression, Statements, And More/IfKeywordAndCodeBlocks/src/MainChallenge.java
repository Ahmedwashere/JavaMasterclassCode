public class MainChallenge {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        //Arguments are the numbers in the function call itself
        int playerScore = 12;//calculateScore(10000, 8, 200);

        System.out.println("The position of the play with a score of " +
                1500 + " is position: " + calculateHighScorePosition(1500)
        );
        System.out.println("The position of the play with a score of " +
                1000 + " is position: " + calculateHighScorePosition(1000)
        );
        System.out.println("The position of the play with a score of " +
                500 + " is position: " + calculateHighScorePosition(500)
        );
        System.out.println("The position of the play with a score of " +
                100 + " is position: " + calculateHighScorePosition(100)
        );
        System.out.println("The position of the play with a score of " +
                25 + " is position: " + calculateHighScorePosition(25)
        );
    }

    //Parameters in the parenthesis
    public static void calculateScore(int score, int levelCompleted, int bonus, boolean gameOver){
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

    }

    //This is method overloading as we have already defined a function with the name calculateScore
    public static int calculateScore(int score, int levelCompleted, int bonus){

        boolean gameOver = true;
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            return finalScore;
        }


        return Integer.MIN_VALUE;
    }

    public static int calculateHighScorePosition(int score){
        if (score >= 1000){
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } else {
            return 4;
        }

    }
}
