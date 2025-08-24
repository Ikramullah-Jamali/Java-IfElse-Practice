import java.util.Scanner;
public class EvenOrOdd_BitwiseOR
{
    public static void main(String[] args) 
    {
       
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int b=s.nextInt();
        if((b|1)>b)
        {
            System.out.println(b+" is Even.");
        }
        else
        {
            System.out.println(b+" is Odd.");
        }
        s.close();
    }
}
