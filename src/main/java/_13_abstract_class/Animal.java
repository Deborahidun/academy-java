package _13_abstract_class;

// Used to create something that is generic and we know we won't create an object in it
public abstract class Animal {
    // Abstract method that must be implemented by subclasses
    public abstract void sound();

    // Concrete method that can be used by subclasses
    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}
