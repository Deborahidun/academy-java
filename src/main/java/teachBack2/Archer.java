package teachBack2;

//Archer class extends the abstract Character class
public class Archer extends Character {

 // Constructor for Archer class
 public Archer(String name, int health) {
     super(name, health);
 }

 // Implementing the abstract attack method
 @Override
 public void attack() {
     System.out.println(name + " shoots an arrow!");
 }

 // Implementing the abstract defend method
 @Override
 public void defend() {
     System.out.println(name + " dodges the attack!");
 }
}