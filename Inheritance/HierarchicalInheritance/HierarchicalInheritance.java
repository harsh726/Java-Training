package Inheritance.HierarchicalInheritance;
class Animal{
    public void eat(){
        System.out.println("From Animal Parent class eats food?");
    }
}
class Dog extends Animal{
    public void bone(){
        System.out.println("Dog eat bone.");
    }
}
class Cat extends Animal{
    public void fish(){
        System.out.println("Cat eat Fish.");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
        c.fish();

        Dog d = new Dog();
        d.eat();
        d.bone();
    }
}
