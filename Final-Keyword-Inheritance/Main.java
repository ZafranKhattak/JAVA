final class Parent
{
    String name;
    int age;

    void walking()
    {
        System.out.println("I can walk");
    }
}

/*
class Child extends Parent
{
       // THIS CANNOT INHERIT FROM FINAL
}
 */

class Animal
{
    final void eat()
    {
        System.out.println("Animal can eat");
    }

    void sleep()
    {
        System.out.println("Animal can sleep");
    }
}

class Cat extends Animal 
{
    /*
    void eat()
    {
        System.out.println("Can can eat");   // this cannot overriding
    }
         */

    void sleep()
    {
        System.out.println("Cat can sleep");
    }

    void play()
    {
        System.out.println("cat can play");
    }
}

class Main
{
    public static void main(String[] args) {
        
        Animal animal = new Cat();
        animal.eat();
        animal.sleep();
    }
}