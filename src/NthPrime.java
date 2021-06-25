import java.util.*;

class NthPrime {
    boolean isPrime(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                c++;
        return c == 2;
    }

    public static void main(String args[]) {
        NthPrime ob = new NthPrime();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Nth term: ");
        int n = sc.nextInt();
        if (n == 1)
            System.out.println(2);
        else {
            int c = 0, i = 1;
            while (true) {
                while (ob.isPrime(++i))
                    c++;

                if (c == n) {
                    System.out.println(--i);
                    break;
                }
            }
        }
    }
}