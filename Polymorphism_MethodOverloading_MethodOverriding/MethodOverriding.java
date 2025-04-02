package Polymorphism_MethodOverloading_MethodOverriding;

class Animal{
    public void sound(){
        System.out.println("Some Sound from Parent class.");
    }
}
class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Some Sound from Child class. Bhawwww! Bhawwww! Bhawwww!");
    }
}
class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Some Sound from Second Child class. Meows! Meows! Meows!");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();

        Cat c = new Cat();
        c.sound();
    }
}
