package Packages;

class Main
{
    public int w = 10;
    protected int x = 9;
    int y = 8;
    private int z = 7;

    public void showValues()
    {
        System.out.println("w: " + w);
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);
    }

    public static void main(String args[])
    {
        Main m1 = new Main();
        m1.showValues();
    }
}