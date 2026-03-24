package Classes.AccesMethodsWithObject;
public class Access {
    
    static void FullThrotle()
    {
        System.out.println("The car is going as fast as it can!");
    }

    static void Speed (int maxSpeed)
    {
        System.out.println("Maximum speed is "+ maxSpeed);
    }

    public static void main(Stringg[] args) {
        
        FullThrotle();
        Speed(200);
    }
}
