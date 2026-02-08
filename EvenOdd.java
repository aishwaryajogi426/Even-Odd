public class EvenOdd
{
    public static boolean ifEven(int a)
    {//using bitwise operator i.e adding 1 in binary to the number and then verifying
        if ((a & 1)==0)
            return true;
        else
            return false;
    }
    public static void main (String []args)
    {
        int a=1;
        //calling the method ifeven by giving value to the integer
        if (ifEven(a))
            System.out.print("even");
        else
            System.out.print("odd");
    }
}