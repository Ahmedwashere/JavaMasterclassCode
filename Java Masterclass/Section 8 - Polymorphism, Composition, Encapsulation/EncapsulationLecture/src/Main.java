public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.name = "Thornfinn";
        player.health = 100;
        player.weapon = "Dagger";

        System.out.println("Health is " + player.health);
        System.out.println("Player name is " + player.name);
        System.out.println("Player weapon is " + player.weapon);

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Health Remaining = " + player.healthRemaining());

        player.health = 200;

        int regain = 23;
        player.healthRestored(regain);

        player.loseHealth(100);

        EnhancedPlayer thor = new EnhancedPlayer("Thor", 250, "Dagger");

        System.out.println("Initial health = " + thor.healthRemaining());


    }
}