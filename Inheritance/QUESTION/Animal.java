class Animal
{
    void makeSound()
    {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal
{
    void makeSound()
    {
        super.makeSound();
        System.out.println("Bark");
    }

    public static void main(String[] args) {
        
        Dog dog = new Dog();

        dog.makeSound();
    }
}