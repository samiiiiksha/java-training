/* Here, we'll define a class with abstract methods and concrete methods:
    Step 1: Create a class using abstract keyword.
    Step 2: Define abstract methods (without a body) and concrete methods (with a body).
    Step 3: Create a subclass that extends the abstract class and provides implemention of the abstract class.
    Step 4: Create an object of subclass and call the methods to demonstrate abstract classes.
    Step 5: Run the program to see how abstraction works in Java. */

abstract class Animal {
    // abstract method
    public abstract void makeSound();

    // normal method
    public void sleep() {
        System.out.println("Zzz...");
    }
}

class Dog extends Animal {
    // provide implementation for the abstract method
    public void makeSound() {
        System.out.println("woof woof!");
    }
}

class Bird extends Animal {

    public void makeSound() {
        System.out.println("tweet!!");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();    // statement before = is object of class AND statement after = is constructor of the class
        Bird bird = new Bird();

        dog.makeSound();  // output comes from child class
        dog.sleep();      // output comes from parent class

        bird.makeSound();
        bird.sleep();
    }
}