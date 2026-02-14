import java.io.*;


class Table
{
    public static void multiply(int b)
    {
        //using for loop for the number of terms in the table
    
        for(int i=1;i<11;i++)
        {
            System.out.println(b+"*"+i+"="+b*i);
        }
    }
    public static void main(String[] args) {
        int b=6;
        multiply(b);
    }

}
