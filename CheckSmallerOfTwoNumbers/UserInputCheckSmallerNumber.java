
import java.util.Scanner;
public class UserInputCheckSmallerNumber 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=s.nextInt();
        System.out.println("Enter second number:");
        int b=s.nextInt();
        if(a>b)
        {
            System.out.println("Second number: "+b+" is smaller than: "+a);
        }
        else
        {
            System.out.println("First number: "+a+" is Smaller than: "+b);

        }
        s.close();
    }
}
