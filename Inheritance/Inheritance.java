class Inheritance
{
    public static void main(String args[])
    {
        Car inp = new Car();

        inp.display();
        System.out.println("Car Brand: " + inp.brand + "\n" + "Car Name: " + inp.carName);

        System.out.println();

        Dog dog = new Dog();

        dog.bark();
        dog.eat();
        dog.sleep();

    }
}


class Vehicale
{
    String brand = "Ford";

    void display()
    {
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicale
{
    String carName = "BMW";

}

class Animal
{
    
    String name = "German Shefard";

    void eat()
    {
        System.out.println(name+" can eat");
    }

    void bark()
    {
        System.out.println(name+" can bark");
    }

    void sleep()
    {
        System.out.println(name+" can sleep");
    }
}

class Dog extends Animal
{

}