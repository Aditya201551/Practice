public class StringB {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("Hello Java");
        s.replace(6,10,"World");
        System.out.println("Replaced: "+s);
        System.out.println(s.capacity());
        s.ensureCapacity(50);
        System.out.println(s.capacity());
    }
}
