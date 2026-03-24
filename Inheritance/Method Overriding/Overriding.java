class Base 
{
    void method1()
    {
        System.out.println("MEHTOD1 IS CALLED FROM BASE");
    }
}

class Derived extends Base
{
    void method1()
    {
        System.out.println("MEHTOD1 IS CALLED FROM DERIVED");
    }
}


class Overriding
{
    public static void main(String[] args) {
        
        Derived derived = new Derived();
        derived.method1();

        Base base = new Base();
        base.method1();

       Base b = new Derived();
       b.method1();
    }
}