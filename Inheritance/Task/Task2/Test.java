class Employee
{
    String name;
    double salary;

    Employee(String nam , double salary)
    {
        this.name = nam;
        this.salary = salary;
    }

    void work()
    {
        System.out.println("Employee is working");
    }
}

class Manager extends Employee
{
    int teamSize;

    Manager(int teamSize)
    {
        super("Zafran Khan" , 89056.35);
        this.teamSize = teamSize;
    }

    void work()
    {
        System.out.println("Manager is managing a team of "+ teamSize + " people");
        super.work();
    }

}

class Test
{
    public static void main(String[] args) {
        
        Manager inp = new Manager(12);
        inp.work();
    }
}