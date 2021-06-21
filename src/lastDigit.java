public class lastDigit {
    int addLastDigit(int a, int b)
    {
        return (a%10)+(b%10);
    }

    public static void main(String[] args) {
        lastDigit ob=new lastDigit();
                System.out.println(ob.addLastDigit(125, 658));
    }
}
