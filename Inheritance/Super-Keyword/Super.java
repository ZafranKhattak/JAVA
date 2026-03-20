// =============== VARIABLE & MEHTOD CASE =========================
// ===============  NEED TO EXPLICITLY USE SUPER KEYWORD =================

class Super {
    int x = 10;
}

class Access extends Super
{
    int x = 45;

    void display()
    {
        System.out.println(super.x);
    }

    public static void main(String[] args) {
        
        Access inp = new Access();

        inp.display();

        Child c = new Child();
    }
}

// =============== CONSTRUCTOR CASE =========================
// =============== NO NEED TO IMPLICITLY USE SUPER KEYWORD =================

class Parent 
{
    Parent()
    {
        System.out.println("PARENT CONSTRUCTOR CALLED");
    }
}

class Child extends Parent
{
    Child()
    {
        System.out.println("CHILD CONSTRUCTOR CALLED");
    }
}

