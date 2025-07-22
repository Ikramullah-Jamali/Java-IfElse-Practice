

import java.util.Scanner;
class CheckPrimeNumberWithUserInput
{

   public static void main(String [] args)
 
      {
          
          Scanner s=new Scanner(System.in);
          System.out.println("Enter any number:");
          int num=s.nextInt();
          int temp=0;
         if (num <= 1) {
            temp = 1; // not a prime
        } else {
            for (int i = 2; i <= num - 1; i++) {
                if (num % i == 0) {
                    temp = temp + 1;
                }
            }
        }

        if (temp == 0) {
            System.out.println(num + " is prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
             s.close();
       }
}