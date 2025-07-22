

class SimplePrimeNumberTest
{
    public static void main(String [] args)
    {
        int num=7;
        int temp=0;

        if (num <= 1) 
        {
            temp = 1; // to indicate it's not prime
        } 
        else 
        {
            for (int i = 2; i <= num - 1; i++) 
            {
                if (num % i == 0) 
                {
                    temp = temp + 1;
                }
            }
        }

        if (temp == 0) 
        {
            System.out.println(num + " is prime");
        } 
        else 
        {
            System.out.println(num + " is not a prime number");
        }
       }
}