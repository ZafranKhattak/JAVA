/*
Scanner is used for taking input
BufferedReader is also used for taking input
*/

import java.util.Scanner;

class Input
{
    public static void main(String arg[])
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter your name... ");
        String name = inp.nextLine();
        System.out.println("My name is " + name);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age... ");
        int age = in.nextInt();
        System.out.println("My age is " + age);
        inp.close();
    }
}