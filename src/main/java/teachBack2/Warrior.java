package teachBack2;

//Warrior class extends the abstract Character class
public class Warrior extends Character {

 // Constructor for Warrior class
 public Warrior(String name, int health) {
     super(name, health);
 }

 // Implementing the abstract attack method
 @Override
 public void attack() {
     System.out.println(name + " attacks with a sword!");
 }

 // Implementing the abstract defend method
 @Override
 public void defend() {
     System.out.println(name + " blocks with a shield!");
 }
}