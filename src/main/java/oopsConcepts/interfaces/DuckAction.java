package oopsConcepts.interfaces;

// Abstract class → IS-A relationship
// Dog IS-A Animal → use abstract class
abstract class Animal {
    String name;         // instance variable ✅
    abstract void makeSound();
    void breathe() { System.out.println("breathing"); } // non-abstract ✅
}

// Interface → CAN-DO relationship
// Duck CAN-DO flying, CAN-DO swimming → use interface
interface Flyable { void fly(); }
interface Swimmable { void swim(); }

class Duck extends Animal implements Flyable, Swimmable {
    @Override public void makeSound() { System.out.println("Quack"); }
    @Override public void fly() { System.out.println("Duck flying"); }
    @Override public void swim() { System.out.println("Duck swimming"); }
}

public class DuckAction{
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.makeSound(); // Quack
        duck.breathe();   // breathing
        duck.fly();       // Duck flying
        duck.swim();      // Duck swimming
    }
}
