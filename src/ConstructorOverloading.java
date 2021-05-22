public class ConstructorOverloading {
    public static void main(String args[])
    {
        student ob=new student();
        student ob2=new student(ob);

    }
}
class student{
    int roll;
    String name;

    student()
    {
        this(20,"Tom");
        roll=10;
        name="Max";
        show();
    }
    student(int roll, String name)
    {
        this.roll=roll;
        this.name = name;
        show();
    }
    student(student s)
    {
        this.name=s.name;
        this.roll=s.roll;
        show();
    }

    void show()
    {
        System.out.println(name+"\t\t"+roll);
    }
}