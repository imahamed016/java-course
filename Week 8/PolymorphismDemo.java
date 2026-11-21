// This program demonstrates Polymorphism ("Many Forms").
// It shows how a superclass reference can point to a subclass object.

// Superclass
class Animal {



public void makeSound() {
// Default sound for a generic animal.
System.out.println("Some generic animal sound");
}
}

// Subclass 1
class Dog extends Animal {
// Overriding the makeSound method.
@Override
public void makeSound() {
// Specific sound for a Dog.
System.out.println("Woof! Woof!");
}
}

// Subclass 2
class Cat extends Animal {
// Overriding the makeSound method.
@Override
public void makeSound() {
// Specific sound for a Cat.
System.out.println("Meow!");
}
}


// Subclass 3
class Cow extends Animal {
// Overriding the makeSound method.
@Override
public void makeSound() {
// Specific sound for a Cow.
System.out.println("Moo!");
}
}

public class PolymorphismDemo {
public static void main(String[] args) {

// We create an array of type 'Animal'.
// This array can hold Dogs, Cats, and Cows because they are all Animals.
Animal[] myAnimals = new Animal[3];

// Upcasting: Assigning a subclass object to a superclass reference.
myAnimals[0] = new Dog(); // A Dog IS-AN Animal.
myAnimals[1] = new Cat(); // A Cat IS-AN Animal.
myAnimals[2] = new Cow(); // A Cow IS-AN Animal.

System.out.println("=== ANIMAL SOUNDS ===");

// Loop through the array.
for (int i = 0; i < myAnimals.length; i++) {



// This is Polymorphism in action!
// The JVM looks at the ACTUAL object type (Dog, Cat, Cow) at runtime,
// not the reference type (Animal), and calls the correct method.
myAnimals[i].makeSound();
}
}
}