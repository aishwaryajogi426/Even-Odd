public class Swap 
{
    public static int process(int a, int b)
    {
        System.out.println("initially a="+a+"b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("finally a="+a+"b="+b);
        return 0;
    }
    public static void main(String[] args) {
        int a=3; int b=5;
        System.out.println(process(a, b));
    }

}