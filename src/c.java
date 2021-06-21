public class c implements I2{
    public void show()
    {
        System.out.println("Name: "+name+" Roll: "+roll+" S1: "+s1+" S2: "+s2);
    }
    public static void main(String args[])
    {
        c ob=new c();
        ob.show();
    }
}
