public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Parent ob=new Child();
        ob.show();
    }
}

class Parent{
    int num=10;
    void show()
    {
        System.out.println("The number: "+num);
    }
}

class Child extends Parent{
    int num=20;
    void show()
    {
        System.out.println("The number: "+num);
    }
}