/*
class Buffer 
{
    int [] numbers;
    int count = 0;
    int size;

    Buffer(int size)
    {
        this.size = size;
        numbers = new int[size];
    }

    void add(int value)
    {
        numbers[count] = value;
        count = (count+1)%size;
        count++;
    }

    void display()
    {
        for (int i=0; i<size; i++)
        {
            System.out.println(numbers[i]);
        }
    }

    public static void main(String args[])
    {
        Buffer ab = new Buffer(5);
        ab.add(0);
        ab.add(1);
        ab.add(2);
        ab.add(3);
        ab.add(4);

        ab.display();
    }
}
 */

class Buffer 
{
    int [] num = new int[5]; ;
    int index;


    void add(int value)
    {
        num[index] = value;
        index = index % num.length;
        index++;
    }

    void display()
    {
        for (int i=0; i<num.length; i++)
        {
            System.out.println(num[i]);
        }
    }

    public static void main(String[] args) {
        
        Buffer abc = new Buffer();
        abc.num[0]= 1;
        abc.num[1]= 1;
        abc.num[2]= 1;
        abc.num[3]= 1;
        abc.num[4]= 1;
        abc.display();
    }
}