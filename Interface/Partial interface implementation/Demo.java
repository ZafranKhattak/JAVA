interface myInterface
{
    void method1();
    void method2();
}

abstract class myClass implements myInterface
{
    public void method1()
    {
        System.out.println("Method 1 call in myClass");
    }
}

class youClass extends myClass
{
    public void method2()
    {
        System.out.println("Method 2 has been called");
    }
}

class Demo
{
    public static void main(String[] args) {
        
        myInterface myinter = new youClass();
        myinter.method1();
        myinter.method2();
    }
}