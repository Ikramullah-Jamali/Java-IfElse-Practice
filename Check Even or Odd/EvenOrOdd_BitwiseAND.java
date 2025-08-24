import java.util.Scanner;
public class EvenOrOdd_BitwiseAND 
{
    public static void main(String[] args) 
    {
       Scanner s=new Scanner (System.in);
        System.out.print("Enter a number: ");
        int c=s.nextInt();
        if((c&1)==1)
        {
            System.out.println(c+" is Odd.");
        }
        else
        {
            System.out.println(c+" is Even.");
        }
        s.close();
    }
}
