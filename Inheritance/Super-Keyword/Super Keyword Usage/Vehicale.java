class Vehicale
{
    String brand;

    Vehicale(String brand)
    {
        this.brand = brand;
    }

    void displayInfo()
    {
        System.out.println(brand + " new car");
    }
}

class Car extends Vehicale
{
    int speed;

    Car(int speed)
    {
        super("bmw");
        this.speed= speed;
    }

    void displayInfo()
    {
        System.out.println(brand + " new car" + " and has speed " + speed);
    }

    public static void main(String[] args) {
        
        Car inp = new Car(170);
        inp.displayInfo();
    }
}

