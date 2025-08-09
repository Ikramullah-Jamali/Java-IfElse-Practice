import java.util.Scanner;

// Topic: Conditional Statements (if-else)
public class DiceOppositeFace_IfElse 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number (1 to 6): ");
        int n = s.nextInt();

        if (n == 1) 
        {
            System.out.println("n = 1, Opposite face = 6");
        } 
        else if (n == 2) 
        {
            System.out.println("n = 2, Opposite face = 5");
        } 
        else if (n == 3) 
        {
            System.out.println("n = 3, Opposite face = 4");
        } 
        else if (n == 4) 
        {
            System.out.println("n = 4, Opposite face = 3");
        } 
        else if (n == 5) 
        {
            System.out.println("n = 5, Opposite face = 2");
        } 
        else if (n == 6) 
        {
            System.out.println("n = 6, Opposite face = 1");
        } 
        else 
        {
            System.out.println("Given number is not on a cubic dice.");
        }
    }
}