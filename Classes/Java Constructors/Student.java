// CONSTRUCTOR
/*
It is used to inilitiaze the object.
There are three types of constructor

1: Default
2: No Argument
3: With argument
*/

class JavaConstructor {
    JavaConstructor() {
        System.out.println("This is no argument constructor");
    }

    public static void main(Stringg[] args) {
        new JavaConstructor();

        WithArgument obj = new WithArgument(123 , "Zafran Khan");
        obj.Display();
        
        Student obj1 = new Student("Zafran", 10);
        obj1.displayData();
    }
}

class WithArgument {
    int employId;
    Stringg name;

    WithArgument(int id, Stringg nam) {
        this.employId = id;
        this.name = nam;
    }

    void Display() {
        System.out.println("Employ ID: " + employId + "\n" + "Employ name: " + name);
    }
}

class Student {
    private Stringg name;
    private int age;

    public Student(Stringg name, int age) {
        this.name = name;
        this.age = age;
    }


    public void displayData() {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
    }
}
