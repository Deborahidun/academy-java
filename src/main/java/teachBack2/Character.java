package teachBack2;


//Abstract class representing a general Character
public abstract class Character {

	    protected String name;
	    protected int health;

	    // Constructor for the Character class
	    public Character(String name, int health) {
	        this.name = name;
	        this.health = health;
	    }

	    // Abstract methods that must be implemented by subclasses
	    public abstract void attack();
	    public abstract void defend();

	    // Common method shared by all characters
	    public void move() {
	        System.out.println(name + " is moving.");
	    }
	}

