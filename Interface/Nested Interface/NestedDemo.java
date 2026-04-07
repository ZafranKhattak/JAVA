interface myInterface
{
    void method1();
    void method2();

    interface nested{
             void method3();
}
}

class myClass implements myInterface.nested
{
        public void method3()
        {
            System.out.println("Method 3 has been called");
        }
}

class NestedDemo
{
    public static void main(String[] args) {
        
        myClass nestedDemo = new myClass();
        nestedDemo.method3();
    }
}