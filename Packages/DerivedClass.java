// package Packages;
// import Packages.Main;

class DerivedClass extends Main 
{
    public void display()
    {
        System.out.println("w: " + w);
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    public static void main(String[] args) {
        DerivedClass b = new DerivedClass();
        b.display();
    }
}