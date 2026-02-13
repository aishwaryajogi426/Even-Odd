public class SquareN
{
    public static int Sum(int sn)
    {
        int sum=0;
        for(int i=1;i<=sn;i++)
            sum += (i*i);
        return sum;
    }
    public static void main(String[] args) {
        int sn=8;
        System.out.println(Sum(sn));
    }

}