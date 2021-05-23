public class Factorial {
    int n;
    Factorial()
    {
        n=5;
    }

    Factorial(int n)
    {
        this.n=n;
    }

    int fact()
    {
        int result=1;
        for(int i=1;i<=n;i++)
            result*=i;
        return result;
    }
    public static void main(String[] args)
    {
        Factorial a=new Factorial();
        Factorial b=new Factorial(10);
        System.out.println("Non parameter: "+a.fact());
        System.out.println("Parameter: "+b.fact());
    }
}
