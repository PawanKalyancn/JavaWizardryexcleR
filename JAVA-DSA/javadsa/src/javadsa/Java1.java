package javadsa;

//Class and Object
class Animal {
 String name;
 int age;

 void eat() {
     System.out.println(name + " is eating.");
 }

 void makeSound() {	
}

void sleep() {
     System.out.println(name + " is sleeping.");
 }
}

//Class constructor
class Dog extends Animal {
 Dog(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Polymorphism
 void makeSound() {
     System.out.println(name + " barks.");
 }

 // Method overloading
 void makeSound(String sound) {
     System.out.println(name + " makes a " + sound + " sound.");
 }
}

//Inheritance
class Cat extends Animal {
 Cat(String name, int age) {
     this.name = name;
     this.age = age;
 }

 @Override
 // Method overriding
 void makeSound() {
     System.out.println(name + " meows.");
 }
}

//Interface
interface Swimmer {
 void swim();
}

//Abstract class
abstract class Fish extends Animal implements Swimmer {
 Fish(String name, int age) {
     this.name = name;
     this.age = age;
 }
}

//Generalization and Specialization
class Shark extends Fish {
 Shark(String name, int age) {
     super(name, age);
 }

 @Override
 public void swim() {
     System.out.println(name + " is swimming fast.");
 }
}

//Composition and Aggregation
class Zoo {
 private Animal[] animals;

 Zoo(Animal[] animals) {
     this.animals = animals;
 }

 void performActivities() {
     for (Animal animal : animals) {
    	 animal.makeSound();
    	 animal.eat();
         animal.sleep();
     }
 }


 		public class Java1 {
 		public static void main(String[] args) {

	     Dog dog = new Dog("Buddy", 5);
	     Cat cat = new Cat("Whiskers", 3);
	     Shark shark = new Shark("Jaws", 10);
	     // Abstraction and Encapsulation
	     Animal[] zooAnimals = {dog, cat, shark};
	     Zoo myZoo = new Zoo(zooAnimals);

	     myZoo.performActivities();
	    
	 }
 }
}
