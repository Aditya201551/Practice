public class ThisKeyword
{
    public static void main(String[] args) {
        employee ob=new employee("Tom",52525);
        ob.show("Max",655684);
    }
}

class employee
{
    String name;
    int id;

    employee(String name, int id)
    {
        this.name = name;
        this.id=id;
    }
    void show(String name, int id)
    {
        System.out.println("Local:\n"+name+" "+id);
        System.out.println("Global:\n"+this.name+" "+this.id);
    }
}