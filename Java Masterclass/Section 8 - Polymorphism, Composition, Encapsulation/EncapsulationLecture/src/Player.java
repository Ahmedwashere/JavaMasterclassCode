public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int healthLost){
        health -= healthLost;

        if (health <= 0){
            System.out.println("Player knocked out of game");
        }
    }

    public int healthRemaining(){
        return health;
    }

    public void healthRestored(int extraHealth){
       health += extraHealth;
       if (health > 100){
           health = 100;
           System.out.println("Player restored to 100%");
       }
    }
}
