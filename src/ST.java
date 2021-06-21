import java.util.*;
public class ST {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        String s=String.valueOf(n);
        if(s.length()>=3)
            System.out.println(s.charAt(s.length()-2));
        else
            System.out.println(-1);
    }
}
