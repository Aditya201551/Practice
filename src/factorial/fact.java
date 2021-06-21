package factorial;

import factorial.fibo.fibonacci;
public class fact {
    int n;
    fact()
    {
        n=5;
    }

    void calculate()
    {
        int f=1;
        for(int i=1;i<=n;i++)
            f*=i;
        System.out.println(f);
    }
    public static void main(String args[])
    {
        fact ob=new fact();
        ob.calculate();
        fibonacci fb=new fibonacci();
        fb.calculate();
    }
}
