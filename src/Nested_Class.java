public class Nested_Class {
    private static int a=5;

    class nested {
        void show() {
            System.out.println("a: " + a);
            System.out.println("Static called");
        }
    }

    public static void main(String args[])
    {
        Nested_Class ob=new Nested_Class();
        nested in=ob.new nested();
        in.show();
    }
}
