class Bank
{
    double getInterestRate()
    {
        return 0.0;
    }
}

class SBI extends Bank
{
    double getInterestRate()
    {
       
        return 6.5;
    }
}

class HDFC  extends Bank
{
    double getInterestRate()
    {
        
        return 7.2;
    }

}

class Test {
    public static void main(String[] args) {
       Bank inp[] = new Bank[2];
       inp[0] = new HDFC();
       inp[1] = new SBI();

       for (Bank b :inp )
       {
        System.out.println(b.getInterestRate());
       }
    }
}