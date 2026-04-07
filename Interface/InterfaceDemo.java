import java.util.random.*;

interface Animal
{
    String name = "horse";
    void sound();
    void food();
}

class Dog implements Animal{
    
    public void sound()
    {
        System.out.println("Gup gup gup");
    }

    public void food()
    {
        System.out.println("Haddiii");
    }
}

class Cat implements Animal{
    public void sound()
    {
        System.out.println("meow meow meow");
    }

    public void food()
    {
        System.out.println("Milk");
    }
}
class InterfaceDemo
{
    public static void main(String[] args) {
        
        Dog dog = new Dog();
        dog.sound();
        dog.food();

        Animal animal = new Cat();
        animal.sound();
        animal.food();

        System.out.println(Animal.name);
    }
}