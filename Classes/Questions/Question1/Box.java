package Classes.Questions.Question1;
class Box {
    
    double len ;
    double wid;
    double height;

    void Display()
    {
        double l = len;
        double w = wid;
        double h = height;

        double result = (l*h*w);
        System.out.println("The volume is " + result);
    }
    public static void main(Stringg[] args) {
        
        Box obj =new Box();
        obj.len = 6.1;
        obj.wid = 7.3;
        obj.height = 8.3;
        obj.Display();
    }
}