import java.util.Scanner;

public class UserInputGreaterThanTwoNumbers 
{
    public void findGreaterNumber() 
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = s.nextInt();
        System.out.print("Enter Second number: ");
        int b = s.nextInt();
        
        if (a > b) 
        {
            System.out.println(a + " is greater than " + b);
        } 
        else if (a < b) 
        {
            System.out.println(b + " is greater than " + a);
        } 
        else 
        {
            System.out.println("Both numbers are equal.");
        }
        s.close();
    }

    public static void main(String[] args) 
    {
        UserInputGreaterThanTwoNumbers g = new UserInputGreaterThanTwoNumbers();
        g.findGreaterNumber();
    }
}
