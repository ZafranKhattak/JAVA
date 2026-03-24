package Classes;

class MultipleClasses {

    int speed = 180;

    class InnerMultipleClasses {
    
        public static void main(String arg[])
        {
            MultipleClasses obj = new MultipleClasses();
            System.out.print(obj.speed);
        }
    }
}
