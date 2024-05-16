public class EnhancedPlayer {
    private String fullName;
    private int healthPercentage;
    private String weapon;

    public EnhancedPlayer(String name, int healthPercentage, String weapon) {
        this.fullName = name;
        this.healthPercentage = (healthPercentage < 1) ? 1 : (healthPercentage > 100) ? 100 : healthPercentage;
        this.weapon = weapon;
    }

    public EnhancedPlayer(String name){
        this(name, 100, "Odachi");
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getHealthPercentage() {
        return healthPercentage;
    }

    public void setHealthPercentage(int healthPercentage) {
        this.healthPercentage = healthPercentage;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void loseHealth(int healthLost){
        healthPercentage -= healthLost;

        if (healthPercentage <= 0){
            System.out.println("Player knocked out of game");
        }
    }

    public int healthRemaining(){
        return healthPercentage;
    }

    public void healthRestored(int extraHealth){
        healthPercentage += extraHealth;
        if (healthPercentage > 100){
            healthPercentage = 100;
            System.out.println("Player restored to 100%");
        }
    }
}
