/*
 * parent class - Animal
 */
class Animal {
    String name;

    /*
     * constructor for the Animal class
     */
    Animal(String name) {
        this.name = name;
    }

    /*
     * method for Animal class
     */
    void speak() {
        System.out.println(this.name + " makes a noise.");
    }
}

/*
 * Dog class - inherit from animal
 */
class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        super(name); 
        this.breed = breed; 
    }

    @Override
    void speak() {
        System.out.println(this.name + " barks.");
    }

    /*
     * method to describe the Dog
     */
    void describe() {
        super.speak();
        System.out.println(this.name + " is a " + this.breed + ".");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        /*
         * creating an instance of the Dog class
         */
        Dog myDog = new Dog("Buddy", "Golden Retriever");

        myDog.speak();
        myDog.describe();
    }
}
