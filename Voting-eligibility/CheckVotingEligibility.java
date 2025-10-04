
import java.util.Scanner;
class CheckVotingEligibility 
{
    void voting()
    {
        Scanner s=new Scanner(System.in);
        int age;
        System.out.println("Enter your age: ");
        age=s.nextInt();
        if(age>=18)
        {
            System.out.println("You are eligible to vote.");
        }
        else 
        {
            System.out.println("You are not eligible to vote.");   
        }
        s.close();
    }
    public static void main(String [] args)
    {
        EligibleVoting e=new EligibleVoting();
        e.voting();
    }
}
