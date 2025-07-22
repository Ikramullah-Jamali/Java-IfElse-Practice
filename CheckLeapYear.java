
import java.util.Scanner;
class CheckLeapYear
{
   public static void main(String [] args)               
   {    
      /* Conditions: (1) divisible of 400
                     (2) divisible of 4 but not directly divisible by 100 */                                                                
                                                                        
      Scanner s=new Scanner(System.in);

      System.out.print("Enter a year: ");
      int year=s.nextInt();
      if((year % 400 == 0)||(year % 4 == 0 && year % 100 != 0) )
      { 
         System.out.println(year+" is leap year.");
      }
      else
      { 
         System.out.println(year+" is not leap year.");
      }
      s.close();
   }
}
