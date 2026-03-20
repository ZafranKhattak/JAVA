public class Student {
    
    String [] subjectName;

    Student(String[] subjectNames)
    {
        this.subjectName = subjectNames;
    }

    void display()
    {
        for (String names: subjectName)
        {
            System.out.println(names);
        }
    }

    public static void main(String[] args) {
        
        String [] subject = {"Math", "Science", "English"};
        Student s1 = new Student(subject);
        s1.display();
    }
}


// Two-Dimensional Arrays (2D Arrays)

class TwoDimensional
{
    
}