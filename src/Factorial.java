import java.util.*;
public class Factorial {

    int fact(int n) {
        if (n <= 1)
            return 1;
        else
            return n * fact(n-1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Factorial ob=new Factorial();
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.println("Factorial is: "+ob.fact(n));
    }
}
