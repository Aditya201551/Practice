public class RecursionTesting

{

    static int num=5;

    public static void main(String[] args)

    {

        new RecursionTesting().recursiveMethod();

    }



    void recursiveMethod()

    {

        num--;

        if(num == 0)

            return;

        System.out.print(num + " ");

        recursiveMethod();

    }

}