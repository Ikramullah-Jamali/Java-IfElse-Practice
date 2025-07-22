
import java.util.Scanner;
class FindGreatestOfThreeNumbers
{ 
   public static void main(String [] args)
   { 
      Scanner s=new Scanner(System.in);
   
      System.out.println("Enter three numbers for comparing:");
      int a=s.nextInt();
      int b=s.nextInt();
      int c=s.nextInt();
   
      if (a>b && a>c )
      {
         System.out.println(a+" is greater.");
      }
      else if (b>c && b>a)
      { 
         System.out.println(b+" is greater.");
      }
      else 
      { 
        System.out.println(c+" is greater.");
      }
      s.close();
   }
}
    
            
   