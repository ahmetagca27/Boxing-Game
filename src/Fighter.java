public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    int firstHit;

    // Constructor
    Fighter(String name, int damage, int health, int weight, int dodge, int firstHit) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;

        // Validate and set dodge value
        if (dodge >= 0 && dodge <= 100) {
            this.dodge = dodge;
        } else {
            this.dodge = 0;
        }

        // Validate and set firstHit value
        if (firstHit >= 0 && firstHit <= 100) {
            this.firstHit = firstHit;
        } else {
            this.firstHit = 0;
        }
    }

    // Methods

    int hit(Fighter foe) {
        System.out.println(this.name + " hit " + foe.name + " with " + this.damage + " damage.");
        if (foe.isDodge()) {
            System.out.println("------------------");
            System.out.println(foe.name + " blocked the incoming damage");
            return foe.health;
        }

        if (foe.health - this.damage < 0) {
            return 0;
        }

        return foe.health - this.damage;
    }

    boolean isDodge() {
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }

    boolean isFirstHit() {
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.firstHit;
    }
}