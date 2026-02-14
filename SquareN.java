public class SquareN
{
    public static int Sum(int sn)
    {
        int sum=0;
        //Using for loop for natural numbers
        for(int i=1;i<=sn;i++)
        //squaring and adding the natural numbers    
            sum += (i*i);
        return sum;
    }
    public static void main(String[] args) {
        int sn=8;
        System.out.println(Sum(sn));
    }


}
