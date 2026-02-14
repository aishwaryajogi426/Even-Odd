class SumN
{
    public static int Sum(int s)
        {
            int sum=0;
            //using for loop for natursl numbers
            for(int i =s; i>0; i--)
            {
                sum=sum+i;
            }
            return sum;
        }
    public static void main(String[] args) {
        int s=7;
        System.out.println(Sum(s));
    }

}
