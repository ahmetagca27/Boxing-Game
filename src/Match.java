public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    // Constructor
    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    // Run the match
    void run() {
        if (isCheck()) {
            // Continue the match while both fighters have health remaining
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("==== NEW ROUND ====");
                if (this.f1.isFirstHit()) {
                    this.f2.health = this.f1.hit(f2);
                    if (isWin())
                        break;
                }
                if (this.f2.isFirstHit()) {
                    this.f1.health = this.f2.hit(f1);
                    if (isWin())
                        break;
                }
                System.out.println(this.f1.name + " Health: " + this.f1.health);
                System.out.println(this.f2.name + " Health: " + this.f2.health);
            }
        } else {
            System.out.println("Weight mismatch.");
        }
    }

    // Check if the weight of both fighters is within the acceptable range
    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) &&
                (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    // Check if a fighter has won the match
    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " wins");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " wins");
            return true;
        }

        return false;
    }
}