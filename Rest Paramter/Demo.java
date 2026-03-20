class Demo
{
    int  add(int ... b) // ... rest parameter
    {
        int sum = 0;

        for (int c : b)
        {
            sum +=c;
        }
        
        return sum;
    }

    double add (double ...a)
    {
        double sum = 0.0; 

        for (double i : a)
        {
            sum+=i;
        }

        return sum;
    }

    public static void main(String args[])
    {
        Demo inp = new Demo();
        
        int result = inp.add(1,2,3,4,5);
        System.out.println(result);

        double res = inp.add(1.2,3,4.5);
        System.out.println(res);
    }
}
