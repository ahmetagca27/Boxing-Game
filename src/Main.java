import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create two fighters
        Fighter Khabib = new Fighter("Khabib", 15, 100, 90, 30, 50);
        Fighter McGregor = new Fighter("McGregor", 10, 90, 100, 30, 50);

        // Create a match between the fighters with weight constraints
        Match match = new Match(Khabib, McGregor, 90, 100);

        // Run the match
        match.run();
    }
}