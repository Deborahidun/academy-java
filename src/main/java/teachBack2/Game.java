package teachBack2;

public class Game {

	public static void main(String[] args) {
		// Create a Warrior and an Archer
        Warrior warrior = new Warrior("Thor", 100);
        Archer archer = new Archer("Legolas", 80);

        // Call methods on the Warrior
        warrior.move();
        warrior.attack();
        warrior.defend();

        System.out.println(); // Print a newline for better readability

        // Call methods on the Archer
        archer.move();
        archer.attack();
        archer.defend();
    }
}
