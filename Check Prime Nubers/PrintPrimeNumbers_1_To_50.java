public class PrintPrimeNumbers_1_To_50 
{
    PrintPrimeNumbers_1_To_50()
    {
        int a=1,b=50,temp;
        System.out.println("Prime numbers from "+a+" to "+b+" are: ");
        for(int x=2;x<b;x++)
        {
            temp=1;
            for(int y=2;y*y<=x;y++)
            {
                if(x%y==0)
                {
                    temp=0;
                    break;
                }
            }
            if(temp==1)
            {
                System.out.println(x+" ");
            }
        }
    }   
    public static void main(String[] args) 
    {
        PrintPrimeNumbers_1_To_50 f=new PrintPrimeNumbers_1_To_50();
    }
}
